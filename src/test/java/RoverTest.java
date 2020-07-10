import com.bnp.rover.enums.DirectionType;
import com.bnp.rover.objects.Plateau;
import com.bnp.rover.objects.Position;
import com.bnp.rover.objects.Rover;
import org.junit.Assert;
import org.junit.Test;

public class RoverTest {
    private Plateau plateau = new Plateau(5,5);

    @Test
    public void testTurnLeft() {
        Position positionRover = new Position(1,2, DirectionType.WEST);
        Rover rover = new Rover(plateau, positionRover);
        rover.turnLeft();
        Assert.assertEquals(new Rover(plateau, new Position(1,2, DirectionType.SOUTH)), rover);
    }

    @Test
    public void testTurnRight() {
        Position positionRover = new Position(1,2, DirectionType.WEST);
        Rover rover = new Rover(plateau, positionRover);
        rover.turnRight();
        Assert.assertEquals(new Rover(plateau, new Position(1,2, DirectionType.NORTH)), rover);
    }

    @Test
    public void testExecuteInstuctions() {
        Position positionRover = new Position(3,3, DirectionType.EAST);
        Rover rover = new Rover(plateau, positionRover);
        rover.executeInstuctions("MMRMMRMRRM");
        Assert.assertEquals(new Rover(plateau, new Position(5,1, DirectionType.EAST)), rover);
    }

}
