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
        int x = point.coordinateX();
        int y = point.coordinateY();
        if (x == 0 && y == 0) {
            point.pointInTheMiddle();
        } else if (x == 0) {
            point.pointOnTheXorYaxis("Y");
        } else if (y == 0) {
            point.pointOnTheXorYaxis("X");
        } else if (y > 0) {
            if (x > 0) {
                point.pointOnTheQuadrant("I");
            } else {
                point.pointOnTheQuadrant("II");
            }
        } else if (x < 0) {
            point.pointOnTheQuadrant("III");
        } else {
            point.pointOnTheQuadrant("IV");
        }
    }
}
