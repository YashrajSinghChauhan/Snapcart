package com.snapcart;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@SpringBootApplication
public class SnapCartApplication {
	
	public static void main(String[] args) {
		 ConfigurableApplicationContext context = SpringApplication.run(SnapCartApplication.class, args);
		 RequestMappingHandlerMapping handlerMapping = context.getBean(RequestMappingHandlerMapping.class);
	    	Map<RequestMappingInfo, HandlerMethod> map = handlerMapping.getHandlerMethods();
		    map.forEach((info, method) -> {
		        System.out.println(info + " YY  => " + method);
		    });
	}

}
