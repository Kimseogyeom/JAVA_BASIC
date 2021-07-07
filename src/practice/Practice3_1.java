package practice;
import java.util.Scanner;
import java.util.Random;


public class Practice3_1 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		while(true){
			int k = r.nextInt(100);
			System.out.println("수를 결정하였습니다. 맞추어 보세요\n0~99");
			for(int i = 1; true; i++) {
				int input = scanner.nextInt();
				System.out.printf("%d>>%d\n",i,input);
				if(input < k) {
					System.out.println("더 높게");
				}
				else if(input > k){
					System.out.println("더 낮게");
				}
				else if(input == k) {
					System.out.println("맞았습니다.");
					break;
				}
				else {
					System.out.println("잘못입력하셨습니다 다시 입력해주세요");
				}
			}
			System.out.println("다시하시겠습니까(y/n)");
			if(scanner.next().equals("n")) {
				break;
			}
		}
		scanner.close();
	}
}
