package Tigran;

public class Inhertence {

}

class InheritanceTest {
    public static void main(String[] args) {
//        Shape square = new Square(5);
//        Shape rectangle = new Rectangle(5, 10);
//        System.out.println(square.calculateArea());
//        System.out.println(rectangle.calculateArea());

        Person[] people = new Person[]{
                new Students(20, "Ivan", 3, "KNURE"),
                new Students(20, "Ivan", 3, "KNURE"),
                new Students(20, "Ivan", 3, "KNURE"),
                new Students(20, "Ivan", 3, "KNURE"),
                new Students(20, "Ivan", 3, "KNURE"),
                new Employees(40, "Stepan", 5000.5, "PrivatBank"),
                new Employees(40, "Stepan", 5000.5, "PrivatBank"),
                new Employees(40, "Stepan", 5000.5, "PrivatBank")
        };
        for (Person person : people) {
            person.tellAboutMyself();
        }
    }
}

abstract class Shape {
    protected int length;

    public Shape(int length) {
        this.length = length;
    }

    public abstract int calculateArea();
}

class Square extends Shape {

    public Square(int length) {
        super(length);
    }

    @Override
    public int calculateArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    private int width;

    public Rectangle(int length, int width) {
        super(length);
        this.width = width;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }
}

abstract class Person {
    protected int age;
    protected String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void tellAboutMyself();
}

class Students extends Person {
    private int yearOfStudy;
    private String university;

    public Students(int age, String name, int yearOfStudy, String university) {
        super(age, name);
        this.yearOfStudy = yearOfStudy;
        this.university = university;
    }

    @Override
    public void tellAboutMyself() {
        System.out.println(String.format("My name is %s, I am %d years old, I study %d year at %s",
                name, age, yearOfStudy, university));
    }

    public void goToTheParty() {
        System.out.println("Drink, smoke,....");
    }
}

class Employees extends Person {

    private double salary;
    private String companyName;

    public Employees(int age, String name, double salary, String companyName) {
        super(age, name);
        this.salary = salary;
        this.companyName = companyName;
    }

    @Override
    public void tellAboutMyself() {
        System.out.println(String.format("My name is %s, I am %d years old, my salary is %s year at %s",
                name, age, salary, companyName));
    }

    public void work() {
        System.out.println("Work from 9 to 17");
    }
}
