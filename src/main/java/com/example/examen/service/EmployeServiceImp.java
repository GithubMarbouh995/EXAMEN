package com.example.examen.service;
import com.example.examen.dao.EmployeDao;
import com.example.examen.dao.Employedaoimp;
import com.example.examen.model.Employe;

import java.util.List;


public class EmployeServiceImp implements EmployeService{
    private EmployeDao EmployeDao;


    public EmployeServiceImp() {
        EmployeDao = new Employedaoimp();
    }
    @Override
    public void createEmploye(Employe employe) {
        EmployeDao.saveEmploye(employe);

    }

    @Override
    public void updateEmploye(Employe employe) {
        EmployeDao.updateEmploye(employe);

    }

    @Override
    public void deleteEmploye(long id ) {
        EmployeDao.deleteEmploye(id);

    }

    @Override
    public void getEmploye(long id) {
        EmployeDao.getEmploye(id);

    }

    @Override
    public List<Employe> getAllEmployes() {
       return EmployeDao.getAllEmployes();

    }
}
