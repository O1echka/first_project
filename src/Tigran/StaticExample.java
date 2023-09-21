package Tigran;

public class StaticExample {

    public static String NAME = "Olga";
    public static void printName() {
        System.out.println(NAME);
    }

    public String notStaticName = "Tigran";
    public void printNotStaticName() {
        System.out.println(notStaticName);
    }
}

class StaticExampleTest{
    public static void main(String[] args) {
        StaticExample.NAME = "Ivan";
        StaticExample.printName();

        StaticExample staticExample = new StaticExample();
        staticExample.notStaticName = "Not static name";

        StaticExample staticExample1 = new StaticExample();
        staticExample1.notStaticName = "Not static name1";

        staticExample1.printNotStaticName();;
        staticExample.printNotStaticName();

    }
}
