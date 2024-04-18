package Laborator7.oop_intro.encapsulation_violation;

public class QuestTest {
	public static void main(String[] args) {
	    Quest quest = new Quest("Goblin Slaying", 190, 3);
	    
	    quest.reward = 1000000000;
	    quest.status = 5;
	    
	    System.out.println(quest.reward);
	    System.out.println(quest.status);
	}
}
