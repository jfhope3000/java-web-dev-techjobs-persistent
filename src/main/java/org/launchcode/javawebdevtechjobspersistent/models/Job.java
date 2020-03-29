package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
public class Job{

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private Employer employer;
    private String skills;

    public Job() {
    }

    public Job(Employer anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Job(Optional optEmployer) {
    }

    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setSkills(List<Skill> skillObjs) {
    }
}
