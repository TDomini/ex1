package com.test.javaex1;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		
		Scanner monScanner = new Scanner(System.in);
		
		System.out.println("Salut, saisissez votre prénom:");
		
		String prenom = monScanner.nextLine();
		
		System.out.println("Maintenant, saisissez votre nom :");
		
		String nom = monScanner.nextLine();
		
		
		System.out.println("Taper STP votre numero de téléphone");
		
		String telephone1EnTexte = monScanner.nextLine();
		int telephone1 = Integer.parseInt(telephone1EnTexte);
		
		System.out.println("Salut, vous vous appeler:");
		
		System.out.println(prenom);
		System.out.println(nom);
		System.out.println("Votre numero de telephone est:");
		System.out.println(telephone1EnTexte);
		
		String resultat = "Bienvenue" + prenom + nom + "Votre numero de telephone est" + telephone1EnTexte;
		
		System.out.println(resultat);
	}

}
