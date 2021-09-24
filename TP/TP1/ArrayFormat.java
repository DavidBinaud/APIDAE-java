import java.util.Arrays;

public class ArrayFormat{
	public static void main(String[] args) {
		int[] tab = new int[100];

		Arrays.fill(tab, 0, 20, 0);
		Arrays.fill(tab, 20, 80, 6);
		Arrays.fill(tab, 80, 100, 8);

		System.out.println(Arrays.toString(tab));
	}	
}