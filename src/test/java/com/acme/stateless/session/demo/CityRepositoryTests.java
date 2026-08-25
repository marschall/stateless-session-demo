package com.acme.stateless.session.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertFalse;

@EnableAutoConfiguration
@SpringJUnitConfig(ApplicationConfiguration.class)
@DataJpaTest
class CityRepositoryTests {

    @Autowired
    private CityRepository cityRepository;

    @Test
    void exists() {
        assertFalse(this.cityRepository.exists(42L));
    }

}
