import java.util.Scanner;


public class CalculatorProject {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double  num1;
        double  num2;
        char  operator;
        double result = 0;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("What operation would you like to preform (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '^' -> result = Math.pow(num1,num2);
        }

        System.out.print(result);

        scanner.close();
    }
}
