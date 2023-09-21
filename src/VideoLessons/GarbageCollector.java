package VideoLessons;

// Создать 8 объектов. но к последней строке должно остаться 2 объекта.
public class GarbageCollector {

    public static void abc() {
        String a1 = new String("ABC");
        String a2 = new String("DEF");

    }

    public static void main(String[] args) {
        GarbageCollector g = new GarbageCollector(); //остался
        abc();
        abc();
        String a1 = new String("ABC"); //остался
        abc();
    }
}