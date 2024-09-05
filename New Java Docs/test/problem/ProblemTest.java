package problem;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {
//    private Problem problem;
//
//    @BeforeEach
//    public void setUp() {
//        problem = new Problem( "", " ");
//    }

    @Test
    void test_thatProblemExists(){
        Problem problem = new Problem( Type.TECHNICAL);
        assertTrue(problem.problemExists());
    }
    @Test
    void test_thatFinancialProblemExist(){
        Problem problem = new Problem( Type.FINANCIAL);
        problem.createProblem("School-fee", Type.FINANCIAL);
        assertTrue(problem.problemExists());
    }
    @Test
    void test_thatTechnicalProblemExist() {
        Problem problem = new Problem(Type.TECHNICAL);
        problem.createProblem("Low oil", Type.TECHNICAL);
        assertTrue(problem.problemExists());
    }
}
