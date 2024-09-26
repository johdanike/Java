package problem;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String username;
    private List<Problem> problems = new ArrayList<>();
    private Problem problem = new Problem();


    public String createProblem(String name, String problemName, String problemType) {
        Person person = new Person();
        person.setUsername(name);
        String username = person.getUsername();
        Problem created = problem.createProblem(problemName, Type.valueOf(problemType), username);
        problems.add(problem);
        return "Created: " + created.toString();
    }


    private void setUsername(String username) {
        this.username = username;
    }

    private String getUsername() {
        return username;
    }

    public Person updateProblem(String username, String problemName, boolean isSolved) {


        for(Problem problem : problems) {
                Problem updated = problem.updateProblem(username, problemName, isSolved);
                problems.remove(problem);
                problems.add(updated);
            Person person = new Person();
            person.setUsername(updated.getUsername());
            return person;
        }
        throw new IllegalArgumentException("problem not found");
    }


    public boolean getProblemStatus() {
        return problem.status();
    }
}
