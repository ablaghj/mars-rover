package com.bnp.rover.factory;

public class DirectionFactory {

    public static final String TYPE_LEFT = "left";
    public static final String TYPE_RIGHT = "right";

    public Direction getDirection(String typeDirection) {
        Direction direction = null;
        switch (typeDirection) {
            case TYPE_LEFT:
                direction = new LeftDirection();
                break;
            case TYPE_RIGHT:
                direction = new RightDirection();
                break;
            default:
                throw new IllegalArgumentException("Type not found");
        }
        return direction;
    }
}


