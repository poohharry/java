package vending;

import java.util.Arrays;
import java.util.Scanner;

public class Manage {


	Scanner sc = new Scanner(System.in);
	Drink[] _drinks = Vending_machine.drinks;
    public void manage_mode() {
    	label0:
    		while(true) {
		        System.out.println("������ �Ͻðڽ��ϱ�?");
		        System.out.println("1 : ��ǰȮ��");
		        System.out.println("2 : ��ǰ���");
		        System.out.println("3 : ���ݺ���");
		        System.out.println("4 : ����߰�");
		        System.out.println("5 : ��ǰ����");
		        System.out.println("6 : �����޴���");
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
    		System.out.println("1��° ĭ : " + _drinks[i].getName() + ", " + _drinks[i].getPrice() + "��");
    	}
    }
    
    public void regi_pro() {
    	
    }
	
}
