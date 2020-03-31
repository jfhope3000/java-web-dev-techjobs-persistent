package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.*;
import java.util.*;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Skill is required")
    @Size(min = 2, max = 360)
    private String description;

    @ManyToMany(mappedBy="skills")
    private List<Job> jobs = new ArrayList<>();

    private List getJobs() { return jobs; }

    public String getSkill() { return description; }

    public void setSkill(String name) { this.description = description; }

    public Skill() {
    }

}