package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    Bank gtBank;

    @BeforeEach
    public void startAllTestWithThis(){
        gtBank = new Bank();

    }
    @Test
    public void createAccountNumberOfAccountsIsOneTest() {
        gtBank.createAccountFor("John-Daniel", "Ikechukwu", "correctPin");
        assertEquals(1, gtBank.countAccount());
    }

    @Test
     public void depositAmountInAcc1Test(){
        gtBank.createAccountFor("John-Daniel", "Ikechukwu", "correctPin");
        assertEquals(1, gtBank.countAccount());
        gtBank.deposit(1, 5_000);
        assertEquals(5_000, gtBank.getBalance(1, "correctPin"));
     }
//
//     @Test
//    public void deposit5kInAcc1_withdraw3k_balanceIs2kTest(){
//         gtBank.createAccountFor("John-Daniel", "Ikechukwu", "correctPin");
//         assertEquals(1, gtBank.countAccount());
//        gtBank.deposit(1, 5_000);
//        assertEquals(5_000, gtBank.getBalance(1, "correctPin"));
//        gtBank.withdraw(1, 3_000, "correctPin");
//        assertEquals(2_000, gtBank.getBalance(1, "correctPin"));
//     }
//
//     @Test
//    public void deposit5kInAcc1_transfer3kToAcc2_balanceIs1kTest(){
//        gtBank.createAccountFor("John-Daniel", "Ikechukwu", "correctPin");
//        assertEquals(1, gtBank.countAccount());
//        gtBank.deposit(1, 5_000);
//        gtBank.createAccountFor("Chinaza", "Goodness", "correctPin");
//        assertEquals(2, gtBank.countAccount());
//        gtBank.transfer(1, 2,3_000, "correctPin");
//        assertEquals(2_000, gtBank.getBalance(1, "correctPin"));
//        assertEquals(3_000, gtBank.getBalance(2, "correctPin"));
//    }
//
//    @Test
//    public void closeAccountTest(){
//        gtBank.createAccountFor("John-Daniel", "Ikechukwu", "correctPin");
//        assertEquals(1, gtBank.countAccount());
//        gtBank.closeAccount(1, "correctPin");
//        assertEquals(0, gtBank.countAccount());
//    }
}
