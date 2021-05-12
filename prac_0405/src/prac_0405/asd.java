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
			sArr = str.split(" ");	// 문자열 str을 공백 기준으로 잘라서 문자열 배열에 넣기
			
			// 문자열 배열의 각 인덱스 기준
			for(int j=0; j<sArr.length; j++) {
				// j번째 인덱스의 문자열을 끝에서부터 출력  
				for(int k=sArr[j].length()-1; k>=0; k--) 
					System.out.print(sArr[j].charAt(k));
				System.out.print(" ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}

