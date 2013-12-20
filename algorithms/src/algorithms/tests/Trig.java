package algorithms.tests;
public class Trig { 
   public static void main(String[] args) {
      double degrees = 360;
      double radians = Math.toRadians(degrees);
      System.out.println("degrees=" + degrees + " radians="+radians);

      double s = Math.sin(radians);
      System.out.println("sin(" + degrees + ") = " + s);

      double c = Math.cos(radians);
      System.out.println("cos(" + degrees + ") = " + c);

      double t = Math.tan(radians);
      System.out.println("tan(" + degrees + ") = " + t);
      System.out.println(s + " / " + c + " = " + s / c);

      double r = s*s + c*c;
      System.out.println(s*s + " + " + c*c + " = " + r);
  }
}