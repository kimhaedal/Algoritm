package prac_0406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Algo1874 {

	public static void main(String[] args) throws Exception {
		BufferedReader BuffR=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter BuffW=new BufferedWriter(new OutputStreamWriter(System.out));
		Stack stack= new Stack();// 정렬된 숫자 넣는 스택
		ArrayList Plma=new ArrayList();//+,- 넣는 곳
		int index=0;
		int Input=Integer.parseInt(BuffR.readLine());
		int [] InputArr=new int[Input];//입력한 숫자 크기의 배열 생성
		for(int i=0; i<Input; i++) {
			InputArr[i]=Integer.parseInt(BuffR.readLine());
		}
		for(int i=1; i<=Input; i++) {
			stack.add(i);//스택에 1부터 입력한 숫자까지의 수를 넣음
			Plma.add('+'); // 리스트에 +를 전부 집어 넣는다.
			while(!stack.isEmpty() && InputArr[index]==(int)stack.peek()) {
				index++;
				stack.pop();
				Plma.add('-');
			}
			
		}
		if(!stack.isEmpty()) {
			BuffW.write("NO");
		}else {
			for(int i=0;i<Plma.size(); i++) {
				BuffW.write(Plma.get(i)+""+"\n");
			}
		}

		BuffR.close();
		BuffW.flush();
	}

}
