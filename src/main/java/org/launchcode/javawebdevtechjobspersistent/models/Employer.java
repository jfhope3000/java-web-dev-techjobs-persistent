package org.launchcode.javawebdevtechjobspersistent.models;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;

@Entity
public class Employer extends AbstractEntity {

    @OneToOne
    @NotBlank(message = "Location is required")
    @Size(min = 2, max = 360)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String name) {
        this.location = location;
    }

    public Employer() {
    }



}
