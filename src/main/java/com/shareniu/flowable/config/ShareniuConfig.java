package com.shareniu.flowable.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;
@Configuration
public class ShareniuConfig {
	@Autowired
	private ShareniuDataSourceConfig shareniuDataSourceConfig;
	@Autowired
	private CommonDataSourceConfig commonDataSourceConfig;
	@Bean(name="shareniuDataSource")
	@Primary
	public DataSource shareniuDataSource() {
		DruidDataSource ds=new DruidDataSource();
		ds.setUrl(shareniuDataSourceConfig.getUrl());
		ds.setUsername(shareniuDataSourceConfig.getUsername());
		ds.setPassword(shareniuDataSourceConfig.getPassword());
		ds.setDriverClassName(shareniuDataSourceConfig.getDriverClassName());
		
		ds.setInitialSize(commonDataSourceConfig.getInitialSize());
		ds.setMinIdle(commonDataSourceConfig.getMinIdle());
		ds.setMaxActive(commonDataSourceConfig.getMaxActive());
		ds.setTestOnBorrow(commonDataSourceConfig.isTestOnReturn());
		ds.setTestOnReturn(commonDataSourceConfig.isTestOnReturn());
		ds.setMinEvictableIdleTimeMillis(commonDataSourceConfig.getMinEvictableIdleTimeMillis());
		return ds;
	}
	
	@Bean
	public DataSourceTransactionManager  shareniuDataSourceTransactionManager(@Qualifier("shareniuDataSource")DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	
	@Bean(name="shareniuSqlSessionFactory")
	@Primary
	public SqlSessionFactory shareniuSqlSessionFactory(@Qualifier("shareniuDataSource")DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactoryBean=new SqlSessionFactoryBean();
		
		sessionFactoryBean.setDataSource(dataSource);
		
		Resource resource = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/mybatis-config.xml");
		sessionFactoryBean.setConfigLocation(resource);
		
		Resource[] mapperLocations = new PathMatchingResourcePatternResolver().getResources
				("classpath:mybatis/mapper/shareniu/*.xml");
		sessionFactoryBean.setMapperLocations(mapperLocations);
		return sessionFactoryBean.getObject();
	}
	
	@Bean(name="shareniuSqlSessionTemplate")
	public SqlSessionTemplate shareniuSqlSessionTemplate(@Qualifier("shareniuSqlSessionFactory")SqlSessionFactory sqlSessionFactory) {
		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
		return sqlSessionTemplate;
	}
	
	
}
