package hw.ch04;

import java.util.Scanner;

public class Ch04_2_7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			int choicer = scan.nextInt();
			
			switch(choicer) {
			case 1: {
				System.out.print("예금액> ");
				int deposit = scan.nextInt();
				balance += deposit; break;
			}
			case 2: {
				System.out.print("출금액> ");
				int withdraw = scan.nextInt();
				balance -= withdraw; break;
			}
			case 3: System.out.println("잔고> " + balance); break;
			
			default : {
				run=false; break;		
			}
	
		}
		
	}
	System.out.println("프로그램 종료");

}
}
