/*Exercice 1.2 : Reprendre au choix un exercice des semaines précédentes puis ajouter un
traitement à base d’exceptions là il vous semble pertinent, il faut à minima utiliser les mots
clés throws, throw, try catch…*/


package fr.fms.exception;

import java.util.Scanner;

public class AddException
{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
	//Si l'utilisateur saisit une valeur inattendue on peut utiliser try-catch pour regler ce problème
		
        try {
            // Lire un nombre entier depuis la ligne de commande
            System.out.print("Entrez un nombre entier : ");
            int nombre = scanner.nextInt();

            // Vérifier si le nombre est positif, négatif ou zéro
            if (nombre > 0) {
                System.out.println("Le nombre est positif.");
            } else if (nombre < 0) {
                System.out.println("Le nombre est négatif.");
            } else {
                System.out.println("Le nombre est zéro.");
            }

            // Vérifier si le nombre est pair ou impair
            if (nombre % 2 == 0) {
                System.out.println("Le nombre est pair.");
            } else {
                System.out.println("Le nombre est impair.");
            }

        } catch (java.util.InputMismatchException e) { //InputMismatchException : Thrown by a Scanner to indicate that the token retrieved does not match the pattern for the expected type, or that the token is out of range for the expected type.
            System.out.println("Veuillez entrer un nombre entier. ");
        } finally {
            scanner.close();
        }
    }
}
