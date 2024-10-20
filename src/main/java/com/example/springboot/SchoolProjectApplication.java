package com.example.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication
public class SchoolProjectApplication {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		printArray(list);
	}

	public static void printArray(List<?> list) {
		System.out.println(list);
	}
}
