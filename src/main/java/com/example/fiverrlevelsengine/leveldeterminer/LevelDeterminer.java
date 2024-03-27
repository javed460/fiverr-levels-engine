package com.example.fiverrlevelsengine.leveldeterminer;

import com.example.fiverrlevelsengine.domain.Parameters;

public interface LevelDeterminer {
    boolean levelMet(Parameters inParameters);

    String getLevelName();
}
