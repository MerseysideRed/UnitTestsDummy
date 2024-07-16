import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void testRectangleGetLength() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        assertEquals("Test is passed", 2.0, rectangle.getLength(), 0.0);
    }

    @Test
    public void testRectangleGetWidth() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        assertEquals("Test is passed", 3.0, rectangle.getWidth(), 0.0);
    }

    @Test
    public void testRectangleGetArea() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        assertEquals("Test is passed", 6.0, rectangle.getArea(), 0.0);
    }

    @Test
    public void testRectangleSetWidth() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        rectangle.setWidth(8.0);
        assertEquals("Test is passed", 8.0, rectangle.getWidth(), 0.0);
    }

    @Test
    public void testRectangleSetLength() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        rectangle.setLength(9.0);
        assertEquals("Test is passed", 9.0, rectangle.getLength(), 0.0);
    }
}
