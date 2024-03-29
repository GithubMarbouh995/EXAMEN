package com.example.examen.service;

import com.example.examen.model.Employe;

import java.util.List;

public interface EmployeService {
    public void createEmploye(Employe employe);
    public void updateEmploye( Employe employe);
    public void deleteEmploye(long id);
    public void getEmploye(long id);
    public List<Employe> getAllEmployes();
}
