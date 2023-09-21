package VideoLessons;

//Шаблоны и действия с ними:
public class BankAccount {
    private int id; // = String.valueOf("Information is not available"); //Как тут написать текст?
    private String name = "Information is not available";
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    void Refill(double R) { //to lower case
        System.out.println(String.join(" ", "Replenishment amount:", String.valueOf(R), "$"));
        balance += R;
        System.out.println(String.join(" ", "New Balance:", String.valueOf(balance), "$"));
        System.out.println();
    }

    void Withdrawal(double W) {
        System.out.println(String.join(" ", "Withdrawal amount:", String.valueOf(W), "$"));
        balance += W;
        System.out.println(String.join(" ", "New Balance:", String.valueOf(balance), "$"));
        System.out.println();
    }

    void showInfo() {
        System.out.println(String.join(" ", "Id:", showId()));
        System.out.println(String.join(" ", "Name:", name));
        System.out.println(String.join(" ", "Balance:", String.valueOf(balance), "$"));
        System.out.println();
    }

    public String showId() {
        return id == 0 ? "Information not available" : String.valueOf(id);
    }
}

class BankAccountTest {
    public static void main(String[] args) {

// Данные для шаблона:
        BankAccount account1 = new BankAccount(1212, "Wednesday Addams", 10.87);
        account1.setId(123);

        BankAccount account2 = new BankAccount(3434, "Morticia Addams", 2000);

        BankAccount account3 = new BankAccount();
        //    Account3.id = 5656;
        //    Account3.name = "Gomez Addams";
        //    Account3.balance = 6000;


// Вывод данных на экран:
        account1.showInfo();
        account1.Refill(1000);
        account1.showInfo();
        account1.Withdrawal(500);
        account1.showInfo();
        account2.showInfo();
        account3.showInfo();
    }
}

