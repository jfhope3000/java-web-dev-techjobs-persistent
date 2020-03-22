package org.launchcode.javawebdevtechjobspersistent.controllers;

import org.launchcode.javawebdevtechjobspersistent.models.Job;
import org.launchcode.javawebdevtechjobspersistent.models.Skill;
import org.launchcode.javawebdevtechjobspersistent.models.Employer;
import org.launchcode.javawebdevtechjobspersistent.models.data.JobRepository;
import org.launchcode.javawebdevtechjobspersistent.models.data.SkillRepository;
import org.launchcode.javawebdevtechjobspersistent.models.data.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.launchcode.javawebdevtechjobspersistent.models.JobData;
import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping(value = "list")
public class ListController {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private EmployerRepository employerRepository;

    static HashMap<String, String> columnChoices = new HashMap<>();

    public ListController () {

        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("skills", "Skills");

    }

    @RequestMapping("")
    public String list(Model model) {

        return "list";
    }

    @RequestMapping(value = "jobs")
    public String listJobsByColumnAndValue(Model model, @RequestParam String column, @RequestParam String value) {
        Iterable<Job> jobs;
        if (column.toLowerCase().equals("all")){
            jobs = jobRepository.findAll();
            model.addAttribute("title", "All Jobs");
        } else {
            jobs = JobData.findByColumnAndValue(column, value, jobRepository.findAll());
            model.addAttribute("title", "Jobs with " + columnChoices.get(column) + ": " + value);
        }
        model.addAttribute("jobs", jobRepository.findAll());

        return "list-jobs";
    }

    @RequestMapping(value = "skills")
    public String listSkillsByColumnAndValue(Model model, @RequestParam String column, @RequestParam String value) {
        Iterable<Skill> skills;
    /*    if (column.toLowerCase().equals("all")){
            skills = skillRepository.findAll();
            model.addAttribute("title", "All Skills");
        } else {
            skills = SkillData.findByColumnAndValue(column, value, skillRepository.findAll());
            model.addAttribute("title", "Skills with " + columnChoices.get(column) + ": " + value);
        } */
        model.addAttribute("skills", skillRepository.findAll());

        return "list-skills";
    }

    @RequestMapping(value = "employers")
    public String listEmployersByColumnAndValue(Model model, @RequestParam String column, @RequestParam String value) {
        Iterable<Employer> employers;
        /* if (column.toLowerCase().equals("all")){
            employers = employerRepository.findAll();
            model.addAttribute("title", "All Employers");
        } else {
            employers = EmployerData.findByColumnAndValue(column, value, employerRepository.findAll());
            model.addAttribute("title", "Employers with " + columnChoices.get(column) + ": " + value);
        } */
        model.addAttribute("employers", employerRepository.findAll());

        return "list-employers";
    }
}
