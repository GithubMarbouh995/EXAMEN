package com.example.examen.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import com.example.examen.model.Employe;

import java.util.List;

public class Employedaoimp implements EmployeDao {
    // This class implements the EmployeDao interface and provides the implementation of all the methods declared in the interface(with jpa).
    @Override
    public void saveEmploye(Employe Employe) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebStore");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(Employe);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    @Override
    public void deleteEmploye(long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebStore");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Employe Employe = em.find(Employe.class, id);
        if (Employe != null) {
            em.remove(Employe);
            em.getTransaction().commit();
        } else {
            System.out.println("Employe with id " + id + " does not exist.");
        }
        em.close();
    }
    @Override
    public Employe getEmploye(long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebStore");
        EntityManager em = emf.createEntityManager();
        Employe Employe = em.find(Employe.class, id);
        em.close();
        emf.close();
        return Employe;
    }

    @Override
    public List<Employe> getAllEmployes() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebStore");
        EntityManager em = emf.createEntityManager();
        List<Employe> Employes = em.createQuery("SELECT s FROM Employe s", Employe.class).getResultList();
        em.close();
        emf.close();
        return Employes;
    }

    @Override
    public void updateEmploye(Employe Employe) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebStore");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(Employe);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
