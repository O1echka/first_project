package VideoLessons;

public class Employee {
    protected int id;
    public String surname;
    int age;
    int salary;
    private String department;

    //Конструктор:
    public Employee(int id, String surname, int age, int salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public double SalaryIncrease() {
        salary = salary * 2;
        return salary;
    }


    public String getSurname() {
        return this.surname;
    }

    public int getSalary() {
        return this.salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {

// Данные для конструктора:
        Employee emp1 = new Employee(1, "Smit", 20, 500, "Sales");
        Employee emp2 = new Employee(2, "Adams", 34, 2500, "IT");

// Вывод данных на экран:
        emp1.SalaryIncrease();
        System.out.println(String.join(" ", "New salary", emp1.getSurname(), String.valueOf(emp1.getSalary()), "$"));

        emp2.SalaryIncrease();
        System.out.println(String.join(" ", "New salary", emp2.getSurname(), String.valueOf(emp2.getSalary()), "$"));

    }
}



