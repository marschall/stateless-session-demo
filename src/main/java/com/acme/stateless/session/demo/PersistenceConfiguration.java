package com.acme.stateless.session.demo;

import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.hibernate.HibernateTransactionManager;
import org.springframework.orm.jpa.hibernate.SharedSessionCreator;

import jakarta.persistence.EntityManagerFactory;

@Configuration
public class PersistenceConfiguration {

  @Bean
  public HibernateTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
      return new HibernateTransactionManager(entityManagerFactory.unwrap(SessionFactory.class));
  }

  @Bean
  public StatelessSession statelessSession(EntityManagerFactory entityManagerFactory) {
      var sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
      return SharedSessionCreator.createSharedStatelessSession(sessionFactory);
  }

}
