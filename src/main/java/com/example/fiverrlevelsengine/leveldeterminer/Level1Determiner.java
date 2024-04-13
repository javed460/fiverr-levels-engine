package com.example.fiverrlevelsengine.leveldeterminer;

import com.example.fiverrlevelsengine.domain.Level;
import com.example.fiverrlevelsengine.domain.Levels;
import com.example.fiverrlevelsengine.domain.Parameters;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Order(3)
public class Level1Determiner extends LevelParamsChecker implements LevelDeterminer {
    private final Levels levels;

    @Override
    public boolean levelMet(Parameters inParameters) {
        Level level1 = levels.getLevels().get(0);
        Parameters parametersThreshold = level1.getParameters();
        return checkParams(inParameters, parametersThreshold);
    }

    @Override
    public String getLevelName() {
        return levels.getLevels().get(0).getName();
    }
}
