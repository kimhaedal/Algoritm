package prac_0405;

import java.util.Scanner;

public class asd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		String[] sArr = null;
		
		for(int i=0; i<T; i++) {
			String str = scan.nextLine();
			sArr = str.split(" ");	// ���ڿ� str�� ���� �������� �߶� ���ڿ� �迭�� �ֱ�
			
			// ���ڿ� �迭�� �� �ε��� ����
			for(int j=0; j<sArr.length; j++) {
				// j��° �ε����� ���ڿ��� ���������� ���  
				for(int k=sArr[j].length()-1; k>=0; k--) 
					System.out.print(sArr[j].charAt(k));
				System.out.print(" ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}

