package prac_0326;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Code032603 {

	public static void main(String[] args) throws IOException {
		BufferedReader BufferR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter BufferW = new BufferedWriter(new OutputStreamWriter(System.out));
		int Input = Integer.parseInt(BufferR.readLine());
		int[] NumArr = new int[10001];
		for (int i = 0; i < Input; i++) {
			NumArr[Integer.parseInt(BufferR.readLine())]++;

		}
		for (int i = 0; i < NumArr.length; i++) {
			if (NumArr[i] > 0) {
				for (int Arri = 0; Arri < NumArr[i]; Arri++) {
					BufferW.write(Integer.toString(i) + "\n");
				}
			}
		}
		BufferR.close();
		BufferW.close();
	}

}
