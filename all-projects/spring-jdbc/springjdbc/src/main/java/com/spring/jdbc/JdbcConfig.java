package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
public class JdbcConfig {
	
	@Bean("datasource")
	public DriverManagerDataSource getDataSource () {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("1213");
		return dataSource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	}
	
	@Bean("studentDao")
	public StudentDao getStudentDao () {
		
		StudentDaoImpl studentDao = new StudentDaoImpl();
		
		studentDao.setJdbcTemplate(getJdbcTemplate());
		return studentDao;
		
	}
}
