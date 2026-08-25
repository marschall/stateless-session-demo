package com.acme.stateless.session.demo;

import jakarta.persistence.EntityManagerFactory;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.hibernate.HibernateTransactionManager;
import org.springframework.orm.jpa.hibernate.SharedSessionCreator;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
public class ApplicationConfiguration {

    @Bean
    public HibernateTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        var hibernateTransactionManager = new HibernateTransactionManager(entityManagerFactory.unwrap(SessionFactory.class));
        //hibernateTransactionManager.setHibernateManagedSession(true);
        return hibernateTransactionManager;
    }

    @Bean
    public StatelessSession statelessSession(EntityManagerFactory entityManagerFactory) {
        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
        return SharedSessionCreator.createSharedStatelessSession(sessionFactory);
    }

}
