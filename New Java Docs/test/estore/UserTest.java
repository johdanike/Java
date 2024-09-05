package estore;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest{
    Estore user;

    @BeforeEach
    public void setUp(){
        user = new Estore();
    }

    @Test
    void test_that_user_exists(){
        assertTrue(user.userExists() );
    }

}
