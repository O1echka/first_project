package VideoLessons;

public class Overloading {

    int summaNumber() {
        int result = 0;
        System.out.println("Сумма = " + result);
        return result;
    }

    int summaNumber(int a1) {
        int result = a1;
        System.out.println("Сумма = " + result);
        return result;
    }

    int summaNumber(int a2, int b2) {
        int result = a2 + b2;
        System.out.println("Сумма = " + result);
        return result;
    }

    int summaNumber(int a3, int b3, int c3) {
        int result = a3 + b3 + c3;
        System.out.println("Сумма = " + result);
        return result;
    }

    int summaNumber(int a4, int b4, int c4, int d4) {
        int result = a4 + b4 + c4 + d4;
        System.out.println("Сумма = " + result);
        return result;
    }

    int sum(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        System.out.println("Сумма = " + result);
        return result;
    }

}

class OverloadingTest {
    public static void main(String[] args) {
        Overloading show = new Overloading();
        show.sum();
        show.sum(2);
        show.sum(2, 15);
        show.sum(6, 3, 5);
        show.sum(9, 6, 5, 23);

    }
}