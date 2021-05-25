import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index: ");
		
		try {
			int index = input.nextInt();
			System.out.println("array[" + index + "] = " + array[index]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("INDEX " + e.getLocalizedMessage());
		} catch (Exception ex) {
			System.out.println("INVALID INPUT");
		}
	}

}
