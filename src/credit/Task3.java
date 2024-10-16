package credit;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("количество секунд:");
        int n = scanner.nextInt();
        System.out.println("осталось секунд :" + n);
        int h = n / 3600;
        int ramain = n % 3600;
        if (h > 1) {
            System.out.println("осталось " + h + " часа");
        } else if (h == 1) {
            System.out.println("остался 1 час");
        } else {
            int m = ramain / 60;
            if (m > 0) {
                System.out.println( "осталось менее часа!" );
                } if (m ==0) {
                    System.out.println("рабосий день закончен");


                }
            }

        }
    }


