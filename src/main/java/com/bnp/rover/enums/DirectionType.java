package com.bnp.rover.enums;

public enum DirectionType{
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private String directionValue;

    DirectionType(String direction) {
        this.directionValue = direction;
    }

    /**
     * Method to get direction type by value
     * @param strSearch
     * @return directionType
     */
    public static DirectionType getDirection(String strSearch) {
        if (strSearch != null) {
            for (DirectionType directionType : DirectionType.values()) {
                if (strSearch.equalsIgnoreCase(directionType.directionValue)) {
                    return directionType;
                }
            }
        }
        throw new EnumConstantNotPresentException(DirectionType.class, strSearch);
    }

    /**
     * Method to get the next right direction of the rover
     * @param currentDirection
     * @return directionType
     */
    public static DirectionType getNextRightDirection(DirectionType currentDirection){
       switch (currentDirection){
           case EAST:
               return SOUTH;
           case WEST:
               return NORTH;
           case NORTH:
               return EAST;
           case SOUTH:
               return WEST;
           default:
               throw new EnumConstantNotPresentException(DirectionType.class, currentDirection.toString());
       }
    }

    /**
     * Method to get the next left direction of the rover
     * @param currentDirection
     * @return directionType
     */
    public static DirectionType getNextLeftDirection(DirectionType currentDirection){
        switch (currentDirection){
            case EAST:
                return NORTH;
            case WEST:
                return SOUTH;
            case NORTH:
                return WEST;
            case SOUTH:
                return EAST;
            default:
                throw new EnumConstantNotPresentException(DirectionType.class, currentDirection.toString());
        }
    }

    @Override
    public String toString() {
        return directionValue;
    }
}
