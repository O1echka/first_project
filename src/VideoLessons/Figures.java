package VideoLessons;

public class Figures {

    public static final double PI = 3.14;

    public double areaOfACircle(double radius) {
        double result = PI * radius * radius;
        return result;
    }

    public static double circumferenceOfACircle(double radius) {
        double result = 2 * PI * radius;
        return result;
    }

    public void snowinfo(double radius) {
        System.out.println("Радиус " + radius);
        System.out.println("Площадь круга " + areaOfACircle(radius));
        System.out.println("Длинна окружности круга " + circumferenceOfACircle(radius));
    }

}

class FiguresTest {
    public static void main(String[] args) {
        Figures f = new Figures();
        f.areaOfACircle(3);
        Figures.circumferenceOfACircle(5.5);
        f.snowinfo(3);
    }
}