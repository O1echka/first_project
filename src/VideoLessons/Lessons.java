
//   Вопросы:
// 1 class Overloading. Можно ли создать сумму из нескольких чисел в скобках, с помощью только 1 метода?



package VideoLessons;

public class Lessons {
    public static void main(String[] args) {
        //  OneDislayText();
        //  TwoDisplayBytes();
        //  ThreeDisplayArithmetic();
    }

    private static void OneDislayText() {
        //Урок 1. Вывести стихотворение на экран. Вопрос: не нашла как выравнивать текст (кроме как пробелами).
        System.out.println("                  РУБАИ");
        System.out.println("Много лет размышлял я над жизнью земной.");
        System.out.println("Непонятного нет для меня под луной.");
        System.out.println("Мне известно, что мне ничего не известно!");
        System.out.println("Вот последняя правда, открытая мной.");
        System.out.println("                                 О. Хайям");
        System.out.println();
    }
    private static void TwoDisplayBytes() {
        //Урок 2. Отобразить переменные в разных системах счисления. Вопрос: как такое зааписывать более компактно?
        byte b1 = 12;     //DEC десятиричная
        byte b2 = 0xC;    //hex шестнадцатиричная 0X_
        byte b3 = 0_14;   //oct восьмиричная 0_
        byte b4 = 0b1100; //bin двоичная 0B_
        System.out.println("Целые числа");
        System.out.print(b1);
        System.out.print(b2);
        System.out.print(b3);
        System.out.println(b4);
        short s1 = 1300;
        short s2 = 0x514;
        short s3 = 0_2424;
        short s4 = 0b0101_0001_0100;
        int i1 = 0;
        int i2 = 0x0;
        int i3 = 0_0;
        int i4 = 0b0;
        long l1 = 123456789L;
        long l2 = 0x75BCD15L;
        long l3 = 0_726746425L;
        long l4 = 0b0111_0101_1011_1100_1101_0001_0101L;
        System.out.print(s1);
        System.out.print(s2);
        System.out.print(s3);
        System.out.println(s4);
        System.out.print(i1);
        System.out.print(i2);
        System.out.print(i3);
        System.out.println(i4);
        System.out.print(l1);
        System.out.print(l2);
        System.out.print(l3);
        System.out.println(l4);

        float f1 = 0.12F;
        double d1 = 3.14;
        System.out.println("Дробные");
        System.out.println(f1);
        System.out.println(d1);

        boolean bl1 = true;
        boolean bl2 = false;
        System.out.println("Да-нет");
        System.out.println(bl1);
        System.out.println(bl2);

        char c1 = 'ȫ';
        char c2 = 555;
        char c3 = '\u022B';
        char c4 = 'Ş';
        char c5 = 350;
        char c6 = '\u015e';
        System.out.println("Символы");
        System.out.print(c1);
        System.out.print(c2);
        System.out.println(c3);
        System.out.print(c4);
        System.out.print(c5);
        System.out.println(c6);

        System.out.println();
    }
    private static void ThreeDisplayArithmetic() {
        // Урок 3. Арифметические и лоические операции. Вопрос: это гдето используют -- ++
        System.out.println("Арифметические и лоические операции");
        int i31 = 5;
        int i32 = 11;
        double d31 = 5.5;
        double d32 = 1.3;
        long L31 = 20L;
        double result = 0;
        result = i32 / d31 + d32 % i31 - L31;
        System.out.println(result);

        int a = 5;
        System.out.println(a-- - --a + ++a + a++ + a);
        int b = 8;
        System.out.println(++b - b++ + ++b - --b);
    }
}