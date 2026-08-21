package ARRAY;

public class Inserction_Delection {
    public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50, 60, 70 ,80, 70 
		 };

		array = insert(array, 5, 25);
		array = delete(array, 4);

		for (int value : array) {
			System.out.print(value + " ");
		}
	}

	private static int[] insert(int[] array, int position, int value) {
		int[] result = new int[array.length + 1];
		for (int i = 0; i < position; i++) {
			result[i] = array[i];
		}
		result[position] = value;
		for (int i = position; i < array.length; i++) {
			result[i + 1] = array[i];
		}
		return result;
	}

	private static int[] delete(int[] array, int position) {
		int[] result = new int[array.length - 1];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i != position) {
				result[j++] = array[i];
			}
		}
		return result;
	}
    
}
