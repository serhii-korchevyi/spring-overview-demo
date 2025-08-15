/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springpractice.springoverviewdemo.dao;

import com.springpractice.springoverviewdemo.entity.Action;
import jakarta.persistence.EntityManager;
import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author grumman
 */
@Repository
public class ActionDAOImpl implements ActionDAO {
    
    private final int batchSize = 5;
    
    private EntityManager em;

    @Autowired
    public void ActionDAOImpl(EntityManager entityManager){
        this.em = entityManager;
    }

    @Transactional
    @Override
    public void batchInsert(List<Action> actions) {
        for (int i = 0; i < actions.size(); i++) {
            this.em.persist(actions.get(i));
            
            if (i > 0 && i % this.batchSize == 0) {
                this.em.flush();
                this.em.clear();
            }
        }
        
        this.em.flush();
        this.em.clear();
    }

}
