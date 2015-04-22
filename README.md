# spring-mvc
Vanilla Spring MVC Project

WIP!!!
Project not completed !!!

General
=======
This project will outline how to use Spring MVC to implement a simple web application.
The aim of this project is to ascertain how easy it would be to migrate from Struts to Spring MVC.
In particular, how can we use the Java EE bean validation specification (in conjunction with Spring MVC) to validate user inputs.
At present it only contains 3 pages.
A start page (healthCheck).
An entry form for adding new vehicles (vehicleForm).
A confirmation page (vehicleConfirmation).

It uses the following technologies:

Web APIs
=========
1) Spring Web MVC 4.1.4
2) JSTL
3) Servlet API 3.0 (i.e. JEE 7)
   3.1 is now available.

Misc APIs / Specifications
==========================
1) Java EE Bean Validation (via the Hibernate Validation API)
2) Spring Framework 4.1.4 (plus Java configuration instead of XML)
3) Maven 3
4) Maven Jetty Plugin v8 (you need to use v8 or above to support Java 6+ and the servlet 3.0 API)
   v9 is now available
   
Local Deployment
================
No need for a standalone servlet container (given our use of the Maven Jetty Plugin).
In eclipse, simply right-click on your project -> Run As -> Run Configurations -> Maven Build, and add jetty:run to the Goals textbox.
Navigate to http://localhost:8080/spring-mvc/healthCheck (to check if the app is up).

Extra Documentation
===================
Generic Hello World App -> http://www.dineshonjava.com/2014/02/spring-4-framework-hello-world-example.html#.VTPUHCHBzRY
Validation Example -> http://www.mkyong.com/spring-mvc/spring-3-mvc-and-jsr303-valid-example/
Validation Example (JUnit) -> http://hibernate.org/validator/documentation/getting-started/
Path Issue -> http://stackoverflow.com/questions/5367309/cant-get-spring-mvc-dispatcher-to-work-properly-when-url-pattern-is-a-path
Validator Link -> http://hibernate.org/validator/documentation/getting-started/
Validator Link -> https://docs.jboss.org/hibernate/validator/4.0.1/reference/en/html/validator-usingvalidator.html
Thymeleaf Template Framework (Works well with Spring MVC) -> https://spring.io/blog/2012/10/30/spring-mvc-from-jsp-and-tiles-to-thymeleaf

TODO
====
1) Remove XML configuration files.
2) Add a templating framework, such as thymeleaf.
3) Move the DTOs to their own repo/project where they can be shared by all projects.
   This will also give me the opportunity to cut-down on the different levels of DTOs/domain classes,
   and see how the same class would appear if it contained annontations from different APIs (JSON, JPA, Validation, etc.) 
