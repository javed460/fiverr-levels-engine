package com.example.fiverrlevelsengine.controller;

import com.example.fiverrlevelsengine.domain.Parameters;
import com.example.fiverrlevelsengine.service.LevelsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LevelFinderController {
    private final LevelsService levelsService;

    @GetMapping("/showFormLevelFinder")
    public String viewLevelFinderForm(Model model) {
        return "levelfinder";
    }

    @PostMapping("/findLevel")
    public String processParameters(@ModelAttribute Parameters parameters, Model model) {
        String level = levelsService.findLevel(parameters);
        model.addAttribute("level", level);
        model.addAttribute("inParameters", parameters);
        return "showlevel";
    }
}
