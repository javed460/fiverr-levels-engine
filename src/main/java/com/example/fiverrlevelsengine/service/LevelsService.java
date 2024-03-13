package com.example.fiverrlevelsengine.service;

import com.example.fiverrlevelsengine.domain.Levels;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LevelsService {
    private final Levels levels;

    public Levels getAllLevels() {
        return levels;
    }


}
