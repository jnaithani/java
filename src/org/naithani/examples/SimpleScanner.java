package org.naithani.examples;

import java.util.Scanner;

public class SimpleScanner {

	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		scan.close();

		System.out.println(s);
	}
}
