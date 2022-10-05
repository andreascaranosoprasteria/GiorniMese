package com.soprasteria;

import java.util.Scanner;

public class Main {
	static final byte GIORNI_31 = 31;
	static final byte GIORNI_30 = 30;
	static final byte GIORNI_28 = 28;
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// DEFINIZIONE COSTANTI GIORNI DEI MESI
	
		System.out.println(">>Numero giorni del mese:");
		switch(input.nextByte()) {
		case  GIORNI_28 : System.out.println("Febbraio"); break;
		case GIORNI_30 : System.out.println("Novembre - Aprile - Giugno - Settembre"); break;
		case GIORNI_31 : System.out.println("Gennaio - Marzo - Maggio - Luglio - Agosto - Ottobre - Dicembre"); break;
		default: System.out.println("Cifra inserita errata!");
		}
		input.close();
	}

}
