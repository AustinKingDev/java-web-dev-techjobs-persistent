package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job{

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String employer;


    @ManyToMany
    private List<Skill> skills = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private Employer anEmployer;

    public Job() {
    }

    public Job(String anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
    }

    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
