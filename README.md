# DemoSpringMVC

Author: 
Dr. YUHANG ZHAO

Introduction:
This demo intends to supply a quick-start code base with explanation for the feature of Spring MVC.

Big Picture:
- index.jsp is the start page of the web site where it has access to requests for web services;
- web.xml specifies servlets information including names, types and url-patterns for handling requests;
- dispatch-servlet.xml has the file name begin with the servlet name specified in web.xml. 
  It contains the online schema for servlet and the package where the CONTROLLERs are located;
- MathController.java contains the methods annotated by @RequestMapping 
  to handle the particular requests by calling the corresponding services in MODEL;
- MathService supplies the service (computation), 
  according to the principle that the business logic should be separated from CONTROLLER and located in MODEL;
- displayResult.jsp is VIEW to display the result of request;
- pom.xml contains project dependencies, which are jar files integrated by Maven;

An alternative approach is called annotation configuration. 
It replaces the configuration in web.xml and dispatch-servlet by java files MyWebInitializer.java and DispatchConfig.java: 
- MyWebInitializer.java replaces web.xml;
- DispatchConfig.java replaces dispatch-servlet.xml;

Future Work:
Expand this template with front-end code base using Modern JS frameworks. 

System Configuration:
- Windows 7
- Eclipse 4.12.0
- Apache Tomcat v9.0
- Spring-webmvc 4.1.8.RELEASE

Reference:
"Spring MVC Tutorial | Full Course" by Telusko.
https://www.youtube.com/watch?v=g2b-NbR48Johttps://www.youtube.com/watch?v=g2b-NbR48Jo
