public class WriteRoots{
  public static void main(String[] args){
    for (int i = 1; i <= 20; i++) {
      double root = Math.sqrt(i);
      System.out.println("sqrt of " + i + " = " + root);
    }
    
    System.out.println("15000 miles is " + miles(15000) + " miles.");
  }
  public static double miles(double feet){
    return feet / 5280.0;
  }
}