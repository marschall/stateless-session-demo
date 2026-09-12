package com.acme.stateless.session.demo;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class CityService {

    private final CityRepository cityRepository;

    CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public boolean existsCity(long cityId) {
        return this.cityRepository.exists(cityId);
    }

}
