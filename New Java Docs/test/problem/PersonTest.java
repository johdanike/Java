package problem;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    public void testThatAPersonCanCreateProblem() {
        Person person = new Person();
        String response = person.createProblem("John", "Jobless", "FINANCIAL");

        assertTrue(response.contains("John"));
        assertTrue(response.equalsIgnoreCase("""
        Created: Problem Name: John
        Username: Jobless
        Problem Status: true
        Problem Type: FINANCIAL
        is solved: false"""));
    }

    @Test
    public void testThatAPersonCanUpdateProblem() {
        Person person = new Person();
        var res = person.createProblem("John", "Jobless", "FINANCIAL");

        System.out.println("Created "+ res.contains("Jobless"));
        Person updated = person.updateProblem("John", "Jobless", true);

//        assertEquals(updated.getProblemStatus(), true);
        assertTrue(updated.getProblemStatus());
    }
}
