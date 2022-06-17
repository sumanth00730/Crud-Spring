package com.example.demo;

import javax.persistence.*;

@Entity

@Table(name="kavulu")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    @Column(length = 30,nullable = false)
    private String name;

    @Column(length = 100,nullable = false)
    private String description;

    @Column(length = 30,nullable = false)
    private String email;

    public Model() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Model(String name, String description, String email) {
        this.name = name;
        this.description = description;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
