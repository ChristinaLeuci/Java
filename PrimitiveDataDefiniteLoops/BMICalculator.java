public class BMICalculator{
  public static void main(String[] args){
    double height;
    double weight;
    double bmi;
    // double height = 67.2, weight = 120, bmi;

    height = 67.2;
    weight = 120;
    bmi = weight / (height * height) *703;

    System.out.println(bmi);
  }
}