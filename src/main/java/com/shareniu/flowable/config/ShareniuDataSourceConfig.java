package com.shareniu.flowable.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="spring.datasource.shareniu")
@PropertySource(value="classpath:config/database/jdbc-shareniu-${spring.profiles.active}.properties"
,encoding="UTF-8"
,ignoreResourceNotFound=false
		)
public class ShareniuDataSourceConfig extends DataSourceConfig {
	@Override
	public String toString() {
		return super.toString();
	}
}
