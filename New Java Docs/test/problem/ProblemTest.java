package problem;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {
    private Problem problem;

    @BeforeEach
    public void setUp() {
        problem = new Problem();
    }

    @Test
    void test_that_education_Problem_Exists(){
//        Problem problem = new Problem();
        Problem response = problem.createProblem("school fee wahala", Type.valueOf("EDUCATION"), "jordy");
//        assertTrue(response.equalsIgnoreCase("Problem created successfully"));
//        assertEquals(response, "Problem created successfully");
        assertTrue(response.status());
    }
    @Test
    void test_that_financial_Problem_Exists(){
        Problem response =  problem.createProblem("Can't buy food", Type.valueOf("FINANCIAL"), "Jordy");
        assertTrue(response.status());
//        assertEquals(response, "Problem created successfully");
    }
    @Test
    void test_thatTechnicalProblemExist() {
        Problem problem = new Problem();
        Problem created = problem.createProblem("Low oil", Type.valueOf("TECHNICAL"), "Sea");
        assertTrue(created.status());
    }
}
