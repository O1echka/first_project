package VideoLessons;

public class IfElse {
    static class Student {


        public double grade;
        public String name;
        int course;


        public Student(String name, int course, double grade) {
            this.name = name;
            this.course = course;
            this.grade = grade;
        }
    }

    static class StudentTest {

        public static void metod1(Student st1, Student st2) {
            if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
                System.out.println("студены одинаковые");
            } else {
                System.out.println("Студенты не одинаковые");
            }
        }


        public static void metod2(Student st1, Student st2) {
            if (st1.name.equals(st2.name)) {
                if (st1.course == st2.course) {
                    if (st1.grade == st2.grade) {
                        System.out.println("имена студентов, курсы и оценки одинаковые");

                    } else {
                        System.out.println("имена студентов и курсы одинаковые, но оценки разные");
                    }
                } else {
                    System.out.println("имена студентов и оценки одинаковые, но курсы разные");
                }
            } else {
                System.out.println("Имена студентов разные");
            }
        }

        public static void main(String[] args) {
            Student st1 = new Student("Ivan", 2, 5.5);
            Student st2 = new Student("Ivan2", 2, 6.5);
            metod1(st1, st2);
            metod2(st1, st2);


        }


    }
}
