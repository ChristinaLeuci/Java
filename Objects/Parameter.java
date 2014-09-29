public class Parameter{
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
      writeSpaces(line - 1);
        System.out.print("\\");
      writeSpaces(8-2 * line);
      System.out.print("/");
      writeSpaces(line -1);
      System.out.println("|");
    }
  }

  public static void drawBottom(){
    for (int line = 1; line <= 4 ; line++ ) {
      System.out.print("|");
      writeSpaces(4 - line);
      System.out.print("/");
      writeSpaces(2 * (line - 1));
      System.out.print("\\");
      writeSpaces(4-line);
      System.out.println("|");
    }
  }

  public static void writeSpaces(int number){
    for (int i = 1; i <= number; i++){
      System.out.print(" ");
    }
  }
}