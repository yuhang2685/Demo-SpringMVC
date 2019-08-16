package com.yuhang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
** YH: 
** In order to use "Annotation configuration" using java files,
** we use this DispatchConfig.java together with MyWebInitializer.java 
** to replace web.xml and dispatch-servlet.xml (work if you delete their contents).
** This file replace dispatch-servlet.xml. 
*/

@EnableWebMvc
@Configuration

// YH: The annotation below has the same functionality as <ctx:component-scan base-package="com.yuhang"> in dispatch-servlet.xml
@ComponentScan({"com.yuhang"})
// YH: Note that "extends WebMvcConfigurerAdapter" 
//     will make it easier to navigate applications (remember to work with permission @EnableWebMvc).

public class DispatchConfig extends WebMvcConfigurerAdapter{

	// YH: We have to give the configuration for views as below.
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");		
		vr.setSuffix(".jsp");
		
		return vr;
	}

}
