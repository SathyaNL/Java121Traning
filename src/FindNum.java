import java.util.Scanner;
public class FindNum {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Engter the number x");
        int x = input.nextInt();

        if(x % 2 == 0)
            System.out.println("Given number is even");

        else
        System.out.println("Given number is Odd");

    }
}
