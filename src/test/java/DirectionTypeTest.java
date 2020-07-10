import com.bnp.rover.enums.DirectionType;
import org.junit.Assert;
import org.junit.Test;

public class DirectionTypeTest {

    @Test
    public void testGetDirection() {
        Assert.assertEquals(DirectionType.EAST, DirectionType.getDirection("E"));
        Assert.assertEquals(DirectionType.WEST, DirectionType.getDirection("W"));
        Assert.assertEquals(DirectionType.NORTH, DirectionType.getDirection("N"));
        Assert.assertEquals(DirectionType.SOUTH, DirectionType.getDirection("S"));
    }

    @Test
    public void testGetNextRightDirection() {
        Assert.assertEquals(DirectionType.SOUTH, DirectionType.getNextRightDirection(DirectionType.EAST));
        Assert.assertEquals(DirectionType.NORTH, DirectionType.getNextRightDirection(DirectionType.WEST));
        Assert.assertEquals(DirectionType.EAST, DirectionType.getNextRightDirection(DirectionType.NORTH));
        Assert.assertEquals(DirectionType.WEST, DirectionType.getNextRightDirection(DirectionType.SOUTH));
    }

    @Test
    public void testGetNextLeftDirection() {
        Assert.assertEquals(DirectionType.NORTH, DirectionType.getNextLeftDirection(DirectionType.EAST));
        Assert.assertEquals(DirectionType.SOUTH, DirectionType.getNextLeftDirection(DirectionType.WEST));
        Assert.assertEquals(DirectionType.WEST, DirectionType.getNextLeftDirection(DirectionType.NORTH));
        Assert.assertEquals(DirectionType.EAST, DirectionType.getNextLeftDirection(DirectionType.SOUTH));
    }

}