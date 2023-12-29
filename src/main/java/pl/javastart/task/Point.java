package pl.javastart.task;

public class Point {
    private int coordinateX;
    private int coordinateY;

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    void print(Point point) {
        System.out.printf("Punkt (%d, %d) ", getCoordinateX(), getCoordinateY());
    }

    void print(Point point, String quarter) {
        System.out.printf("Punkt (%d, %d) leży w %s ćwiartce układu współrzędnych.", getCoordinateX(), getCoordinateY(), quarter);
    }

    void print(String differentMessage) {
        System.out.printf("Punkt (%d, %d) leży na %s", getCoordinateX(), getCoordinateY(), differentMessage);
    }
}
