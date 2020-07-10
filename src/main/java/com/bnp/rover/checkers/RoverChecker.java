package com.bnp.rover.checkers;

import com.bnp.rover.objects.Plateau;
import com.bnp.rover.objects.Position;

public class RoverChecker {

    /**
     * Method to check rover position
     * @param newPosition
     * @param plateau
     * @return true if the new position of the rover inside the plateau
     */
    public static boolean checkNewRoverPosition(Position newPosition, Plateau plateau) {
        return newPosition.getX() <= plateau.getX()
                && newPosition.getY() <= plateau.getY()
                && newPosition.getX() >= 0
                && newPosition.getY() >= 0;
    }
}
