package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz {
	public static void main(String[] Args) throws IOException {
		int score = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Wie heißt die Hauptstadt von Deutschland?");
		System.out.println("1. Hamburg");
		System.out.println("2. Frankfurt");
		System.out.println("3. Berlin");
		System.out.println("4. Karlsruhe");
		String s = reader.readLine();  
		int i = Integer.parseInt(s);
		if (i == 3) {
			System.out.println("Richtig!");
			score ++;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		else {
			System.out.println("Falsch! Die richtige Antwort ist: 3. Berlin");
			score --;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		System.out.println("In welchem Jahr wurde Portal 2 released?");
		System.out.println("1. 2011");
		System.out.println("2. 2015");
		System.out.println("3. 2012");
		System.out.println("4. 2008");
		String t = reader.readLine();  
		int j = Integer.parseInt(t);
		if (j == 1) {
			System.out.println("Richtig!");
			score ++;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		else {
			System.out.println("Falsch! Die richtige Antwort ist 1. 2011");
			score --;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		System.out.println("In welchem Jahr sank die Bismarck (deutsches Schlachtschiff)?");
		System.out.println("1. 1905");
		System.out.println("2. 1938");
		System.out.println("3. 1944");
		System.out.println("4. 1941");
		String u = reader.readLine();  
		int k = Integer.parseInt(u);
		if (k == 4) {
			System.out.println("Richtig!");
			score ++;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		else {
			System.out.println("Falsch! Die richtige Antwort ist: 4. 1941");
			score --;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		System.out.println("Mit welcher Lichterfolge (auf dem Mast) zeigt ein Schiff Manövrierunfähigkeit an?");
		System.out.println("1. rot, weiß, rot");
		System.out.println("2. rot, rot");
		System.out.println("3. weiß, weiß");
		System.out.println("4. weiß, rot, weiß");
		String v = reader.readLine();  
		int l = Integer.parseInt(v);
		if (l == 2) {
			System.out.println("Richtig!");
			score ++;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		else {
			System.out.println("Falsch! Die richtige Antwort ist: 2. rot, rot");
			score --;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		System.out.println("Welches Schallsignal ist als das 'Bleib-Weg-Signal' (Schiffahrt) bekannt?");
		System.out.println("1. ---...---");
		System.out.println("2. --.--.");
		System.out.println("3. .-.-.-");
		System.out.println("4. -");
		String w = reader.readLine();  
		int m = Integer.parseInt(w);
		if (m == 3) {
			System.out.println("Richtig!");
			score ++;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		else {
			System.out.println("Falsch! Die richtige Antwort ist: 3. .-.-.-");
			score --;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		System.out.println("Wann wurde die Glühlampe erstmals öffentlich vorgeführt?");
		System.out.println("1. 1835");
		System.out.println("2. 1852");
		System.out.println("3. 1814");
		System.out.println("4. 1882");
		String x = reader.readLine();  
		int n = Integer.parseInt(x);
		if (n == 1) {
			System.out.println("Richtig!");
			score ++;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		else {
			System.out.println("Falsch! Die richtige Antwort ist: 1. 1835");
			score --;
			System.out.println("Dein aktueller Score ist:" + score);
		}
		System.out.println("Hier ist das Quiz zu Ende. Dein Endscore ist: " + score + " out of 6");
		//Trefferquote funktioniert leider nicht
		//float quote = score / 6;
		//float percent = quote * 100;
		//System.out.println("Deine Trefferquote lag bei:" + percent + "%");
		String preventclose = reader.readLine();
	}
}
