package formeln;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rechner {
	
	public static void main(String[] Args) throws IOException {
	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("Wählen sie eine Formel:");
	   System.out.println("1: Binomische Formel");
	   System.out.println("2: Geschwindigkeit errechnen");
	   System.out.println("3: pq-Formel");
	   System.out.println("4: Gleichförmige Beschleunigung errechnen");
       String l1s = reader.readLine();
       int l1 = Integer.parseInt(l1s);
       if (l1 == 1) {
    	   System.out.println("(a+b)^2");
    	   System.out.println("Enter a value for a:");
    	   String as = reader.readLine();
    	   double a = Double.parseDouble(as);
    	   System.out.println("Enter a value for b:");
    	   String bs = reader.readLine();
    	   double b = Double.parseDouble(bs);
    	   double result = Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2);
    	   System.out.println("(" + a + "+" + b + ")^2 = " + a + "^2 + 2*" + a*b + "+" + b + "^2 = " + result);
       }
       if (l1 == 2) {
    	   System.out.println("s/t");
    	   System.out.println("Enter a value for s:");
    	   String ss = reader.readLine();
    	   int s = Integer.parseInt(ss);
    	   System.out.println("Enter a value for t:");
    	   String ts = reader.readLine();
    	   int t = Integer.parseInt(ts);
    	   double result = t * s;
    	   System.out.println(s + "/" + t + " = " + result);
       }
       if (l1 == 3) {
    	   System.out.println("-p/2+-sqrt((p/2)^2-q)");
    	   System.out.println("Enter a value for p:");
    	   String ps = reader.readLine();
    	   double p = Double.parseDouble(ps);
    	   System.out.println("Enter a value for q:");
    	   String qs = reader.readLine();
    	   double q = Double.parseDouble(qs);
    	   double result1 = - p / 2 + Math.sqrt(Math.pow(p / 2, 2) - q);
    	   double result2 = - p / 2 - Math.sqrt(Math.pow(p / 2, 2) - q);
    	   System.out.println("-" + p + "/2 +- sqrt((" + p + "/2)^2 -" + q + ") = " + result1 + " & " + result2);
       }
       if (l1 == 4) {
    	   System.out.println("(v2-v1)/(t2-t1)");
    	   System.out.println("Enter a value for v2:");
    	   String v2s = reader.readLine();
    	   int v2 = Integer.parseInt(v2s);
    	   System.out.println("Enter a value for v1:");
    	   String v1s = reader.readLine();
    	   int v1 = Integer.parseInt(v1s);
    	   System.out.println("Enter a value for t2:");
    	   String t2s = reader.readLine();
    	   int t2 = Integer.parseInt(t2s);
    	   System.out.println("Enter a value for t1:");
    	   String t1s = reader.readLine();
    	   int t1 = Integer.parseInt(t1s);
    	   int result = (v2 - v1) / (t2 - t1);
    	   System.out.println("(" + v2 + "-" + v1 + "/(" + t2 + "-" + t2 + ") = " + result);
       }
       String preventclose = reader.readLine();
	}
}
