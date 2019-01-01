package com.shareniu.flowable.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.idm.engine.impl.persistence.entity.UserEntityImpl;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shareniu.flowable.service.ActProcessTypeService;
import com.shareniu.flowable.service.ProcessDefService;
import com.shareniu.flowable.service.ShareniuTaskService;
import com.shareniu.flowable.util.Parametermap;

@Controller
@RequestMapping("/task")
public class TaskController extends BaseController {
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private ActProcessTypeService processTypeService;
	@Autowired
	private ProcessDefService processDefService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private ShareniuTaskService shareniuTaskService;
	@Autowired
	private org.flowable.engine.TaskService rowtaskService;
	Logger logger = LoggerFactory.getLogger(TaskController.class);
	
	
	@RequestMapping(value = "taskListPage")
	public Object taskListPage(HttpServletRequest request) {
		return "page/task/list";
	}
	
	@RequestMapping(value = "/list")
	@ResponseBody
	public Object contentpagelist(Model model) {

		Parametermap pm = getParametermap();
		UserEntityImpl user = (UserEntityImpl) getSession().getAttribute(Const.SESSION_USER);
	//	pm.put("rows", shareniuTaskService.taskListPage(user.getId()));
		pm.put("rows",shareniuTaskService.taskListPage(user.getId()));
		return pm;
	}
	
	@RequestMapping("/taskHandler")
	public String startFormPage(Model model, String taskId) {
		Task task = rowtaskService.createTaskQuery().taskId(taskId).singleResult();
		String executionId = task.getExecutionId();
		Map<String, Object> variables = runtimeService.getVariables(executionId);
		System.out.println(variables);
		model.addAttribute("taskId", taskId);
		model.addAllAttributes(variables);
		return "page/task/taskHandler";
	}
	
	@RequestMapping("/complete")
	public ModelAndView completeTask(Model model, String taskId) {
		Parametermap pm = this.getParametermap();
		pm.remove("taskId");
		rowtaskService.complete(taskId, pm);
		return new ModelAndView("redirect:taskListPage");
	}
	
	
	@RequestMapping(value = "taskHandleredListPage")
	public Object taskHandleredListPage(HttpServletRequest request) {

		/// flowable-web/src/main/resources/templates/page/task
		return "page/task/taskHandleredList";
	}

	@RequestMapping(value = "/taskHandleredList")
	@ResponseBody
	public Object taskHandleredList(Model model) {

		Parametermap pm = getParametermap();
		UserEntityImpl user = (UserEntityImpl) getSession().getAttribute(Const.SESSION_USER);
		pm.put("rows", shareniuTaskService.queryByUserIdPage(user.getId()));

		return pm;
	}
}
