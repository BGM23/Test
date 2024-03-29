import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    void setPoint() {
        // Setup
        double expectedX = 5;
        double expectedY = 5;
        Point point = new Point((int) expectedX, (int) expectedY);

        // Exercise
        double x = point.getX();
        double y = point.getY();

        // Assert
        assertEquals(expectedX, x);
        assertEquals(expectedY, y);
    }

    @Test
    void shiftX() {
        // Setup
        double expectedX = 6;
        Point point = new Point(5, 5);

        // Exercise
        point.translate(1, 0);
        double x = point.getX();

        // Assert
        assertEquals(expectedX, x);
    }

    @Test
    void shiftY() {
        // Setup
        double expectedY = 6;
        Point point = new Point(5, 5);

        // Exercise
        point.translate(0, 1);
        double y = point.getY();

        // Assert
        assertEquals(expectedY, y);
    }

    @Test
    void distance() {
        // Setup
        double expectedDistance = 5;
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);

        // Exercise
        double distance = point1.distance(point2);

        // Assert
        assertEquals(expectedDistance, distance);
    }

    @Test
    void rotate() {
        // Setup
        double expectedX = -5;
        double expectedY = 5;
        Point point = new Point(5, 5);

        // Exercise
        point.setLocation(-point.getY(), point.getX());
        double x = point.getX();
        double y = point.getY();

        // Assert
        assertEquals(expectedX, x);
        assertEquals(expectedY, y);
    }
}
