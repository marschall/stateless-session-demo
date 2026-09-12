package com.acme.stateless.session.demo;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.context.annotation.Import;

@DataJpaTest
@Import(PersistenceConfiguration.class)
class CityRepositoryTests {

    @Autowired
    private CityRepository cityRepository;

    @Test
    void exists() {
        assertFalse(this.cityRepository.exists(42L));
    }

}
