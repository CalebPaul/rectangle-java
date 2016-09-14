// import java.util.ArrayList;
// import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {
  @Test
  public void newRectangle_instantiatesCorrectly() {
    Rectangle testRectangle = new Rectangle(2,4);
    assertEquals(true, testRectangle instanceof Rectangle);
  }
  @Test
  public void newRectangle_getsLength_2(){
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(2, testRectangle.getsLength());
  }
  @Test
  public void newRectangle_getsWidth_4(){
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(4, testRectangle.getsWidth());
  }
  @Test
  public void isSquare_whenNotASquare_false(){
    Rectangle testRectangle = new Rectangle(2, 4);
    assertEquals(false, testRectangle.isSquare());
  }
  @Test
  public void isSquare_whenSquare_true() {
    Rectangle testRectangle = new Rectangle(2,2);
    assertEquals(true, testRectangle.isSquare());
  }

  @Test
  public void all_returnsAllInstancesOfRectangle_true() {
    Rectangle firstRec = new Rectangle(10, 20);
    Rectangle secondRec = new Rectangle(5, 5);
    assertTrue(Rectangle.all().contains(firstRec));
    assertTrue(Rectangle.all().contains(secondRec));
  }

  @Test
  public void area_returnsTheAreaOfTheRectangle_450() {
    Rectangle testRectangle = new Rectangle(15, 30);
    assertEquals (450, testRectangle.area());
  }

}
