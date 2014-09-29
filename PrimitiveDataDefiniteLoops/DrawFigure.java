public class DrawFigure{
  public static void main(String[] args) {
    drawLine();
    drawTop();
    drawBottom();
    drawLine();
  }

  // draws a line
  public static void drawLine(){
    System.out.print("+");
    for (int i = 1; i <= 8; i++) {
      System.out.print("-");
    }
    System.out.println("+");
  }
  
  public static void drawTop(){
    for (int line = 1; line <= 4 ; line++ ) {
      System.out.print("|");
      for (int i = 1; i <= (line -1); i++){
        System.out.print(" ");
      }
        System.out.print("\\");
      for (int i = 1; i <= (8-2 * line); i++){
        System.out.print(" ");
      }
      System.out.print("/");
      for (int i = 1; i <= (line -1); i++){
        System.out.print(" ");
      }
      System.out.println("|");
    }
  }

  public static void drawBottom(){
    for (int line = 1; line <= 4 ; line++ ) {
      System.out.print("|");
      for (int i = 4; i >= (line +1); i--){
        System.out.print(" ");
      }
      System.out.print("/");
      for (int i = 1; i <= 2 * (line - 1); i++){
        System.out.print(" ");
      }
      System.out.print("\\");
      for (int i = 4; i >= (line +1); i--){
        System.out.print(" ");
      }
      System.out.println("|");
    }
  }
}