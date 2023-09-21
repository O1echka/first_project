package VideoLessons;

public class Calculation {

    static  int multiply ( int a, int b, int c){
        return a*b*c;
    }


        static void divide (int a, int b){
        System.out.println( "результат деления (целое число) = " + a/b + " Остаток = " + a % b);
        }

}
class Calculationshow {
    public static void main(String[] args) {
        System.out.println( "результат умножения = " + Calculation.multiply(2,3,4));
        Calculation.divide(10,3);
        System.out.println( "результат умножения = " + Calculation.multiply(3,5,5));
        Calculation.divide(159,8);

    }
}