package com.bashar.ninjagoldgame.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaController {

    @GetMapping("/")
    public String ninjaGold(HttpSession session) {
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("activities", new ArrayList<String>());
        }
        return "gold.jsp";
    }

    
    @PostMapping("/process_money")
    public String processMoney(@RequestParam("building") String building, HttpSession session) {

        Integer gold = (Integer) session.getAttribute("gold");
        ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");

        Random random = new Random();
        int earned = 0;

        if (building.equals("farm")) {
            earned = random.nextInt(20 - 10 + 1) + 10;
        } else if (building.equals("cave")) {
            earned = random.nextInt(10 - 5 + 1) + 5;
        } else if (building.equals("house")) {
            earned = random.nextInt(5 - 2 + 1) + 2;
        } else if (building.equals("quest")) {
            earned = random.nextInt(50 - (-50) + 1) + (-50);
        }
        

        String stamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("MMM d yyyy h:mm a"));

        String verb = (earned < 0) ? "lost" : "earned";

        activities.add("You entered a " + building + " and " + verb
                + " " + Math.abs(earned) + " gold. (" + stamp + ")");

        session.setAttribute("gold", gold + earned);

        return "redirect:/";
    }
}