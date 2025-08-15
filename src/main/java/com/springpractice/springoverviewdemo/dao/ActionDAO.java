/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.springpractice.springoverviewdemo.dao;

import com.springpractice.springoverviewdemo.entity.Action;
import java.util.List;

/**
 *
 * @author grumman
 */
public interface ActionDAO {
    
    public void batchInsert(List<Action> actions);
}
