package com.example.fiverrlevelsengine.controller;

import com.example.fiverrlevelsengine.domain.Levels;
import com.example.fiverrlevelsengine.service.LevelsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomePageController {
    private final LevelsService levelsService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        Levels fiverrLevels = levelsService.getAllLevels();
        model.addAttribute("fiverrLevels", fiverrLevels);
        return "home";
    }
}
