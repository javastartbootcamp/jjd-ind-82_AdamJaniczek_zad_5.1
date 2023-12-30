package pl.javastart.task;

public class Point {
    private int coordinateX;
    private int coordinateY;

    public int coordinateX() {
        return coordinateX;
    }

    public int coordinateY() {
        return coordinateY;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    String point() {
        String point = String.format("Punkt (%d, %d)", coordinateX(), coordinateY());
        return point;
    }

    void pointInTheMiddle() {
        System.out.printf("%s leży na środku układu współrzędnych", point());
    }

    void pointOnTheXorYaxis(String axis) {
        System.out.printf("%s leży na osi %s", point(), axis);
    }

    void pointOnTheQuadrant(String quadrant) {
        System.out.printf("%s leży w %s ćwiartce układu współrzędnych", point(), quadrant);
    }
}
