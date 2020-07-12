package com.bnp.rover.factory;

import com.bnp.rover.enums.DirectionType;

public abstract class Direction {
    public abstract DirectionType nextDirection(DirectionType CurrentDirection);
}
