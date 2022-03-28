package com.PO.lockers;

import java.util.HashMap;

public class LockerProblem {

	public static void main(String[] args) {

		HashMap<Integer, Boolean> lockers = new HashMap<Integer, Boolean>();
		
		for(int c=1; c<=100; c++) {
			lockers.put(c, false);
		}
		
		printOpen(lockers);
		
		solveProblem(lockers);
		
		printOpen(lockers);
	}
	
	public static void printOpen(HashMap<Integer, Boolean> input) {
		int count =0;
		
		for(int l : input.keySet()) {
			if(input.get(l)) {
//				System.out.println("Locker " + l + " is open");
				count++;
			}
		}
//		System.out.print("The number of open lockers is: ");
		System.out.println(count);
	}

	public static void solveProblem(HashMap<Integer, Boolean> input) {
		for(int c=1; c<=100; c++) {
			for(int l : input.keySet()) {
				if(l%c == 0) {

					input.put(l, !input.get(l)); 
//					if(input.get(l)) {
//						System.out.println("Iteration " + c +" locker" + l + " was opened");
//					}else {
//						System.out.println("Iteration " + c +" locker" + l + " was closed");
//					}
				}
			}
		}
	}
}
