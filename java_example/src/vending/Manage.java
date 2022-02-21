package vending;

import java.util.Arrays;
import java.util.Scanner;

public class Manage {


	Scanner sc = new Scanner(System.in);
	Drink[] _drinks = Vending_machine.drinks;
    public void manage_mode() {
    	label0:
    		while(true) {
		        System.out.println("무엇을 하시겠습니까?");
		        System.out.println("1 : 제품확인");
		        System.out.println("2 : 제품등록");
		        System.out.println("3 : 가격변경");
		        System.out.println("4 : 재고추가");
		        System.out.println("5 : 제품삭제");
		        System.out.println("6 : 상위메뉴로");
		        int mode = sc.nextInt();
		        switch(mode) {
		        case 1: checkPro(); break;
		        case 2: regi_pro(); break;
		        case 3: 
		        case 4: 
		        case 5: 
		        case 6: 
		            break label0;
		        }
	        }
    	
    	
    	
    }

    public void checkPro() {
    	for(int i = 0; i < 1; i++) {
    		System.out.println("1번째 칸 : " + _drinks[i].getName() + ", " + _drinks[i].getPrice() + "원");
    	}
    }
    
    public void regi_pro() {
    	
    }
	
}
