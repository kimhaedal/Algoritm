package prac_0326;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Code032601 {

	public static void main(String[] args) throws IOException {
		BufferedReader BufferR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter BufferW = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer Token = new StringTokenizer(BufferR.readLine());
		int InputNum = Integer.parseInt(Token.nextToken());
		Deque<Integer> Deque = new ArrayDeque<Integer>();
		for (int i = 0; i < InputNum; i++) {
			Token = new StringTokenizer(BufferR.readLine());
			String Order = Token.nextToken();
			if (Order.equals("push_front")) {
				Deque.addFirst(Integer.parseInt(Token.nextToken()));
			} else if (Order.equals("push_back")) {
				Deque.addLast(Integer.parseInt(Token.nextToken()));
			} else if (Order.equals("pop_front")) {
				if (Deque.size() > 0) {
					BufferW.write(Deque.poll() + "\n");
				} else {
					BufferW.write("-1" + "\n");
				}
			} else if (Order.equals("pop_back")) {
				if (Deque.size() > 0) {
					BufferW.write(Deque.pollLast() + "\n");
				} else {
					BufferW.write("-1" + "\n");
				}
			} else if (Order.equals("empty")) {
				if (Deque.isEmpty()) {
					BufferW.write("1\n");
				} else {
					BufferW.write("0\n");
				}
			} else if (Order.equals("size")) {
				BufferW.write(Deque.size() + "\n");
			} else if (Order.equals("front")) {
				if (Deque.size() > 0) {
					BufferW.write(Deque.peekFirst() + "\n");
				} else {
					BufferW.write("-1\n");
				}
			} else if (Order.equals("back")) {
				if (Deque.size() > 0) {
					BufferW.write(Deque.peekLast() + "\n");
				} else {
					BufferW.write("-1\n");
				}
			}

		}
		BufferR.close();
		BufferW.flush();
	}

}
