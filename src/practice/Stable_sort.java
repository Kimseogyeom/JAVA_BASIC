package practice;

import java.util.Arrays;

class Select_sort{
	int mini = 0;
	int index = 0;
	int temp = 0;
	
	public void select (int arr[]) {
		for(int i = 0; i <arr.length -1; i++) {
			mini = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < mini) {
					mini = arr[j];
					index = j;
				}	
			}
			temp = arr[i];
			arr[i] = mini;
			arr[index] = temp;
		}
		System.out.print("Select sort: ");
		System.out.println(Arrays.toString(arr));	
	}
	
}
class Bubble_sort{
	int temp = 0;
	public void bubble(int arr[]) {
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Bubble sort: ");
		System.out.println(Arrays.toString(arr));
	}
}
class Insert_sort{
	int i, j, key;
	public void insert(int arr[]) {
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
public class Stable_sort {

	public static void main(String[] args) {
		int arr[] = {9, 8, 5, 2, 6};
		Select_sort se = new Select_sort();
		Bubble_sort bu = new Bubble_sort();
		Insert_sort in = new Insert_sort();
		se.select(arr);
		bu.bubble(arr);
		in.insert(arr);
	}

}
