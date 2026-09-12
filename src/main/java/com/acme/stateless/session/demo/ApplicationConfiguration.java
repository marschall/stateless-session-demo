package com.acme.stateless.session.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@Import(PersistenceConfiguration.class)
public class ApplicationConfiguration {

}
