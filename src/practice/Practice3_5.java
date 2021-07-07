package practice;
import java.util.Scanner;
import java.util.Arrays;
public class Practice3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 10개를 입력하세요>>");
		int array [] =new int[10];
		for(int i = 0; i<10; i++) {
			int num = scanner.nextInt();
			array[i] = num;
		}
		System.out.println(Arrays.toString(array));	
		for(int j = 0; j < 9; j++) {
			int temp = 0;
			for(int z = j+1; z < 10; z++) {
				if(array[j] > array[z]) {
					temp = array[j];
					array[j] = array[z];
					array[z] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));	
		scanner.close();
	}

}
