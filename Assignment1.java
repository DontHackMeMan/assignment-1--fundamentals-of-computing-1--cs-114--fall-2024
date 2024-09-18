// Import libraries here
import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    // Add your code here
    System.out.println("      CCCCCCCCC      FFFFFFFFF     ");
    System.out.println("    CC         C     FF     ");
    System.out.println("   CC                FF     ");
    System.out.println("   CC                FF     ");
    System.out.println("   CC                FFFFFFFF     ");
    System.out.println("   CC                FF     ");
    System.out.println("   CC                FF     ");
    System.out.println("    CC         C     FF     ");
    System.out.println("      CCCCCCCCC      FF     ");

    final int BASE = 32;
    final double Conversion = 1.8;
    double temperature, celcius;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a temperature measurement This will be converted from fahrenheit to celcius. ");
    temperature = scan.nextDouble();

    celcius =  (temperature-BASE) /(Conversion) ;
    System.out.println("Temperature in Celsius:"+ celcius);
    scan.close();
  }
}
