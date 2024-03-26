package com.example.fiverrlevelsengine.service;

import com.example.fiverrlevelsengine.domain.Levels;
import com.example.fiverrlevelsengine.domain.Parameters;
import com.example.fiverrlevelsengine.leveldeterminer.LevelDeterminer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LevelsService {
    private final Levels levels;
    private final List<LevelDeterminer> levelDeterminers;

    public Levels getAllLevels() {
        return levels;
    }

    public String findLevel(Parameters inParameters) {
        return levelDeterminers.stream()
                .filter(levelDeterminer -> levelDeterminer.levelMet(inParameters))
                .map(LevelDeterminer::getLevelName)
                .findFirst()
                .orElse("New Seller");
    }
}
