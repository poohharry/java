package vending;

import java.util.Scanner;


public class Vending_machine {
    public static void main(String args[]) {
        Manage mg = new Manage();
        Sale sale = new Sale();
        Scanner sc = new Scanner(System.in);
        while(true) {	
        	Drink[] drinks = new Drink[16];
//            drinks[0] = new Drink("coke", 500);
        	System.out.println("모드를 선택하세요");
        	System.out.println("1 : 판매모드");
        	System.out.println("2 : 관리자모드");
        	System.out.println("3 : 전원 OFF");
        	int mode = sc.nextInt();
        	
        	switch(mode) {
        	case 1: 
        		sale.sale_mode();
        		break;
        		
        	case 2: 
        		mg.manage_mode();
        		break;
        		
        	case 3: 
        		System.out.println("영업을 종료합니다.");
        		System.exit(0);
        		break;
        		
        	default:
        		System.out.println("잘못된 입력입니다.");
        		break;
        	}
        }
        
    }
}
