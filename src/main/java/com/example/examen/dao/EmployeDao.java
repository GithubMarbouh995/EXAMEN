package com.example.examen.dao;

import com.example.examen.model.Employe;

import java.util.List;

public interface EmployeDao {
    public void saveEmploye(Employe Employe);
    public void deleteEmploye(long id);
    public Employe getEmploye(long id);
    public List<Employe> getAllEmployes();
    public void updateEmploye(Employe Employe);
}
