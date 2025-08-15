package com.springpractice.springoverviewdemo.controller;

import com.springpractice.springoverviewdemo.service.RoundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoundContorller {

    private final RoundService roundService;

    @Autowired
    public RoundContorller(RoundService roundService) {
        this.roundService = roundService;
    }

    @PostMapping("/round/batch")
    public void insertActionsBatch() {
        this.roundService.insertRoundBatch();
    }
}
