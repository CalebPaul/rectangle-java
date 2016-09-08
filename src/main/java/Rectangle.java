import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Rectangle {
  private int mLength;
  private int mWidth;

  public Rectangle(int length, int width) {
    mLength = length;
    mWidth = width;
  }

  public int getsLength() {
    return mLength;
  }

  public int getsWidth() {
    return mWidth;
  }

  public boolean isSquare(){
    return mLength == mWidth;
  }
}
