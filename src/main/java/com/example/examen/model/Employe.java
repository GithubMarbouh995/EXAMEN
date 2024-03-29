package com.example.examen.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "Employe")
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    @ElementCollection
    private ArrayList<String> skill;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "employe_project",
            joinColumns = @JoinColumn(name = "employe_id"),
            inverseJoinColumns = @JoinColumn(name = "projet_id"))
    private List<Project> projects;

    public Employe() {
    }

    public Employe(long id, String name, String email, List<String> skill) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skill = (ArrayList<String>) skill;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSkill() {
        return skill;
    }

    public void setSkill(List<String> skill) {
        this.skill = (ArrayList<String>) skill;
    }
}
