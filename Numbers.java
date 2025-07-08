import java.util.Scanner;

 public class Numbers {
 //1.funksion qe merr ne input nje numer dhe gjen nese eshte pozitiv apo negativ
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter a number: "); //the number is entered
         int n = scanner.nextInt();
         if(n>= 0){ //if this number is bigger or equal to 0 then it's a positive number
             System.out.println("This number is positive!");
         }else{ //otherwise it's negative (if it doesn't apply to the above crateria)
             System.out.println("This number is negative!");
         }

     }
}
