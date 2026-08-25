package com.acme.stateless.session.demo;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class CityService {

    private final CityRepository cityRepository;

    CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public boolean existsCity42() {
        return this.cityRepository.exists(42L);
    }

}
