package com.fiap.lojaDeBrinquedos.controller;

import com.google.gson.JsonObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HealthCheck {

    @GetMapping
    public ResponseEntity<Map<String, String>> status(){
        Map<String, String> response = new HashMap<>();
        response.put("status", "health");

        return ResponseEntity.ok(response);
    }
}
