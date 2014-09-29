public class DrawBoxes{
  public static void main(String[] args) {
    drawBox();
  }
  public static void drawBox(){
    System.out.println("+------+");
    System.out.println("|      |");
    System.out.println("|      |");
    System.out.println("+------+");
    // calling drawBox(); again would cause infinite recursion
  }
}