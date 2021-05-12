package prac_0326;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Code032602 {

	public static void main(String[] args) throws IOException {
		BufferedReader BufferR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter BufferW = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer Token = new StringTokenizer(BufferR.readLine());
		int InputNum = Integer.parseInt(Token.nextToken());
		LinkedList<Integer> Stack = new LinkedList<Integer>();
		for (int i = 0; i < InputNum; i++) {
			Token = new StringTokenizer(BufferR.readLine());
			String Order = Token.nextToken();
			if (Order.equals("push")) {
				Stack.add(Integer.parseInt(Token.nextToken()));
			} else if (Order.equals("pop")) {
				if (Stack.size() > 0) {
					BufferW.write(Stack.poll() + "\n");
				} else {
					BufferW.write("-1\n");
				}
			} else if (Order.equals("size")) {
				BufferW.write(Stack.size() + "\n");
			} else if (Order.equals("empty")) {
				if (Stack.isEmpty()) {
					BufferW.write("1\n");
				} else {
					BufferW.write("0\n");
				}
			}else if(Order.equals("front")) {
				if(Stack.size()>0) {
					BufferW.write(Stack.getFirst()+"\n");
				}else {
					BufferW.write("-1\n");
				}
			}else if(Order.equals("back")) {
				if(Stack.size()>0) {
					BufferW.write(Stack.getLast()+"\n");
				}else {
					BufferW.write("-1\n");
				}
			}

		}
		BufferR.close();
		BufferW.flush();
	}
	

}
