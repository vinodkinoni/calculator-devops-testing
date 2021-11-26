package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2 = 0;
        while (true) {
            System.out.println("---------------Scientific Calculator---------------");
            System.out.println("What do you want to use?");
            System.out.println("Press 1 for square root function.\n" +
                    "Press 2 for factorial function.\n" +
                    "Press 3 for natural log (base e) function.\n" +
                    "Press 4 for common log (base 10) function.\n" +
                    "Press 5 for custom log (log a to the base b) function.\n" +
                    "Press 6 for power function.\n" +
                    "Press 7 for modulo division function.\n" +
                    "Press 8 for percentage function.\n" +
                    "Press 9 for reciprocal function.\n" +
                    "Press 10 for sin function.\n" +
                    "Press 11 for cos function.\n" +
                    "Press 12 for tan function.\n" +
                    "Press 13 for Permutation function.\n" +
                    "Press 14 for Combination function.\n" +
                    "Press any other key to exit\n");
            int ch;
            try {
                ch = sc.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (ch) {
                case 1: // Sq. root function
                    try {
                        System.out.print("Enter the number : ");
                        num1 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input");
                        return;
                    }
                
                    System.out.println("The square root of " + num1 + "  is: " + calc.sqrt(num1)+"\n\n");
                    break;
                
                case 2: // Factorial function
                    try {
                        System.out.print("Enter the number : ");
                        num1 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input");
                        return;
                    }
                
                    System.out.println("The factorial of " + num1 + " is: " + calc.fact(num1)+"\n\n");
                    break;
                
                case 3: // Natural log function
                    try {
                        System.out.print("Enter the number : ");
                        num1 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input");
                        return;
                    }
                
                    System.out.println("The natural log (base e) of " + num1 + " is: " + calc.nlog(num1)+"\n\n");
                    break;
                
                case 4: // Common log function
                    try {
                        System.out.print("Enter the number : ");
                        num1 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input");
                        return;
                    }
                
                    System.out.println("The common log (base 10) of " + num1 + " is: " + calc.log10(num1)+"\n\n");
                    break;
                
                case 5: // Custom log function
                    try {
                        System.out.print("Enter the number : ");
                        num1 = sc.nextDouble();
                        System.out.print("Enter the base : ");
                        num2 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input");
                        return;
                    }
                
                    System.out.println("The custom log (log " + num1 + " to the base " + num2 + ") is: " + calc.custlog(num1, num2)+"\n\n");
                    break;

                case 6: // Power function
                    try {
                        System.out.print("Enter base value: ");
                        num1 = sc.nextDouble();
                        System.out.print("Enter exponent value: ");
                        num2 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    
                    System.out.println(num1 + "^" + num2 + " is: " + calc.pow(num1, num2)+"\n\n");
                    break;

                case 7: // Modulo Division function
                    try {
                        System.out.print("Enter the number: ");
                        num1 = sc.nextDouble();
                        System.out.print("Enter mod value: ");
                        num2 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    
                    System.out.println(num1 + "%" + num2 + " is: " + calc.mod(num1, num2)+"\n\n");
                    break;

                case 8: // Percentage function
                    try {
                        System.out.print("Enter the first number: ");
                        num1 = sc.nextDouble();
                        System.out.print("Enter the second number: ");
                        num2 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    
                    System.out.println(num1 + "% of " + num2 + " is: " + calc.percent(num1, num2)+"\n\n");
                    break;
                    
                case 9: // Reciprocal function
                    try {
                        System.out.print("Enter the number: ");
                        num1 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    
                    System.out.println("The reciprocal of " + num1 + " is: " + calc.recipro(num1)+"\n\n");
                    break;

                case 10: // Sin function
                    try {
                        System.out.print("Enter the number (in ⁰): ");
                        num1 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    
                    System.out.println("The sin of " + num1 + "⁰ is: " + calc.sin(num1)+"\n\n");
                    break;

                case 11: // Cos function
                    try {
                        System.out.print("Enter the number (in ⁰): ");
                        num1 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    
                    System.out.println("The cos of " + num1 + "⁰ is: " + calc.cos(num1)+"\n\n");
                    break;

                case 12: // Tan function
                    try {
                        System.out.print("Enter the number (in ⁰): ");
                        num1 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    
                    System.out.println("The tan of " + num1 + "⁰ is: " + calc.tan(num1)+"\n\n");
                    break;

                case 13: // Permutation function
                    try {
                        System.out.print("Enter the value of n: ");
                        num1 = sc.nextDouble();
                        System.out.print("Enter the value of r: ");
                        num1 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    
                    System.out.println("The permutation " + num1 + "P" + num2 + " is: " + calc.permutation(num1, num2)+"\n\n");
                    break;

                case 14: // Combination function
                    try {
                        System.out.print("Enter the value of n: ");
                        num1 = sc.nextDouble();
                        System.out.print("Enter the value of r: ");
                        num1 = sc.nextDouble();
                    } 
                    catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    
                    System.out.println("The combination " + num1 + "C" + num2 + " is: " + calc.combination(num1, num2)+"\n\n");
                    break;

                default:
                    System.out.println("Exiting....");
                    return;
            }
        }
    }

    public double sqrt(double num1){
        double res = 0;
        try{
            logger.info("SQUARE ROOT FUNCTION");
            if(num1<0){
                res=Double.NaN;
                throw new ArithmeticException();
            }
            else{
                res = Math.sqrt(num1);
            }
        } 
        catch (ArithmeticException error){
            logger.error("Square root of negative number cannot be found.");
        } 
        finally {
            logger.info("Square root of "+num1+" is: "+res);
        }
        return res;
    }

    public double fact(double num1){
        double res = 1;
        try{
            logger.info("FACTORIAL FUNCTION");
            if(num1<0){
                res=Double.NaN;
                throw new ArithmeticException();
            }
            else{
                double i;
                for (i=2; i<=num1; i++)
                    res *= i;
                return res;
            }
        } 
        catch (ArithmeticException error){
            logger.error("Factorial of negative number cannot be found.");
        } 
        finally {
            logger.info("Factorial of "+num1+" is: "+res);
        }
        return res;
    }

    public double nlog(double num1){
        double res = 0;
        try{
            logger.info("NATURAL LOG (BASE e) FUNCTION");
            if(num1<=0){
                res=Double.NaN;
                throw new ArithmeticException();
            }
            else{
                res= Math.log(num1);
            }
        } 
        catch (ArithmeticException error){
            logger.error("Natural log of negative number or zero cannot be found.");
        } 
        finally {
            logger.info("Natural log of "+num1+" is: "+res);
        }
        return res;
    }

    public double log10(double num1){
        double res = 0;
        try{
            logger.info("COMMON LOG (BASE 10) FUNCTION");
            if(num1<=0){
                res=Double.NaN;
                throw new ArithmeticException();
            }
            else{
                res= Math.log10(num1);
            }
        } 
        catch (ArithmeticException error){
            logger.error("Common log of negative number or zero cannot be found.");
        } 
        finally {
            logger.info("Common log of "+num1+" is: "+res);
        }
        return res;
    }

    public double custlog(double num1, double num2){
        double res = 0;
        try{
            logger.info("CUSTOM LOG (a To THE BASE b) FUNCTION");
            if(num1<=0 || num2<=0){
                res=Double.NaN;
                throw new ArithmeticException();
            }
            else if(num2==1){
                res=Double.NaN;
                throw new ArithmeticException();
            }
            else{
                res= Math.log(num1)/Math.log(num2);
            }
        } 
        catch (ArithmeticException error){
            logger.error("Log of negative number or zero cannot be found. Base of Log cannot be negative or zero or one");
        } 
        finally {
            logger.info("Log of "+num1+" to the base of "+num2+" is: "+res);
        }
        return res;
    }

    public double pow(double num1, double num2){
        double res = 0;
        try{
            logger.info("POWER FUNCTION");
            if(num1 == 0 && num2 == 0){
                res=Double.NaN;
                throw new ArithmeticException();
            }
            else{
                res = Math.pow(num1,num2);
            }
        } 
        catch (ArithmeticException error){
            logger.error("0^0 is undefined.");
        } 
        finally {
            logger.info(num1 + "^"+ num2 +" is: "+res);
        }
        return res;
    }

    public double mod(double num1, double num2){
        double res = 0;
        try{
            logger.info("MODULO FUNCTION");
            if(num1 == 0 && num2 == 0){
                res=Double.NaN;
                throw new ArithmeticException();
            }
            else{
                res = num1 % num2;
            }
        } 
        catch (ArithmeticException error){
            logger.error("0%0 is undefined.");
        } 
        finally {
            logger.info(num1 + "%"+ num2 +" is: "+res);
        }
        return res;
    }

    public double percent(double num1, double num2){
        double res = 0;
        logger.info("PERCENTAGE FUNCTION");
        res = (num1 * num2)/100;
        logger.info(num1 + " % of "+ num2 +" is: "+res);
        return res;
    }

    public double recipro(double num1){
        double res = 0;
        try{
            logger.info("RECIPROCAL FUNCTION");
            if(num1 == 0){
                res=Double.NaN;
                throw new ArithmeticException();
            }
            else{
                res = 1/num1;
            }
        } 
        catch (ArithmeticException error){
            logger.error("The reciprocal of 0 is undefined.");
        } 
        finally {
            logger.info("The reciprocal of "+ num1 +" is: "+res);
        }
        return res;
    }

    public double sin(double num1){
        double res = 0;
        logger.info("SIN FUNCTION");
        double rad = Math.toRadians(num1);
        res = Math.sin(rad);
        logger.info("The sin of "+ num1 +"⁰ is: "+res);
        return res;
    }

    public double cos(double num1){
        double res = 0;
        logger.info("COS FUNCTION");
        double rad = Math.toRadians(num1);
        res = Math.cos(rad);
        logger.info("The cos of "+ num1 +"⁰ is: "+res);
        return res;
    }

    public double tan(double num1){
        double res = 0;
        try{
            logger.info("TAN FUNCTION");
            if(num1 == 90){
                res=Double.NaN;
                throw new ArithmeticException();
            }
            else{
                double rad = Math.toRadians(num1);
                res = Math.tan(rad);
            }
        } 
        catch (ArithmeticException error){
            logger.error("The tan of 90⁰ is undefined.");
        } 
        finally {
            logger.info("The tan of "+ num1 +"⁰ is: "+res);
        }
        return res;
    }

    public double permutation(double num1, double num2){
        double res = 0;
        logger.info("PERMUTATION FUNCTION");
        res = fact(num1)/fact(num1-num2);
        logger.info("The permutation " + num1 + "P" + num2 + " is: " + res);
        return res;
    }

    public double combination(double num1, double num2){
        double res = 0;
        logger.info("COMBINATION FUNCTION");
        res = fact(num1)/(fact(num1-num2)*fact(num2));
        logger.info("The combination " + num1 + "C" + num2 + " is: " + res);
        return res;
    }

}