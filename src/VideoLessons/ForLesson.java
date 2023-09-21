package VideoLessons;

public class ForLesson {

    static void time() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int min = 0; min < 60; min++) {
                if (hour > 1 && min % 10 == 0) {
                    break OUTER;
                }

                INNER:
                for (int sec = 0; sec < 60; sec++) {
                    if (sec * hour < min) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }


    public static void main(String[] args) {
        time();
    }

}
