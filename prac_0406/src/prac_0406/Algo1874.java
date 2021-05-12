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
		Stack stack= new Stack();// ���ĵ� ���� �ִ� ����
		ArrayList Plma=new ArrayList();//+,- �ִ� ��
		int index=0;
		int Input=Integer.parseInt(BuffR.readLine());
		int [] InputArr=new int[Input];//�Է��� ���� ũ���� �迭 ����
		for(int i=0; i<Input; i++) {
			InputArr[i]=Integer.parseInt(BuffR.readLine());
		}
		for(int i=1; i<=Input; i++) {
			stack.add(i);//���ÿ� 1���� �Է��� ���ڱ����� ���� ����
			Plma.add('+'); // ����Ʈ�� +�� ���� ���� �ִ´�.
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
