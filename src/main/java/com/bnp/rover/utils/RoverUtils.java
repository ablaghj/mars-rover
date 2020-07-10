package com.bnp.rover.utils;

import com.bnp.rover.enums.DirectionType;
import com.bnp.rover.objects.Plateau;
import com.bnp.rover.objects.Position;

public class RoverUtils {

    /**
     * Method to parse plateau coordinates
     * @param plateauFromFile
     * @return plateau
     */
    public static Plateau parsePlateau(String plateauFromFile) {
        System.out.println("Plateau: " + plateauFromFile);
        String[] coordinates = plateauFromFile.split(" ");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);
        return new Plateau(x, y);
    }

    /**
     * Method to parse rover position
     * @param positionFromFile
     * @return position
     */
    public static Position parsePosition(String positionFromFile) {
        String[] positions = positionFromFile.split(" ");
        int x = Integer.parseInt(positions[0]);
        int y = Integer.parseInt(positions[1]);
        DirectionType direction = DirectionType.getDirection(positions[2]);
        return new Position(x, y, direction);
    }

}
