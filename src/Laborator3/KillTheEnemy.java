package Laborator3;

import java.util.Arrays;

public class KillTheEnemy {
	public static void main(String[] args) {
		int health = 220;
		int[] weapons = {3,7};
		
		int solution = killTheEnemy(weapons, health);
		System.out.println(solution);
	}
	
	public static int killTheEnemy(int[] weapons, int health)
	{
		Arrays.sort(weapons);
		int maxDamageWeapon = weapons[weapons.length - 1];
		int secondMaxDamageWeapon = weapons[weapons.length - 2];
				
		if (health % (maxDamageWeapon + secondMaxDamageWeapon) == 0) {
			System.out.println("1");
			return 2 * (health / (maxDamageWeapon + secondMaxDamageWeapon));
		} else if (health % (maxDamageWeapon + secondMaxDamageWeapon) <= maxDamageWeapon) {
			System.out.println("2");
			return 2 * (health / (maxDamageWeapon + secondMaxDamageWeapon)) + 1;
		} else {
			System.out.println("3");
			return 2 * (health / (maxDamageWeapon + secondMaxDamageWeapon)) + 2;
		}
		
	}
}
