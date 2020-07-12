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

    @Override
    public String toString() {
        return directionValue;
    }
}
