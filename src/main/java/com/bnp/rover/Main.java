package com.bnp.rover;

import com.bnp.rover.objects.Plateau;
import com.bnp.rover.objects.Position;
import com.bnp.rover.objects.Rover;
import com.bnp.rover.utils.RoverUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(args[0]);
             BufferedReader reader = new BufferedReader(fileReader)) {
            // read first line (plateau coordinates)
            Plateau plateau = RoverUtils.parsePlateau(reader.readLine());
            ArrayList<Rover> rovers = new ArrayList<>();
            System.out.println("Input: ");
            String line;
            // read line by line
            while ((line = reader.readLine() ) != null) {
                Position position = RoverUtils.parsePosition(line);
                Rover rover = new Rover(plateau, position);
                rovers.add(rover);
                System.out.println(rover.getPosition());
                if ((line = reader.readLine() ) != null){
                    //Execute instructions
                    rover.executeInstuctions(line);
                }
            }
            //Display result
            System.out.println("Output: ");
            for(int i=0; i<rovers.size(); i++){
                System.out.println(rovers.get(i).getPosition());
            }
        } catch (Exception e) {
            System.err.format("Exception: ", e);
        }
    }
}
