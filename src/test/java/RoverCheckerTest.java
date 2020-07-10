import com.bnp.rover.checkers.RoverChecker;
import com.bnp.rover.enums.DirectionType;
import com.bnp.rover.objects.Plateau;
import com.bnp.rover.objects.Position;
import org.junit.Assert;
import org.junit.Test;

public class RoverCheckerTest {

    private Plateau plateau = new Plateau(5,5);

    @Test
    public void testReturnFalseWhenXlessThanZero() {
        Position newPosition = new Position(-1, 0, DirectionType.WEST);
        Assert.assertFalse(RoverChecker.checkNewRoverPosition(newPosition, plateau));
    }

    @Test
    public void testReturnFalseWhenYlessThanZero() {
        Position newPosition = new Position(0, -1, DirectionType.WEST);
        Assert.assertFalse(RoverChecker.checkNewRoverPosition(newPosition, plateau));
    }

    @Test
    public void testReturnFalseWhenXgreaterThanMaxLengthOfPlateau() {
        Position newPosition = new Position(6, 0, DirectionType.WEST);
        Assert.assertFalse(RoverChecker.checkNewRoverPosition(newPosition, plateau));
    }

    @Test
    public void testReturnFalseWhenYgreaterThanMaxLengthOfPlateau() {
        Position newPosition = new Position(0, 6, DirectionType.WEST);
        Assert.assertFalse(RoverChecker.checkNewRoverPosition(newPosition, plateau));
    }
}
