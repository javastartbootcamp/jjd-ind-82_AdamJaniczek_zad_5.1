package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    private Point point = new Point();

    public void run(Scanner scanner) {
        System.out.println("Podaj X");
        point.setCoordinateX(scanner.nextInt());
        System.out.println("Podaj Y");
        point.setCoordinateY(scanner.nextInt());
    }

    void compareCoordinate() {
        int x = point.getCoordinateX();
        int y = point.getCoordinateY();
        if (x == 0 && y == 0) {
            System.out.printf("Punkt (%d, %d) leży na środku układu współrzędnych.", x, y);
        } else if (x == 0) {
            System.out.printf("Punkt (%d, %d) leży na osi Y.", x, y);
        } else if (y == 0) {
            System.out.printf("Punkt (%d, %d) leży na osi X.", x, y);
        } else if (y > 0) {
            if (x > 0) {
                System.out.printf("Punkt (%d, %d) leży w I ćwiartce układu współrzędnych.", x, y);
            } else {
                System.out.printf("Punkt (%d, %d) leży w II ćwiartce układu współrzędnych.", x, y);
            }
        } else if (x < 0) {
            System.out.printf("Punkt (%d, %d) leży w III ćwiartce układu współrzędnych.", x, y);
        } else {
            System.out.printf("Punkt (%d, %d) leży w IV ćwiartce układu współrzędnych.", x, y);
        }
    }
}
