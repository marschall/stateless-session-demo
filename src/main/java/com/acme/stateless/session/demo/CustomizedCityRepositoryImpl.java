package com.acme.stateless.session.demo;

import org.hibernate.StatelessSession;

class CustomizedCityRepositoryImpl  implements CustomizedCityRepository {

    private final StatelessSession statelessSession;

    CustomizedCityRepositoryImpl(StatelessSession statelessSession) {
        this.statelessSession = statelessSession;
    }

    @Override
    public boolean exists(long id) {
        return this.statelessSession.get(City.class, 1) != null;
    }

}
