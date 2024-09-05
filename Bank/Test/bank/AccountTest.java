package bank;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account account;
    private final String correctPin = "pin";

    @BeforeEach
    public void startAllTestWithThis() {
        account = new Account(1,"","",correctPin);
        Account account2 = new Account(2, "janet", "Chibuzo", correctPin);
    }

   @Test
    public void newAccount_balanceIsZeroTest() {
        assertEquals(0, account.getBalance(1,correctPin));
   }

    @Test
    public void deposit7kAnd2k_balanceIs10kTest(){
       assertEquals(0, account.getBalance(1, correctPin));
       account.deposit(7_000);
       assertEquals(7_000, account.getBalance(1, correctPin));
       account.deposit(3_000);
       assertEquals(10_000, account.getBalance(1, correctPin));

    }

    @Test
    public  void depositMinus1k_balanceIsZeroTest(){
       assertEquals(0, account.getBalance(1, correctPin));
       account.deposit(-1000);
       assertEquals(0, account.getBalance(1, correctPin));
    }

    @Test
    public void deposit10kAndWithdraw5k_balanceIs5kTest(){
       assertEquals(0, account.getBalance(1, correctPin));
       account.deposit(10_000);
       assertEquals(10_000, account.getBalance(1, correctPin));
       account.withdraw(5_000, correctPin);
       assertEquals(5_000, account.getBalance(1, correctPin));
    }


    @Test
    public void deposit2k_and_withdraw10k_balanceIs2kTest(){
           assertEquals(0, account.getBalance(1, correctPin));
           account.deposit(2_000);
           assertEquals(2_000, account.getBalance(1, correctPin));
           account.withdraw(10_000, correctPin);
           assertEquals(2_000, account.getBalance(1, correctPin));
    }

    @Test
    public void deposit2k_and_withdrawMinus10k_balanceIs2kTest(){
        assertEquals(0, account.getBalance(1, correctPin));
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance(1, correctPin));
        account.withdraw(-10_000, correctPin);
        assertEquals(2_000, account.getBalance(1, correctPin));
    }

    @Test
    public void deposit2k_and_withdraw2k_balanceIsZeroTest(){
        assertEquals(0, account.getBalance(1, correctPin));
        account.deposit(2_000);
        assertEquals(2_000, account.getBalance(1, correctPin));
        account.withdraw(2_000, correctPin);
        assertEquals(0, account.getBalance(1, correctPin));
    }

    @Test
    public void updatePinTest(){
       account.deposit(2_000);
       assertEquals(2_000, account.getBalance(1, correctPin));
        account.updatePin(1, correctPin, "newPin");
       assertEquals(2_000, account.getBalance(1,"newPin"));
        System.out.println(account.getPin());
       assertEquals(2_000, account.getBalance(1, "newPin"));
       assertThrows(IllegalArgumentException.class,()-> account.getBalance(1, correctPin));
       //assertEquals(2_000, account.getBalance(correctPin));

    }





}
