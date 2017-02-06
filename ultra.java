	import java.util.Scanner; 
	import javax.swing.*;
	import java.awt.*;

	//0-6 år åker gratis
	//7-19 år (Barn) åker för 14 kr
	//20-25 år (Ungdom) åker för 28 kr
	//26-64 år (Vuxen) åker för 34 kr
	//65 + (Pensionär) åker för 28 kr

	public class ultra {
		public static Component frame; 
		public static void main(String[]args) {
			getAge();
		}
			//skapa en input och be om ålder
			public static void getAge() {
			String Stringage = JOptionPane.showInputDialog("Hur gammal är du?");
			int age;
			int price;
			String answer;
			try {
				age = Integer.parseInt(Stringage);
				price = (int) calculatePrice((age));
				answer = String.format("Kostnaden för dig är %d %s", price, "Kr");
				JOptionPane.showMessageDialog(frame, answer);

		
		// hantera felet om användaren skrev in en ogiltig input
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog (frame, "fel, du måste skriva en giltig ålder");
			getAge();
		}
		}
	  


		public static double calculatePrice(int age) {
				if (age * - 1 == Math.abs(age)) falseAge();
			    else if (age < 6) return 0.00;
				else if (age <= 19 && age >=7) return 14.00;
				else if (age <= 25 && age >=20) return 28.00;
				else if (age <= 64 && age >=26) return 34.00;
				else if (age >= 65) return 28.00;
				return 0;
			}

		//ifall användaren skriver in ett negativt tal
		public static void falseAge() {
			JOptionPane.showMessageDialog(frame, "fel, du måste skriva in en positiv ålder");
			getAge();	
	}		
		}
