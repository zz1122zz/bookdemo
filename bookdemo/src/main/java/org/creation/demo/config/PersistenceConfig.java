package org.creation.demo.config;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@PropertySource(value = { "classpath:application.properties"}, encoding = "UTF-8", ignoreResourceNotFound = false)
@MapperScan(basePackages = { "org.creation.demo.entity" }, sqlSessionFactoryRef = "sqlSessionFactory")
public class PersistenceConfig{

	@Resource
	public Environment env;

	@Bean(destroyMethod = "close", initMethod = "init", name = "dataSource")
	public DruidDataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();

		dataSource.setDriverClassName(env.getProperty("druid.driverClassName").trim());
		dataSource.setInitialSize(Integer.parseInt(env.getProperty("druid.initialSize").trim()));
		dataSource.setMinIdle(Integer.parseInt(env.getProperty("druid.minIdle").trim()));
		dataSource.setMaxActive(Integer.parseInt(env.getProperty("druid.maxActive").trim()));
		dataSource.setMaxWait(Long.parseLong(env.getProperty("druid.maxWait").trim()));
		dataSource.setTimeBetweenEvictionRunsMillis(Long.parseLong(env.getProperty("druid.timeBetweenEvictionRunsMillis").trim()));
		dataSource.setMinEvictableIdleTimeMillis(Long.parseLong(env.getProperty("druid.minEvictableIdleTimeMillis").trim()));
		dataSource.setValidationQuery(env.getProperty("druid.validationQuery").trim());
		dataSource.setTestWhileIdle(Boolean.valueOf(env.getProperty("druid.testWhileIdle").trim()));
		dataSource.setTestOnBorrow(Boolean.valueOf(env.getProperty("druid.testOnBorrow").trim()));
		dataSource.setTestOnReturn(Boolean.valueOf((env.getProperty("druid.testOnReturn").trim())));
		dataSource.setPoolPreparedStatements(Boolean.valueOf(env.getProperty("druid.poolPreparedStatements").trim()));
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(Integer.parseInt(env.getProperty("druid.maxPoolPreparedStatementPerConnectionSize").trim()));
		dataSource.setUrl(env.getProperty("druid.url").trim());
		dataSource.setUsername(env.getProperty("druid.user").trim());
		dataSource.setPassword(env.getProperty("druid.password").trim());

		try {
			dataSource.setFilters(env.getProperty("druid.filters"));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dataSource;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

		sqlSessionFactoryBean.setDataSource(dataSource());
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:org/creation/demo/entity/*Mapper.xml"));

		return sqlSessionFactoryBean.getObject();
	}

}
