package controller;

import Pilha.Pilha;

public class ConverteController {
	private Pilha pilha;
	public ConverteController() {
		pilha = new Pilha();
	}
	
	public void DecToBin(int n) {
	    if (n == 0) {
	        pilha.push(0);
	    } else {
	        recursiva(n);
	    }
	}
	
	private void recursiva(int n) {
		pilha.push(n % 2);
		if(n > 1) {
			recursiva(n/2);
		}
	}
	
	public String getBinario() {
		StringBuilder bin = new StringBuilder();
		while(!pilha.isEmpty()) {
			try {
				bin.append(pilha.pop());
			} catch (Exception e) {
				System.err.println(e);
				e.printStackTrace();
			}
		}
		
		return bin.toString();
	}
}
