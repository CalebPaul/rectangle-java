public class Cube {
  private Rectangle mFace;

  public Cube(Rectangle rectangle) {
    mFace = rectangle;
  }

  public Rectangle getFace() {
    return mFace;
  }

  public int volume() {
    int length = mFace.getsLength();
    return length * length * length;
  }

  // REFACTORED BELOW
  // public int surfaceArea() {
  //   int surfaceArea = mFace.getLength() * mFace.getWidth();
  //   return surface * 6;
  // }

  public int surfaceArea() {
    return mFace.area() * 6;
  }
}
