import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingNumber {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>(); //the array list with numbers
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you are trying to find: ");
        int n = scanner.nextInt();   //asks the user which number they wanna find

        if(list.contains(n)){ //if the list contains this number than the number is found
            System.out.println("This number is found!");
        }else{ //otherwise it's not there
            System.out.println("This number is not found!");
        }


    }
}
