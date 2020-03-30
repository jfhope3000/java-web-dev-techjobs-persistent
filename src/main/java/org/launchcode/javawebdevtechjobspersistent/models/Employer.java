package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;
import java.util.*;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(min = 2, max = 360)
    private String location;

    @OneToMany
    @JoinColumn(name="employer_id", referencedColumnName = "ID")
    List<Job> jobs = new ArrayList<>();

    public String getLocation() {
        return location;
    }

    public void setLocation(String name) {
        this.location = location;
    }

    public Employer() {
    }

    public List getJobs() {
        return jobs;
    }

    public void setJobs(List jobs) {
        this.jobs = jobs;
    }

}
