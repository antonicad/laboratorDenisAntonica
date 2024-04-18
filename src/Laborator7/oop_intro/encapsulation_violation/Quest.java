package Laborator7.oop_intro.encapsulation_violation;

public class Quest {
    // possible options for status
    private static final int NOT_PICKED = 0;
    private static final int PICKED = 1;
    private static final int COMPLETED = 2;

    // state
    public String title;
    public int reward;
    public int status;

    // Constructor
    public Quest(String title, int reward, int status){
        this.title = title;
        this.reward = reward;
        this.status = status;
    }

    // Other behavior
}