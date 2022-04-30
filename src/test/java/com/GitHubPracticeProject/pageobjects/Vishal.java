package com.GitHubPracticeProject.pageobjects;

public class Vishal {

	public static void main(String[] args) {

		int num = 23;

		int num1 = 101;

		int count = 0;

		if (num > 1) {

			for (int i = 1; i <= num; i++) {

				if (num % i == 0)
					count++;
			}

			if (count == 2) {
				System.out.println(num + " is a prime number");
			} else {
				System.out.println(num + " is not a prime number");
			}

		}
		else {
			System.out.println("Not prime number");
		}


	}

}
