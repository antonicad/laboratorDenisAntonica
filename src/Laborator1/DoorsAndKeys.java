package Laborator1;

public class DoorsAndKeys {
	public static void main(String args[]) {
//		rgbBRG
//		RgbrBG
//		bBrRgG
//		rgRGBb

		String testCase = "rgRGBb";
		
		String[] doors = {"R", "G", "B"};
		String[] keys = {"r", "g", "b"};
		
		boolean canGo = true;
		for (int i = 0; i < doors.length; i++) {
			int doorPosition = testCase.indexOf(doors[i]);
			int keyPosition = testCase.indexOf(keys[i]);
			
			if (doorPosition < keyPosition) {
				canGo = false;
				break;
			}
		}
		
		if (canGo) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}