package VideoLessons;

public class SwitchLesson {
    public static void main(String[] args) {
//Нужно отобразить сколько дней в месяце
        int nomberMounth = 5;
        switch (nomberMounth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В месяце 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В месяце 30 дней");
                break;

            case 2:
                System.out.println("В месяце 28 дней");
                break;
            default:
                System.out.println("неверная информация");


        }
    }
}
