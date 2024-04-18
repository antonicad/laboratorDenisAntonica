package Laborator7.oop_intro;

public class Lamp {
	  
	  // stores the value for light
	  // true if light is on
	  // false if light is off
	  private boolean isOn;

	  // method to turn on the light
	  public void turnOn() {
	    isOn = true;
	    System.out.println("Light on? " + isOn);

	  }

	  // method to turnoff the light
	  public void turnOff() {
	    isOn = false;
	    System.out.println("Light on? " + isOn);
	  }	  
}