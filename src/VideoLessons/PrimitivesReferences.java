package VideoLessons;

public class PrimitivesReferences {
    static class Car {
        String color;
        String engine;
        String doorCount;

        public Car(String color, String engine, String doorCount) {
            this.color = color;
            this.engine = engine;
            this.doorCount = doorCount;

        }
    }

    static class CarTest {
        //Примитивные данные - прямые значения
        void changeDoor(Car c, String doorCount) {
            c.doorCount = doorCount;
        }

        //Референсные данные - копии значений объектов
        void changeColor(Car c1, Car c2) {
            String color = c1.color;
            c1.color = c2.color;
            c2.color = color;
        }


        public static void main(String[] args) {
//            CarTest ct = new CarTest();
//            Car car1 = new Car("red", "V4", "2");
//            Car car2 = new Car("black", "V6", "4");
//
//            System.out.println(String.join(" ", "Car 1 -", car1.color, car1.engine, car1.doorCount));
//            System.out.println(String.join(" ", "Car 2 -", car2.color, car2.engine, car2.doorCount));
//            ct.changeDoor(car1, "5");
//            ct.changeColor(car1, car2);
//            System.out.println(String.join(" ", "New Car 1 -", car1.color, car1.engine, car1.doorCount));
//            System.out.println(String.join(" ", "New Car 2 -", car2.color, car2.engine, car2.doorCount));
            int int1 = 1;
            int1 = 2;
            System.out.println(int1);
            String string1 = "string1";
            string1 = "string2";
            System.out.println(string1);
        }
    }
}
