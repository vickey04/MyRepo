package org.vvs.projects.trading.utility;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConsoleConfiguration {
	
	@Bean
	ServletRegistrationBean h2ConsoleHandlerServlet() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new WebServlet());
		servletRegistrationBean.addUrlMappings("/db/console/*");
		return servletRegistrationBean;
	}
}
