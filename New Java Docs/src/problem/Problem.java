package problem;

public class Problem {
    private boolean isSolved = true;
    private Type type;
    private String name;

    public Problem(Type type) {
//        this.name = name;
        this.type = type;
    }
    public boolean problemExists() {
        return isSolved;
    }

    public void createProblem(String name, Type type) {

    }
    public String getName() {return name;}
    public Type getType() {return type;}
    public void unSolved(){isSolved = false;}

}


