class Student2 {
    private String accno;
    private double balance;

    public String getAccno() {
        return accno;
    }

    public void setAccno(String newAccno) {
        accno = newAccno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        if (newBalance > 0) {
            balance = newBalance;
        } else {
            System.out.println("Balance must be positive!");
        }
    }
}

public class Encaps {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.setAccno("ABC123"); // account number should be string
    
         s1.setBalance(-1000);

        System.out.println("Account Number: " + s1.getAccno());
        System.out.println("Balance: " + s1.getBalance());
    }
}
