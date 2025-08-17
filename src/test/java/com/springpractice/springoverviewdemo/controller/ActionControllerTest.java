package com.springpractice.springoverviewdemo.controller;

import com.springpractice.springoverviewdemo.service.ActionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ActionController.class)
public class ActionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ActionService actionService;

    @Test
    public void shouldCreateMockMvc() throws Exception {
        when(this.actionService.forTest(true)).thenReturn("something is true");
        MvcResult result = mockMvc.perform(post("/endpoint/fortest/true"))
                .andExpect(status().isOk()).andReturn();

        Assertions.assertEquals("something is true", result.getResponse().getContentAsString());
    }
}
