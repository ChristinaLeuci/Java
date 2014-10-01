public class StringPlay{
  public static void main(String[] args){
    strings();
  }
  public static void strings(){
    String s1 = "hello.";
    String s2 = " how are you?";
    System.out.println(s1 + s2);
    System.out.println("Length of s1 = " + s1.length());
    System.out.println("Length of s2 = " + s2.length());

    for (int i = 0; i < s1.length(); i++){
      System.out.println(i + ":" + s1.charAt(i));
    }

    System.out.println(s2.substring(1,4));
  }
}