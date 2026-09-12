package com.acme.stateless.session.demo;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceUnitUtil;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class CityService {

    private final CityRepository cityRepository;
	private final StateRepository stateRepository;
    private final PersistenceUnitUtil persistenceUnitUtil;

    CityService(CityRepository cityRepository, StateRepository stateRepository, EntityManagerFactory entityManagerFactory) {
        this.cityRepository = cityRepository;
        this.stateRepository = stateRepository;
        persistenceUnitUtil = entityManagerFactory.getPersistenceUnitUtil();
    }

    public long insertCityAndStateAndReturnCityId() {
        var state = new State();
        state.setName("state");
        this.stateRepository.save(state);

        var city = new City();
        city.setName("city");
        city.setState(state);
        this.cityRepository.save(city);

        return (long) this.persistenceUnitUtil.getIdentifier(city);
    }
    
    public City getCity(long cityId) {
        return this.cityRepository.findById(cityId).get();
    }

    public boolean existsCity(long cityId) {
        return this.cityRepository.exists(cityId);
    }

}
