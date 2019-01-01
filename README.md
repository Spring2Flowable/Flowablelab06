

------

***环境：***

**[tomcat8]()**

**[jdk1.8+]()**

[**flowable6.3.0**]()

------



## 一、创建数据库

　

```
CREATE DATABASE IF NOT EXISTS flowable-test  default charset utf8 COLLATE utf8_general_ci;
```



## 二、运行LiquiBaseTest类

- 修改/src/main/resources/sql/dataBase.xml文件中的数据库配置信息
- 运行LiquiBaseTest

<u>此类主要是创建四张基础表</u>



## 三、启动spring boot

- 修改环境配置

  修改/src/main/resources/application.properties

- 修改数据库配置

修改文件/src/main/resources/config/database/jdbc-shareniu-${profile}.properties

- 启动spring boot



## 四、执行init.sql脚本



## 五、测试

```
http://localhost:9100
```

**登录用户名、密码为init.sql脚本中配置的用户名和密码**