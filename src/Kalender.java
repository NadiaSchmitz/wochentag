
import Prog1Tools.IOTools;

public class Kalender {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int t, m, mprint, j, jprint, j1, j2, h1, h2, h3, b, f;
		
		// Tag
		t = IOTools.readInteger("Geben Sie bitte Tag: ");
		
		if (t <= 0) {
			System.out.println("Der Tag kann nicht <= 0 sein. Versuchen Sie bitte wieder. ");
			t = IOTools.readInteger("Geben Sie bitte Tag: ");
		} 
		
		if (t > 31) {
			System.out.println("Der Tag kann nicht > 31 sein. Versuchen Sie bitte wieder. ");
			t = IOTools.readInteger("Geben Sie bitte Tag: ");
		}
		
		//Monat		
		m = IOTools.readInteger("Geben Sie bitte Monat: ");
		mprint = m;
		
		if (m < 0) {
			System.out.println("Der Monat kann nicht < 0 sein. Versuchen Sie bitte wieder. ");
			t = IOTools.readInteger("Geben Sie bitte Monat: ");
		}
		
		if (m > 12) {
			System.out.println("Der Monat kann nicht > 12 sein. Versuchen Sie bitte wieder. ");
			t = IOTools.readInteger("Geben Sie bitte Monat: ");
		}
		
		//Jahr
		j = IOTools.readInteger("Geben Sie bitte Jahr: ");
		jprint = j;
		
		if (m < 3) {
			m = m + 10;
			j = j - 1;
		} else {
			m = m - 2;
		}
		
		//Wochentag j1, j2
		j1 = j / 100;
		j2 = j % 100;
		
		//Wochentag h1, h2, h3, b, f
		h1 = (m * 13 - 1) / 5;
		h2 = j2 / 4;
		h3 = j1 / 4;
		b = h1 + h2 + h3;
		f = ((b + j2 + t) - j1 * 2) % 7;
		
		System.out.println();
		System.out.println("Tag  " + "Monat  " + "Jahr  " + "Jahr1  " + "Jahr2");
		System.out.println(t + "   " + m + "      " + jprint + "  " + j1 + "     " + j2);
		System.out.println();
		System.out.println();
		System.out.println("h1   " + "h2   " + "h3   " + "b   " + "f");
		System.out.println(h1 + "   " + h2 + "    " + h3 + "    " + b + "  " + f);
		System.out.println();
		System.out.println("Sie haben das Datum eingegeben: " + t + "." + mprint + "." + jprint);
		
		if (f == 0) {
			System.out.println("Das ist Sonntag");
		}
		
		if (f == 1) {
			System.out.println("Das ist Montag");
		}
		
		if (f == 2) {
			System.out.println("Das ist Dienstag");
		}
		
		if (f == 3) {
			System.out.println("Das ist Mittwoch");
		}
		
		if (f == 4) {
			System.out.println("Das ist Donnerstag");
		}
		
		if (f == 5) {
			System.out.println("Das ist Freitag");
		}
		
		if (f == 6) {
			System.out.println("Das ist Freitag");
		}
	
	}

}