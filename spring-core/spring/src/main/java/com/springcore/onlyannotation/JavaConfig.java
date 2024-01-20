package com.springcore.onlyannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration /*Configuration file without XML*/
//@ComponentScan(basePackages = "com.springcore.onlyannotation") 
/*works same as in XML file but now here we are using @Bean so no need of this*/
public class JavaConfig {
	
	@Bean
	public Certificate getCertificate() {
		Certificate cer  = new Certificate();
		return cer;
	}
	
	/*creating student object*/
	/*using Bean to eliminate component
	*@Bean(name = {"student", "name"}) we can set the bean method name which is used inside Main
	*/
	@Bean 
	public  Student getStudent() {
		Student student = new Student(getCertificate()); /*from above Bean referring certificate*/
		return student;
	}
	
	
}
