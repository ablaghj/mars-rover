package com.bnp.rover.objects;

import com.bnp.rover.enums.DirectionType;

public class Position {
    private int x;
    private int y;
    private DirectionType direction;

    public Position(int x, int y, DirectionType direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public DirectionType getDirection() {
        return direction;
    }

    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }

    /**
     * Method to move the rover
     * @return new position of the rover
     */
    public Position move() {
        switch (direction) {
            case EAST:
                return new Position(x+1, y, direction);
            case WEST:
                return new Position(x-1, y, direction);
            case NORTH:
                return new Position(x, y+1, direction);
            case SOUTH:
                return new Position(x, y-1, direction);
            default:
                throw new EnumConstantNotPresentException(DirectionType.class, direction.toString());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y &&
                direction == position.direction;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
}
