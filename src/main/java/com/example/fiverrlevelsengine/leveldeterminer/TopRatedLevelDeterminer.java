package com.example.fiverrlevelsengine.leveldeterminer;

import com.example.fiverrlevelsengine.domain.Level;
import com.example.fiverrlevelsengine.domain.Levels;
import com.example.fiverrlevelsengine.domain.Parameters;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Order(1)
public class TopRatedLevelDeterminer implements LevelDeterminer {
    private final Levels levels;

    @Override
    public boolean levelMet(Parameters inParameters) {
        Level topRated = levels.getLevels().get(2);
        Parameters parametersThreshold = topRated.getParameters();

        return inParameters.getSuccessScore() >= parametersThreshold.getSuccessScore() &&
                inParameters.getRating() >= parametersThreshold.getRating() &&
                inParameters.getResponseRate() >= parametersThreshold.getResponseRate() &&
                inParameters.getOrders() >= parametersThreshold.getOrders() &&
                inParameters.getUniqueClients() >= parametersThreshold.getUniqueClients() &&
                inParameters.getEarnings() >= parametersThreshold.getEarnings();
    }

    @Override
    public String getLevelName() {
        return levels.getLevels().get(2).getName();
    }
}
