package allprogrames;

public class ReverseString {

	public static void main(String[] args) {

		String name = "My Name is Mudasir";
		System.out.println("Before Reversing String is : " + name);
		
		int lag = name.length();
		String rev = "";
		
		for (int i = lag - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println("After Reversing String is : " + rev);
	}

}
