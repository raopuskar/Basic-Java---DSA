import java.util.*;
class printSum{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        System.out.print("Sum of " + num1 + " and " + num2 + " is: "+ (num1 + num2));
    }
}