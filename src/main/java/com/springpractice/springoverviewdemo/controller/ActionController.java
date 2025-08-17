package com.springpractice.springoverviewdemo.controller;

import com.springpractice.springoverviewdemo.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

    private ActionService actionService;

    @Autowired
    public void ActionController(ActionService actionService) {
        this.actionService = actionService;
    }

    @PostMapping("/actions/batch")
    public void insertActionsBatch() {
        this.actionService.insertActionsBatch();
    }

    @PostMapping("endpoint/fortest/{isSomething}")
    public String endpointForTest(@PathVariable Boolean isSomething) {
        return this.actionService.forTest(isSomething);
    }

}
