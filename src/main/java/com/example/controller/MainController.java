package com.example.controller;

import com.example.dto.Company;
import com.example.model.Person;
import com.example.repository.CompanyRepository;
import lombok.NonNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private Person person;
    private CompanyRepository repository;

    public MainController(Person person, CompanyRepository repository) {

        this.person = person;
        this.repository = repository;
    }

    @GetMapping(value = {"/", "/index"})
    public String index(Model model) {

        String message = "Hello Spring Boot + JSP";

        model.addAttribute("message", message);

        return "index";
    }

    //    @GetMapping(value = {"/company}"})
    //    public String viewCompanyByName(@RequestParam("name") String name, Model model) {
    //
    //        model.addAttribute("companies", repository.findByName(name));
    //
    //        return "company";
    //    }

    //    @GetMapping(value = {"/company"})
    //    public String viewCompanyById(@RequestParam("id") String id, Model model) {
    //
    //        model.addAttribute("companies", repository.findById(Long.valueOf(id)));
    //
    //        return "company";
    //    }

    @GetMapping(value = {"/company"})
    public String viewCompanyByAddressAndSalary(@RequestParam("address") String address, @RequestParam("salary") String salary, Model model) {

        model.addAttribute("companies", repository.findByAddressAndSalary(address, Long.parseLong(salary)));

        return "company";
    }

    @PostMapping(value = "/testPost")
    public List<Company> addCompany(Model model) {

        //        repository.save(company);

        model.addAttribute("companies", repository.findAll());

        List<Company> list = new ArrayList<>();
        repository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
