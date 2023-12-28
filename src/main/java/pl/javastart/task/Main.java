package pl.javastart.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoordinateSystem coordinateSystem = new CoordinateSystem();
        coordinateSystem.run(scanner);
        coordinateSystem.compareCoordinate();
    }
}
