# DemoSpringMVC

Author: 
Dr. YUHANG ZHAO

Introduction:
This demo intends to supply a quick-start template with commented explanation for Spring MVC projects.

Work Flow:
- index.jsp is the start page of the web site where it has access to requesting for web service;
- web.xml specifies servlets information including name, type and url-pattern for handling requests;
- dispatch-servlet.xml has the file name begin with the servlet name specified in web.xml. 
  It contains the online schema for servlet and the package name for where the CONTROLLERs are located;
- MathController.java contains the methods annotated with RequestMapping 
  to handle the particular requests with parameters by calling services in MODEL;
- MathService supplies the service (calculation), 
  according to the principle that business logic (MODEL) should be separated from CONTROLLER;
- displayResult.jsp is the VIEW to show result;
- pom.xml contains project dependencies which are jar files integrated by Maven;
An alternative approach is to replace the configuration in web.xml/dispatch-servlet 
by using annotation configuration in java files MyWebInitializer.java and DispatchConfig.java: 
- MyWebInitializer.java replaces web.xml;
- DispatchConfig.java replaces dispatch-servlet.xml;

Future Work:
Expand this template with front-end construction using Modern JS framework Angular6. 

System Configuration:
- Windows 7
- Eclipse 4.12.0
- Apache Tomcat v9.0
- Spring-webmvc 4.1.8.RELEASE
