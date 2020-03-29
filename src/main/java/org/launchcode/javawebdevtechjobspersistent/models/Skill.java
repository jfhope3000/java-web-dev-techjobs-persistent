package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.persistence.*;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Skill is required")
    @Size(min = 2, max = 360)
    private String skill;

    public String getSkill() { return skill; }

    public void setLocation(String name) { this.skill = skill; }

    public Skill() {
    }

}