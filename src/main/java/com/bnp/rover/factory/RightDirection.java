package com.bnp.rover.factory;

import com.bnp.rover.enums.DirectionType;

public class RightDirection extends Direction{

    /**
     * Method to get the next right direction of the rover
     * @param currentDirection
     * @return directionType
     */
    @Override
    public DirectionType nextDirection(DirectionType currentDirection) {
        switch (currentDirection){
            case EAST:
                return DirectionType.SOUTH;
            case WEST:
                return DirectionType.NORTH;
            case NORTH:
                return DirectionType.EAST;
            case SOUTH:
                return DirectionType.WEST;
            default:
                throw new EnumConstantNotPresentException(DirectionType.class, currentDirection.toString());
        }
    }
}
