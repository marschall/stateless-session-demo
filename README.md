StatelessSession Demo
=====================

Demo application for using Hibernate StatelessSession.

    ./mvnw spring-boot:run

http://127.0.0.1:8080/exists

```
java.lang.ClassCastException: class org.springframework.orm.jpa.EntityManagerHolder cannot be cast to class org.springframework.orm.jpa.hibernate.SessionHolder (org.springframework.orm.jpa.EntityManagerHolder and org.springframework.orm.jpa.hibernate.SessionHolder are in unnamed module of loader 'app')
	at org.springframework.orm.jpa.hibernate.HibernateTransactionManager.doGetTransaction(HibernateTransactionManager.java:395) ~[spring-orm-7.0.9.jar:7.0.9]
	at org.springframework.transaction.support.AbstractPlatformTransactionManager.getTransaction(AbstractPlatformTransactionManager.java:379) ~[spring-tx-7.0.9.jar:7.0.9]
	at org.springframework.transaction.interceptor.TransactionAspectSupport.createTransactionIfNecessary(TransactionAspectSupport.java:628) ~[spring-tx-7.0.9.jar:7.0.9]
	at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:365) ~[spring-tx-7.0.9.jar:7.0.9]
	at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:130) ~[spring-tx-7.0.9.jar:7.0.9]
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179) ~[spring-aop-7.0.9.jar:7.0.9]
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:719) ~[spring-aop-7.0.9.jar:7.0.9]
	at com.acme.stateless.session.demo.CityService$$SpringCGLIB$$0.existsCity42(<generated>) ~[classes/:na]
	at com.acme.stateless.session.demo.CityController.exists(CityController.java:20) ~[classes/:na]
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:252) ~[spring-web-7.0.9.jar:7.0.9]
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:184) ~[spring-web-7.0.9.jar:7.0.9]
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117) ~[spring-webmvc-7.0.9.jar:7.0.9]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:934) ~[spring-webmvc-7.0.9.jar:7.0.9]
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:853) ~[spring-webmvc-7.0.9.jar:7.0.9]
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:86) ~[spring-webmvc-7.0.9.jar:7.0.9]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:963) ~[spring-webmvc-7.0.9.jar:7.0.9]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:866) ~[spring-webmvc-7.0.9.jar:7.0.9]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1000) ~[spring-webmvc-7.0.9.jar:7.0.9]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:892) ~[spring-webmvc-7.0.9.jar:7.0.9]
```
