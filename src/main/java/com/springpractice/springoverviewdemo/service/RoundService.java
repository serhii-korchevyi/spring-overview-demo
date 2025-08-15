/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springpractice.springoverviewdemo.service;

import com.springpractice.springoverviewdemo.dao.RoundRepository;
import com.springpractice.springoverviewdemo.entity.Round;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grumman
 */
@Service
public class RoundService {
    
    private final RoundRepository roundRepository;
    
    @Autowired
    public RoundService(RoundRepository roundRepository) {
        this.roundRepository = roundRepository;
    }
    
    public void insertRoundBatch() {
        List<Round>  rounds = new ArrayList<>();

        rounds.add(new Round(1, 10.00));
        rounds.add(new Round(2, 10.00));
        rounds.add(new Round(3, 10.00));
        rounds.add(new Round(4, 10.00));
        rounds.add(new Round(5, 10.00));
        rounds.add(new Round(6, 10.00));
        rounds.add(new Round(7, 10.00));
        rounds.add(new Round(8, 10.00));
        rounds.add(new Round(9, 10.00));
        rounds.add(new Round(10, 10.00));
        rounds.add(new Round(11, 10.00));
        rounds.add(new Round(12, 10.00));

        this.roundRepository.saveAll(rounds);
    }

    public Double getSumOfFourRound() {
        return this.roundRepository.sumOfFour();
    }
}
