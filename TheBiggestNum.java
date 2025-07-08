import java.util.Scanner;
public class TheBiggestNum {
    public static void main(String[] args) {
       //2. funksion qe merr ne input 3 numra dhe gjen me te madhin
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        if(num1>num2 && num1>num3){ /*if the first number is bigger than the
             second and the third numbers, the first number that  is the biggest.*/
            System.out.println("This first number is biggest number!");
        }else if(num2>num1 && num2>num3){ /*(when the first condition is not true)
             if the second number is bigger than the
             first and the third numbers, the seconde number that  is the biggest.*/
            System.out.println("This second number is biggest number!");
        }else{ /*else if none of the conditions above are true,
                than the third number is the biggest*/
            System.out.println("This third number is biggest number!");
        }

    }
}
