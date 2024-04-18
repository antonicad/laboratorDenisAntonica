package Laborator7.oop_intro.encapsulation_fixed;

import Laborator7.oop_intro.encapsulation_fixed.Quest;

public class QuestTest {
	public static void main(String[] args) {
	    Quest quest = new Quest("Goblin Slaying", 190, 4);
//	    quest.reward = 1000000000;
//	    quest.status = 5;
	    
	    System.out.println(quest.getReward());
	    System.out.println(quest.getStatus());
	}
}
