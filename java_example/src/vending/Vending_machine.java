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
        	System.out.println("��带 �����ϼ���");
        	System.out.println("1 : �ǸŸ��");
        	System.out.println("2 : �����ڸ��");
        	System.out.println("3 : ���� OFF");
        	int mode = sc.nextInt();
        	
        	switch(mode) {
        	case 1: 
        		sale.sale_mode();
        		break;
        		
        	case 2: 
        		mg.manage_mode();
        		break;
        		
        	case 3: 
        		System.out.println("������ �����մϴ�.");
        		System.exit(0);
        		break;
        		
        	default:
        		System.out.println("�߸��� �Է��Դϴ�.");
        		break;
        	}
        }
        
    }
}
