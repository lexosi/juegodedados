package com.juegodedados.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")    
    private String name;
    @Column(name = "registration_date")
    private Date registrationDate;
    @Column(name = "password")
    private String password;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        this.registrationDate = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPassword() {
        return password;
    }

}