package com.bnp.rover.factory;

import com.bnp.rover.enums.DirectionType;

public class LeftDirection extends Direction {

    /**
     * Method to get the next left direction of the rover
     * @param currentDirection
     * @return directionType
     */
    @Override
    public DirectionType nextDirection(DirectionType currentDirection) {
        switch (currentDirection){
            case EAST:
                return DirectionType.NORTH;
            case WEST:
                return DirectionType.SOUTH;
            case NORTH:
                return DirectionType.WEST;
            case SOUTH:
                return DirectionType.EAST;
            default:
                throw new EnumConstantNotPresentException(DirectionType.class, currentDirection.toString());
        }
    }
}
