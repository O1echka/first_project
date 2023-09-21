package Tigran;

class Main {

    public static void main(String[] args) {
//        int[] integers = new int[]{1, 2, 3, 4, 5, 6, 10, 20, 150};
//        char[] chars = new char[] {'a','b','c'};
//        boolean[] booleans = new boolean[] {true, false, false, true};
//        String[] strings = new String[] {"amazon.com", "Listerine", "Rozetka"};
        System.out.println("Open Rozetka");
        System.out.println("Search for Zont");
        String[] foundResults = new String[] {"zont", "zontik", "car"};
//        System.out.println(integers[integers.length - 1]);

        for (int index = 0; index < foundResults.length; index++) {
            System.out.println(foundResults[index].contains("zont"));
        }

        System.out.println("Open Rozetka");
        System.out.println("Look at categories");
        String[] categories = new String[] {"cloths", "garden", "car"};

        for (int index = 0; index < categories.length; index++) {
            if(categories[index].equals("garden")) {
                System.out.println("Click garden");
                break;
            }
        }
//        int index = 0;
//        while (index < integers.length) {
//            System.out.println(integers[index]);
//            index++;
//        }
//        int index = 0;
//        do {
//            System.out.println(integers[index]);
//            index++;
//        } while (index < integers.length);
    }
}