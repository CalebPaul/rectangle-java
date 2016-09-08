import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.Console;


public class App {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Enter rectangle length:");
    String stringLength = console.readLine();
    int intLength = Integer.parseInt(stringLength);
    System.out.println("Enter rectangle width:");
    String stringWidth = console.readLine();
    int intWidth = Integer.parseInt(stringWidth);
    Rectangle rectangle = new Rectangle(intLength, intWidth);
    boolean squareResult = rectangle.isSquare();
    System.out.println("Is your rectangle also a square? " + squareResult + "!");
  }
}
