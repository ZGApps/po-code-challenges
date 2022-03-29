package com.PO.lockers;

import java.util.HashMap;

public class LockerProblem {

	public static void main(String[] args) {

		//Bool[] version
//		boolean[] lockers = new boolean[100];
//		
//		for(int i = 0; i<100; i++) {
//			lockers[i] = false;
//		}
//		countOpen(lockers);
//		solveProblem(lockers);
//		countOpen(lockers);
//		
//		
		
		//HashMap Version
		HashMap<Integer, Boolean> lockers = new HashMap<Integer, Boolean>();
		
		for(int c=1; c<=100; c++) {
			lockers.put(c, false);
		}
		
		printOpen(lockers);
		
		solveProblem(lockers);
		
		printOpen(lockers);
	}
	
	//bool[] methods
//	public static void solveProblem(boolean[] input) {
//		
//		for(int i = 0; i<100; i++) {
//			for(int l = 0; l<100; l++) {
//				if((i+1)%(l+1) == 0) {
//					input[l] = !input[l];
//				}
//			}
//		}
//		
//	}
//	
//	public static void countOpen(boolean[] input) {
//		int count = 0;
//		for(int i = 0; i<100; i++) {
//			if(input[i]) {
//				count++;
//			}
//		}
//		System.out.println(count + " open lockers");
//	}
	
	//HashMap Methods
	public static void printOpen(HashMap<Integer, Boolean> input) {
		int count =0;
		
		for(int l : input.keySet()) {
			if(input.get(l)) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void solveProblem(HashMap<Integer, Boolean> input) {
		for(int c=1; c<=100; c++) {
			for(int l : input.keySet()) {
				if(c%l == 0) {

					input.put(l, !input.get(l)); 
				}
			}
		}
	}
}
