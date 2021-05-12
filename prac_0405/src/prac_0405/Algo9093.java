package prac_0405;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Algo9093 {

	public static void main(String[] args) throws Exception {
		BufferedWriter BufferW=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader BufferR = new BufferedReader(new InputStreamReader(System.in));
		int TestCase = Integer.parseInt(BufferR.readLine());
		Stack<String> Stack = new Stack<>();
		
		for (int i = 0; i < TestCase; i++) {
			String WordInput = BufferR.readLine();
			for (int j = 0; j < WordInput.length(); j++) {
				if (WordInput.charAt(j) == ' ') {
					while (!Stack.isEmpty()) {
						BufferW.write(Stack.pop());
					}
					BufferW.write(" ");
				} else {
					Stack.add(WordInput.charAt(j)+"");
				}
			}
			while(!Stack.isEmpty()) {
				BufferW.write(Stack.pop());
			}
			BufferW.write('\n');
		}
		BufferR.close();
		BufferW.flush();
	}
}
