package credit;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "введите день:");
        int d = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println( "введите месяц:");
        int m = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println( "введите год:");
        int y = scanner.nextInt();
        int dn = ++d;
        System.out.println( dn + "." + m + "." + y);

    }
}
