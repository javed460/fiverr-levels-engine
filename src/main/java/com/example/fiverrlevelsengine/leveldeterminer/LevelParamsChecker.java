package com.example.fiverrlevelsengine.leveldeterminer;

import com.example.fiverrlevelsengine.domain.Parameters;

public class LevelParamsChecker {

    public boolean checkParams(Parameters inParameters, Parameters parametersThreshold) {
        return inParameters.getSuccessScore() >= parametersThreshold.getSuccessScore() &&
                inParameters.getRating() >= parametersThreshold.getRating() &&
                inParameters.getResponseRate() >= parametersThreshold.getResponseRate() &&
                inParameters.getOrders() >= parametersThreshold.getOrders() &&
                inParameters.getUniqueClients() >= parametersThreshold.getUniqueClients() &&
                inParameters.getEarnings() >= parametersThreshold.getEarnings();
    }
}
