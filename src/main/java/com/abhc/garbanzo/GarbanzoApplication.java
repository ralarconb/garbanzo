package com.abhc.garbanzo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GarbanzoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarbanzoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		int myInt = scanner.nextInt();
		for (int i = 0; i < myInt; i++) {
			String myString = scanner.next();
			char[] chars = myString.toCharArray();
			String odds = "";
			String evens = "";
			for (int j = 0; j < myString.length(); j++) {
				if (j % 2 == 0) {
					evens += chars[j];
				} else {
					odds += chars[j];
				}
			}
			System.out.println(evens + " " + odds);
		}
		scanner.close();
	}

}
