import com.bnp.rover.enums.DirectionType;
import com.bnp.rover.factory.Direction;
import com.bnp.rover.factory.DirectionFactory;
import org.junit.Assert;
import org.junit.Test;

public class DirectionTypeTest {

    private static DirectionFactory directionFactory = new DirectionFactory();

    @Test
    public void testGetDirection() {
        Assert.assertEquals(DirectionType.EAST, DirectionType.getDirection("E"));
        Assert.assertEquals(DirectionType.WEST, DirectionType.getDirection("W"));
        Assert.assertEquals(DirectionType.NORTH, DirectionType.getDirection("N"));
        Assert.assertEquals(DirectionType.SOUTH, DirectionType.getDirection("S"));
    }

    @Test
    public void testGetNextRightDirection() {
        Direction direction = directionFactory.getDirection(DirectionFactory.TYPE_RIGHT);
        Assert.assertEquals(DirectionType.SOUTH, direction.nextDirection(DirectionType.EAST));
        Assert.assertEquals(DirectionType.NORTH, direction.nextDirection(DirectionType.WEST));
        Assert.assertEquals(DirectionType.EAST, direction.nextDirection(DirectionType.NORTH));
        Assert.assertEquals(DirectionType.WEST, direction.nextDirection(DirectionType.SOUTH));
    }

    @Test
    public void testGetNextLeftDirection() {
        Direction direction = directionFactory.getDirection(DirectionFactory.TYPE_LEFT);
        Assert.assertEquals(DirectionType.NORTH, direction.nextDirection(DirectionType.EAST));
        Assert.assertEquals(DirectionType.SOUTH, direction.nextDirection(DirectionType.WEST));
        Assert.assertEquals(DirectionType.WEST, direction.nextDirection(DirectionType.NORTH));
        Assert.assertEquals(DirectionType.EAST, direction.nextDirection(DirectionType.SOUTH));
    }

}