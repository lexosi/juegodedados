package com.juegodedados.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.Date;

@jakarta.persistence.Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private static String name;
    private Date registrationDate;
    private static String password;

    public Player() {
    }

    public Player(String name) {
        Player.name = name;
        this.registrationDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        Player.name = name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public static String getPassword() {
        return password;
    }

}