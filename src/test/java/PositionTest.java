import com.bnp.rover.enums.DirectionType;
import com.bnp.rover.objects.Position;
import org.junit.Assert;
import org.junit.Test;

public class PositionTest {

    @Test
    public void testMove() {
        Position positionRover1 = new Position(1,2, DirectionType.EAST);
        Assert.assertEquals(new Position(2,2, DirectionType.EAST), positionRover1.move());

        Position positionRover2 = new Position(1,2, DirectionType.WEST);
        Assert.assertEquals(new Position(0,2, DirectionType.WEST), positionRover2.move());

        Position positionRover3 = new Position(1,2, DirectionType.NORTH);
        Assert.assertEquals(new Position(1,3, DirectionType.NORTH), positionRover3.move());

        Position positionRover4 = new Position(1,2, DirectionType.SOUTH);
        Assert.assertEquals(new Position(1,1, DirectionType.SOUTH), positionRover4.move());
    }

}
