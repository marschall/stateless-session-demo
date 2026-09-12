package com.acme.stateless.session.demo;

import static jakarta.persistence.FetchType.LAZY;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class State implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    protected State() {
        // no-args constructor required by JPA spec
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
