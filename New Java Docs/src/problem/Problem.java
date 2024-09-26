package problem;

import java.util.ArrayList;
import java.util.List;

public class Problem {
    private boolean isSolved = true;
    private boolean status = false;
    private Type type;
    private String problemName;
    private String username;

    private List<String> problems = new ArrayList<>();

    public Problem(Type type, String name, String username) {
        this.problemName = name;
        this.type = type;
        this.username = username;
    }
    public Problem(){

    }


//    private boolean problemExists(String problemName) {
//        return this.problemName.equals(problemName);
//    }

    public Problem createProblem(String username, Type type, String problemName) {
        Problem problem = new Problem();
        problem.setProblemName(problemName);
        problem.setType(type.name());
        problem.setUsername(username);
        problem.isSolved = false;
        problem.status = true;
        problems.add(problemName);

//        return "Problem created successfully";
        return problem;
    }

    public Problem updateProblem(String username, String problemName, boolean isSolved) {
        String problem = findProblem(problemName);
        Problem problemUpdate = new Problem();
        problemUpdate.setProblemName(problemName);
        problemUpdate.setUsername(username);

        return problemUpdate;
    }

    private String  findProblem(String problemName) {
       for (String problem : problems) {
           if (problem.equals(problemName)) {
               return problemName;
           }
       }
       throw new RuntimeException("Problem not found");
    }

    private void setUsername(String username) {
        this.username = username;
    }
    String getUsername() {
        return username;
    }

    private void setType(String type) {
        this.type = Type.valueOf(type);
    }

    private void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public boolean status() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Problem Name: "+ problemName + "\nUsername: "+username+ "\nProblem Status: " + status + "\nProblem Type: " + type + "\nis solved: " + isSolved ;
    }

    private String getProblemName() {return problemName;}
    private Type getType() {return type;}

}


