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

    private Job employer;
    private String skills;

    public Job() {
    }

    public Job(Job anEmployer, String someSkills) {
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

    public Job getEmployer() {
        return employer;
    }

    public void setEmployer(Job employer) {
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
