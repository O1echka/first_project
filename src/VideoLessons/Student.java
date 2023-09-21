package VideoLessons;

public class Student {
    int id;
    public String name;
    public String surname;
    int course;
    double math;
    double economic;
    double language;

    Student(int id, String name1, String surname1, int course1, double math1, double economic1, double language1) {
        this.id = id;
        name = name1;
        surname = surname1;
        course = course1;
        math = math1;
        economic = economic1;
        language = language1;
    }

    Student(int id2, String name2, String surname2, int course2) {
        this(id2, name2, surname2, course2, 0, 0, 0);
    }

    Student() {
    }

    @Override
    public boolean equals(Object student) {
        Student student1 = (Student) student;
        return this.id == student1.id && this.course == student1.course;
    }
}

class StudentTest {
    // Методы
    double ArithmeticMeanScore(Student St) {
        double ams = (St.math + St.economic + St.language) / 3;
        System.out.println(String.join(" ", St.name, St.surname, "-", "Arithmetic mean score:", String.valueOf(ams), "Points"));
        return ams;
    }

    void compare(Student student1, Student student2) {
//      if (student1.id == student2.id && student1.course== student2.course)


//    if (student1.id == student2.id)
//        if( student1.course== student2.course)


    }


    public static void main(String[] args) {
//Данные для шаблона
        Student St1 = new Student(1, "Homer", "Simpson", 5, 3, 5, 4);

        Student St2 = new Student(2, "Marge", "Simpson", 6);
        St2.math = 5;
        St2.economic = 5;
        St2.language = 5;

        Student St3 = new Student();
        St3.id = 3;
        St3.name = "Bart";
        St3.surname = "Simpson";
        St3.course = 1;
        St3.math = 2;
        St3.economic = 2;
        St3.language = 2;

        Student St4 = new Student();

// Вывод метода на экран :
        StudentTest Test = new StudentTest();
        Test.ArithmeticMeanScore(St1);
        Test.ArithmeticMeanScore(St2);
        Test.ArithmeticMeanScore(St3);
        Test.ArithmeticMeanScore(St4);
    }
}


//Как отобразить отдельно данные, не добавляя пробел возле имени (St2) или ставя пробел в коде как символ (St3)?
//Ответ: System.out.println(String.join(" ", St1.name, St1.surname, String.valueOf(Amc1)));
