/*Exercice 1.1 : Le programme suivant présente des problèmes, trouver lesquels et utiliser
tous les moyens permettant l’affichage des 2 instructions en utilisant notamment le
mécanisme d’exception (au passage, d’où sort la méthode getClass() ?)*/



package fr.fms.exception;

import java.util.Date;

public class FoundException {

	public static void main(String[] args) {

		
		Date date = null;
		Date today = new Date();
		
		// Utiliser try pour indiquer où peut-il avoir lieu l'exception
		try {
			System.out.println(date.getClass().getName()); 
		//Ici on capture l'exception
		} catch (NullPointerException e) {   //Exception - null
			System.out.println(e);
		}
		
		//On passa toujour par là
		System.out.println(today.getClass().getName()); //La méthode getClass() sort de Object 
	}

}


/* Class NullPointerException

    java.lang.Object
        java.lang.Throwable
            java.lang.Exception
                java.lang.RuntimeException
                    java.lang.NullPointerException public class NullPointerException
 
extends RuntimeException
Thrown when an application attempts to use null in a case where an object is required. These include:

Calling the instance method of a null object.
Accessing or modifying the field of a null object.
Taking the length of null as if it were an array.
Accessing or modifying the slots of null as if it were an array.
Throwing null as if it were a Throwable value. 
Applications should throw instances of this class to indicate other illegal uses of the null object. 
NullPointerException objects may be constructed by the virtual machine as if suppression were disabled and/or 
the stack trace was not writable.*/