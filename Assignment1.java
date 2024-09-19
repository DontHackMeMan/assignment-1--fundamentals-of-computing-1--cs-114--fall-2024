// Import libraries here
import java.util.Scanner;
import java.util.Random;
;
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
    double temperature, celsius;
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    String userstring, cut;
    int num;

    
    System.out.println("Enter a temperature measurement This will be converted from fahrenheit to celcius. ");
    temperature = scan.nextDouble();

    celsius =  (temperature-BASE) /(Conversion) ;
    System.out.println();

    System.out.println("Enter a 5-character string");
    userstring = scan.next();
    StringBuffer flip = new StringBuffer(userstring);
    flip.reverse();
    cut = flip.substring(1, 4);
    
    num = generator.nextInt(16352) + 32;
    
    System.out.println("Your new string is "+celsius+cut+num);
    scan.close();
  }
}
