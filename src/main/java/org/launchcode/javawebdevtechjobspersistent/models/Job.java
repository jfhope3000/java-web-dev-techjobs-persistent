package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;
import javax.persistence.*;

@Entity
public class Job extends AbstractEntity{

    private String name;

    @ManyToOne
    private Employer employer;

    @ManyToMany(mappedBy = "jobs")
    private Skill skills;

    public Job() {
    }

    public Job(Employer anEmployer) {
        super();
        this.employer = anEmployer;
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

    public void setSkills(List<Skill> args) {
    }
}
