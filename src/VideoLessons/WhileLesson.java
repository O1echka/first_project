package VideoLessons;

public class WhileLesson {

    static void time() {
        int hour = 0;
        int min = 0;
        int sec = 0;
        OUTER:
        while (hour < 12) {
            MIDDLE:
            while (min < 60) {
                INNER:
                while (sec < 60) {
                    System.out.println(hour + ":" + min + ":" + sec);
                    sec++;
                }
                sec = 0;
                min++;
            }
            min = 0;
            hour++;
        }
    }


    public static void main(String[] args) {
        time();
    }
}
