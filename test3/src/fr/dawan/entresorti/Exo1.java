package fr.dawan.entresorti;

import java.util.*;
import java.time.*;
import java.time.temporal.*;
import static org.junit.Assert.assertThat;

public class Exo1 {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		int var2= 0;
		int var1 = 4;
		int var3 = 100;
		int var4 = 400;
		
		Date firstDate = new Date();
		
		System.out.println("entrer l'année :");
		var2 = input.nextInt();
		
		
		/*
		LocalDateTime inclusiveFromDate = LocalDateTime.of(2019, 6, 12, 0, 0, 0);
		LocalDateTime exclusiveToDate = inclusiveFromDate.plusDays(30).plusHours(16).plusSeconds(1);
		long differenceInDays = ChronoUnit.DAYS.between(inclusiveFromDate, exclusiveToDate);
		assertThat(differenceInDays).isEqualTo(30);
		*/
		
		if ((var2 % var1 == 0) && (var2 % var3 != 0 ) || (var2 % var4 == 400 )) {
			System.out.println("l'année est bissextile :");
			
		}
		else {
			System.out.println("l'année est normale :"); 
		}
	}
}
