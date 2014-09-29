public class WriteSquares{
  public static void main(String[] args){
    redundant();
    System.out.println();
    forloop();
  }
  public static void redundant(){
    System.out.println(1 + " squared = " + (1 * 1));
    System.out.println(2 + " squared = " + (2 * 2));   
    System.out.println(3 + " squared = " + (3 * 3)); 
    System.out.println(4 + " squared = " + (4 * 4));
  }
  public static void forloop(){
    for (int i = 1; i < 5; i++) {
      System.out.println(i + " squared = " + (i * i));
    }
  }
}