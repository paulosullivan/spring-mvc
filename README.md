# spring-mvc
Vanilla Spring MVC Project

WIP!!!
Project not completed !!!

General
=======
This project will outline how to use Spring MVC to implement a simple web application.
The aim of this project is to ascertain how easy it would be to migrate from Struts to Spring MVC.

It uses the following technologies:

Web APIs
=========
1) Spring Web MVC
2) JSTL
3) Servlet API 3.0 (i.e. JEE 7)
   3.1 is now available.

Misc APIs / Specifications
==========================
1) Spring Framework 4.1.4 (plus Java configuration instead of XML)
4) Maven 3
5) Maven Jetty Plugin v8 (you need to use v8 or above to support Java 6+ and the servlet 3.0 API)
   v9 is now available
   
Local Deployment
================
No need for a standalone servlet container (given our use of the Maven Jetty Plugin).
In eclipse, simply right-click on your project -> Run As -> Run Configurations -> Maven Build, and add jetty:run to the Goals textbox.
Navigate to http://localhost:8080/spring-mvc/healthCheck (to check if the app is up).

Extra Documentation
===================
http://www.dineshonjava.com/2014/02/spring-4-framework-hello-world-example.html#.VTPUHCHBzRY
http://stackoverflow.com/questions/5367309/cant-get-spring-mvc-dispatcher-to-work-properly-when-url-pattern-is-a-path
