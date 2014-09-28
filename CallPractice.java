public class CallPractice{
  // shows the flow of control
  public static void main(String[] args){
    foo();
    // foo is called
    bar();
    // bar is called
  }
  public static void foo(){
    // will print foo, call mumble, add line, and go back to main
    System.out.println("foo");
    mumble();
    System.out.println();
  }
  public static void bar(){
    // print bar, call baz(stuff happens elsewhere), and back to main
    System.out.println("bar");
    baz();
  }
  public static void baz(){
    // print baz, call mumble
    System.out.println("baz");
    mumble();
  }
  public static void mumble(){
    // prints mumble
    System.out.println("mumble");
  }
}