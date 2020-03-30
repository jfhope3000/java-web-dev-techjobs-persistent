package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
public class Job extends AbstractEntity{

    private String name;

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills; {
        this.skills = skills;
    }


    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> skills) {
        super();
        this.employer = anEmployer;
        this.skills = skills;
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

    public List getSkills() {
        return skills;
    }

    public void setSkills(List skills) {
        this.skills = skills;
    }

}
