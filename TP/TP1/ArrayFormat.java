
public class ArrayFormat{
	public static void main(String[] args) {
		int[] tab = new int[100];

		for (int i = 0; i < 20; i++) {
			tab[i] = 0;
		}

		for (i = 20; i < 80; i++) {
			tab[i] = 2;
		}

		for (i = 80; i < 100; i++) {
			tab[i] = 8;
		}

		//System.out.println(tab.toString());
	}	
}