import java.util.*;

public class Projectile{
  public static final double ACCELERATION = -9.81;
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);

    System.out.println("This program computes the trajectory of a projectile given, its initial velocity, and its angle relative to the horizon.");
    System.out.println();

    System.out.println("Velocity (Meters/Second)? ");
    double velocity = console.nextDouble();
    System.out.println("Angle (Degrees)? ");
    double angle = Math.toRadians(console.nextDouble());
    System.out.println("Number of steps to display? ");
    int steps = console.nextInt();
    System.out.println();

    double xVelocity = velocity * Math.cos(angle);
    double yVelocity = velocity * Math.sin(angle);
    double totalTime = -2.0 * yVelocity / ACCELERATION;
    double timeIncrement = totalTime / steps;
    double xIncrement = xVelocity * timeIncrement;

    double x = 0.0;
    double y = 0.0;
    double t = 0.0;
    System.out.println("step\tx\ty\ttime");
    System.out.println("0\t0.0\t0.0\t0.0");
    for (int i = 1; i <= steps; i++){
      t += timeIncrement;
      x += xIncrement;
      y += yVelocity * t + 0.5 * ACCELERATION * t * t;
      System.out.println(i + "\t" + round2(x) + "\t" + round2(y) + "\t" + round2(t));
    }
  }

  public static double round2(double n){
    return (int) (n * 100.0 + 0.5) / 100.0;
  }
}