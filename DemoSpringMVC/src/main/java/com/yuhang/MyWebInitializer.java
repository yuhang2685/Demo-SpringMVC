package com.yuhang;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
** YH: 
** In order to use "Annotation configuration" using java files,
** we use this MyWebInitializer.java together with DispatchConfig.java 
** to replace web.xml and dispatch-servlet.xml (work if you delete their contents).
** This file replace web.xml.
*/

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// The method below specifies which is configuration class.
	@Override
	protected Class<?>[] getRootConfigClasses() {		
		return new Class[] {DispatchConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {DispatchConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// YH: {"/"} means it handles all requests.
		return new String[] {"/"};
	}

}

