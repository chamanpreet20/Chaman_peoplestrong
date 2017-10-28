package login_test;

import java.lang.reflect.Array;

public class Array_test {

	public static void main(String[] args) {
		String name = "abc";
		for (int i = 1; i<= name.length() - 1; i++) {
			char find = name.charAt(i);
			for (int j =i+1; j<=name.length()-1; j++) {
				char find2 = name.charAt(j);
				if (find == find2) {
					System.out.println("Duplicate character found for " + name.charAt(j));
				} else {
					//System.out.println("No duplicate character");
				}
			}
		}

	}

}
