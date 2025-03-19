package soalPraktikum;
public class Swalayan {
    public static void main(String[] args) {
        Account account1 = new Account("Fikri","3812345678",100000,"AB123");
        Account account2 = new Account("Deni","5612345678",2000000,"123");
        Account account3 = new Account("Susi","7412345678",100000,"AC221");

        account1.login();
        System.out.println();
        account2.login();
        System.out.println();
        account3.login();
    }
}
