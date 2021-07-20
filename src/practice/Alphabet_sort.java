package practice;
import java.util.Arrays;

class Insert_sort2 extends Insert_sort{
	int i, j;
	char key;
	public void insert(char arr[]) {
		for(i = 1; i < arr.length; i++) {
			key = arr[i];
			for(j = i-1; j >= 0 && arr[j] > key; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
		System.out.print("Insert sort: ");
		System.out.println(Arrays.toString(arr));
	}
}

public class Alphabet_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert_sort2 insert = new Insert_sort2();
		char Array [] = {'B','C','A','E','D'};
		System.out.print("Array: ");
		System.out.println(Arrays.toString(Array));
		insert.insert(Array);
	}
}
