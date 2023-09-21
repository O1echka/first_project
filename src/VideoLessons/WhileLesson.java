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

    //       OUTER:
    //       for (int hour = 0; hour < 6; hour++) {
    //            MIDDLE:
    //           for (int min = 0; min < 60; min++) {
    //              if (hour > 1 && min % 10 == 0) {
    //                   break OUTER;
    //               }

    //               INNER:
    //              for (int sec = 0; sec < 60; sec++) {
    //                 if (sec * hour < min) {
    //                   continue MIDDLE;
    //               }
    //              System.out.println(hour + ":" + min + ":" + sec);
    //           }}}}


    public static void main(String[] args) {
        time();
    }
}
