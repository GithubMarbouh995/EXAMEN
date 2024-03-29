package com.example.examen.controller;

import com.example.examen.model.Employe;
import com.example.examen.service.EmployeService;
import com.example.examen.service.EmployeServiceImp;

import java.util.List;

public class AffectationController {
    private String message;
    private EmployeService employeService=new EmployeServiceImp();
    private List<Employe> allEmployes;


    public AffectationController() {
    }
   public List<Employe> getAllEmployes() {
        allEmployes=employeService.getAllEmployes();
        return allEmployes;
    }

    public void setAllEmployes(List<Employe> allEmployes) {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
