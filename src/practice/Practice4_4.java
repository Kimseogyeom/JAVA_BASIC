package practice;
import java.util.Scanner;

class Phone{
	String name,tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String search(String search) {
		if(name.equals(search)) {
			System.out.printf("%s�� ��ȣ�� %s�Դϴ�.",search, tel);
			return tel;
		}
		else
			return null;
	}
}
public class Practice4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, tel, search, search_tel = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ο���>>");
		int num = scanner.nextInt();
		Phone [] phone = new Phone [num];
		for(int i = 0; i < num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(��ȣ�� �������� �Է�)>>");
			name = scanner.next();
			tel = scanner.next();
			phone[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		while(true) {
			System.out.print("�˻��� �̸�>>");
			search = scanner.next();
			if(search.equals("exit")) {break;}
			for(int j=0; j<num;j++) {
				search_tel = phone[j].search(search);
				if(search_tel != null) {break;}
				}
			if(search_tel ==null){
				System.out.printf("%s��(��) �����ϴ�.\n",search);
			}
		}
	}

}
