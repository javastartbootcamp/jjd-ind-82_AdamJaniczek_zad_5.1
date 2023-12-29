package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {
    private Point point = new Point();

    public void run(Scanner scanner) {
        System.out.println("Podaj X");
        point.setCoordinateX(scanner.nextInt());
        System.out.println("Podaj Y");
        point.setCoordinateY(scanner.nextInt());
        compareCoordinate();
    }

    void compareCoordinate() {
        int x = point.getCoordinateX();
        int y = point.getCoordinateY();
        if (x == 0 && y == 0) {
            point.print("środku układu współrzędnych.");
        } else if (x == 0) {
            point.print("osi Y.");
        } else if (y == 0) {
            point.print("osi X.");
        } else if (y > 0) {
            if (x > 0) {
                point.print(point, "I");
            } else {
                point.print(point, "II");
            }
        } else if (x < 0) {
            point.print(point, "III");
        } else {
            point.print(point, "IV");
        }
    }
}
