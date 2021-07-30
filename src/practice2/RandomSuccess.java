package practice2;
import java.util.Random;


public class RandomSuccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			 Random random = new Random();
			 int [] array = new int[3];
			 for(int i = 0; i < 3; i++) {
				 array[i] = random.nextInt(2)+1;
			 }
			 System.out.println(array[0]+"\t"+array[1]+"\t"+array[2]);
			 if(array[0]==array[1] && array[0]==array[2]) {
				 System.out.println("¼º°ø");
				 break;
			 }
			 else
				 continue;
		}
	}

}
