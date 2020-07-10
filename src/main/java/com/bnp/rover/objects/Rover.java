package com.bnp.rover.objects;

import com.bnp.rover.checkers.RoverChecker;
import com.bnp.rover.enums.DirectionType;

import java.util.Objects;

public class Rover {
    private Position position;
    private Plateau plateau;

    public Rover(Plateau plateau, Position position) {
        this.plateau = plateau;
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    /**
     * Method to execute list of instructions
     * @param instructions
     */
    public void executeInstuctions(String instructions) {
        for(int i=0; i<instructions.length(); i++){
            char instruction = instructions.charAt(i);
            switch (instruction) {
                case 'R':
                    turnRight();
                    break;
                case 'L':
                    turnLeft();
                    break;
                case 'M':
                    move();
                    break;
            }
        }
    }

    public void move() {
        if(RoverChecker.checkNewRoverPosition(position.move(), plateau)) {
            this.setPosition(position.move());
        }
    }

    public void turnLeft() {
        this.setPosition(new Position(position.getX(), position.getY(), DirectionType.getNextLeftDirection(position.getDirection())));
    }

    public void turnRight() {
        this.setPosition(new Position(position.getX(), position.getY(), DirectionType.getNextRightDirection(position.getDirection())));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rover rover = (Rover) o;
        return Objects.equals(position, rover.position) &&
                Objects.equals(plateau, rover.plateau);
    }

    @Override
    public String toString() {
        return position.toString();
    }
}
