package com.classes.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;


@Entity
@Table(name="country")
public class Country {
    @Id
    //@TableGenerator(name="id", table="idinfo", pkColumnName = "keyid", pkColumnValue = "value", allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.TABLE, generator="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Country() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
