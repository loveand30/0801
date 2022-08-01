import java.util.Scanner;

public class pr1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int sec, bun, si,bun_1;
		
		System.out.print("초를 입력 하세요 : ");
		int push=sc.nextInt();
		
		bun=(push/60)%60;
		
		sec=push%60;
		si=push/3600;
		
		System.out.print(push+"초는 "+si+"시간 "+bun+"분 "+sec+"초 입니다.");
		
		
		
	}
	
}
