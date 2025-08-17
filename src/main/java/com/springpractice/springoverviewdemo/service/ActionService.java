/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springpractice.springoverviewdemo.service;

import com.springpractice.springoverviewdemo.dao.ActionDAO;
import com.springpractice.springoverviewdemo.entity.Action;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author grumman
 */
@Service
public class ActionService {
    
    private final ActionDAO actionDAO;
    
    @Autowired
    public ActionService(ActionDAO actionDAO) {
        this.actionDAO = actionDAO;
    }
    
    public void insertActionsBatch() {
        List<Action>  actions = new ArrayList<>();
        
        actions.add(new Action(1, 1, "bet", 10.00));
        actions.add(new Action(2, 1, "bet", 10.00));
        actions.add(new Action(3, 1, "bet", 10.00));
        actions.add(new Action(4, 1, "bet", 10.00));
        actions.add(new Action(5, 1, "bet", 10.00));
        actions.add(new Action(6, 1, "bet", 10.00));
        actions.add(new Action(7, 1, "bet", 10.00));
        actions.add(new Action(8, 1, "bet", 10.00));
        actions.add(new Action(9, 1, "bet", 10.00));
        actions.add(new Action(10, 1, "bet", 10.00));
        actions.add(new Action(11, 1, "bet", 10.00));
        actions.add(new Action(12, 1, "bet", 10.00));

        this.actionDAO.batchInsert(actions);
    }

    public String forTest(Boolean isSomething) {
        return isSomething == true ? "something is true" : "something is false";
    }
}
