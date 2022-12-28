import java.util.Scanner;

/*
 *@Author Emircan Aktaş - 28.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, total = 0;
        System.out.print("Enter a number :");
        number = inp.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.print(number + " is the perfect number!");
        } else {
            System.out.print(number + " is not a perfect number!");
        }

    }
}