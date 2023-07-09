import java.util.Scanner;
 /* broj deljiv sa 5 daje Fizz
        broj deljiv sa 3 daje Buzz
        broj deljiv sa 3 i 5 daje FizzBuz
        svi ostali brojevi se samo prepisu
         */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj ");
        int broj = scanner.nextInt();

        if ((broj % 5 ==0) && (broj % 3 == 0)) {
            System.out.print("FizzBuzz");
        } else if (broj % 5 == 0) {
            System.out.print("Fizz");
        } else if (broj % 3 == 0) {
            System.out.print("Buzz");
        } else{
            System.out.println(broj);
        }

    }
}