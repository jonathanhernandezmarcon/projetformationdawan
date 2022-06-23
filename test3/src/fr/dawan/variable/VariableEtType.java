package fr.dawan.variable;

public class VariableEtType {
	public static void main(String[] args) {
		char c ='a';
		System.out.println(c);
		
		byte b = 1;
		short s = 2;
		int i = 3;
		long l = 4;
		
		long l2 = 100L;
		
		long l3 = 1_000_000_000;
		System.out.println("le contenu de l3 :" + l3 );
		
		double d1 = 5.8;
		System.out.println("le contenu de d1 "+d1);
		
		/* Exos  : Afficher avec les 3 methodes
		 * 
		 * 
		 */
		
		
		double d2 = 5.7;
		double d3 = 10;
		
		System.out.println(d2/d3);
		
		System.out.printf("[%s/%s]%n",d2,d3);
		
	}

}
