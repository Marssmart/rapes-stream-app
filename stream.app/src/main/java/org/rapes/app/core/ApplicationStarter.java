package org.rapes.app.core;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@PropertySource("application.properties")
public class ApplicationStarter{
	
	public static void main( String[] args )    {
 		SpringApplication.run(ApplicationStarter.class,args);
    }

 	@Bean
 	public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
 	    ServletRegistrationBean registration = new ServletRegistrationBean(
 	            dispatcherServlet);
 	    registration.addUrlMappings("/stream-app/*");
 	   
 	    return registration;
 	}

	
}
