package com.acme.stateless.session.demo;

import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Long>, CustomizedCityRepository {
}
