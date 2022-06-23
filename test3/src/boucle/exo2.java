package boucle;

import java.util.Scanner;

public class exo2 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		int n= 244;
		/**/
		
		 double n2=Math.random() * ( 1000); 
		 int n3 = (int)n2;
		int var1 =0;
		int i= 0;
		do {
		System.out.println("entrer un nombre entier entre 1 et 1000:");
		
		var1 = input.nextInt();
		
		
		if ((var1 > 1000) || (var1 < 1)) {
			System.out.println("entrer un nombre compris entre 1 et 1000 :");
		}
		else {
		
			if (var1 > n){
				System.out.println("entrer un nombre est trop grand :");	
			}else if (var1 < n) {
				System.out.println("entrer un nombre est trop petit :");
			}
		}
		i= i+1;
		
		}  while (var1 != n); 
		
		System.out.println("vous avez trouvez en " + i + " coup"); 
}
}
