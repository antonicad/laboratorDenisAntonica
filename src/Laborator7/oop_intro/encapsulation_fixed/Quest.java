package Laborator7.oop_intro.encapsulation_fixed;

public class Quest {
    private static final int NOT_PICKED = 0;
    private static final int PICKED = 1;
    private static final int COMPLETED = 2;

    private String title;
    private int reward;
    private int status;

    public Quest(String title, int reward, int status){
        this.title = title;
        this.reward = reward;
        this.status = status;
    }

    public String getTitle() {
        return this.title;
    }

    public int getReward() {
        return this.reward;
    }

    public int getStatus() {
        return this.status;
    }

    public void setQuestNotPicked(){
        this.status = NOT_PICKED;
    }

    public void setQuestPicked(){
        this.status = PICKED;
    }

    public void setQuestCompleted(){
        this.status = COMPLETED;
    }

    // other behavior

}