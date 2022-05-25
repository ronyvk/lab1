  //Lab 1

//Rony Varghese
//   200455686
import java.time.LocalDate;

public class Tester {

    public static void main(String[] args) {

        Customer cstmr = new Customer("Rony","Varghese","Barrie","2538163804", LocalDate.of(2021,10,04));


        Account acc = new Account(cstmr);
        acc.deposit(1000);
        acc.withdraw(1000);

        System.out.println(acc.toString());

        CheckingAccount ChA= new CheckingAccount(acc.getBalance(),cstmr,4,10,1000);
        ChA.withdraw(750);

        System.out.println(ChA.toString());

        SavingsAccount SVA = new SavingsAccount(ChA.getBalance(),cstmr,3.55,0.005);
        SVA.deposit(1000);




            System.out.println(SVA.toString());


    }

}