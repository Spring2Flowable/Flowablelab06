package com.shareniu.flowable.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.flowable.job.service.impl.asyncexecutor.AsyncExecutor;
import org.flowable.spring.SpringProcessEngineConfiguration;
import org.flowable.spring.boot.FlowableMailProperties;
import org.flowable.spring.boot.FlowableProperties;
import org.flowable.spring.boot.ProcessEngineAutoConfiguration;
import org.flowable.spring.boot.idm.FlowableIdmProperties;
import org.flowable.spring.boot.process.FlowableProcessProperties;
import org.flowable.spring.boot.process.Process;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
@Configuration
@EnableConfigurationProperties(FlowableProperties.class)
public class ShareniuDataSourceProcessEngineAutoConfiguration  extends ProcessEngineAutoConfiguration {

	public ShareniuDataSourceProcessEngineAutoConfiguration(FlowableProperties flowableProperties,
			FlowableProcessProperties processProperties, FlowableIdmProperties idmProperties,
			FlowableMailProperties mailProperties) {
		super(flowableProperties, processProperties, idmProperties, mailProperties);
	}
	@Bean
    public SpringProcessEngineConfiguration springProcessEngineConfiguration(DataSource dataSource, PlatformTransactionManager platformTransactionManager,
        @Process ObjectProvider<AsyncExecutor> asyncExecutorProvider) throws IOException {

       SpringProcessEngineConfiguration conf = super.springProcessEngineConfiguration(dataSource, platformTransactionManager, asyncExecutorProvider);
        return conf;
    }
	
    
}
