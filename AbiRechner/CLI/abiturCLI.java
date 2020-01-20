package abitur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class abitur{
   public static void main(String[] args) throws IOException
    {
	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Note des 1. LKs der Q1:");
       String l11 = reader.readLine();
       int lk11 = Integer.parseInt(l11);
       System.out.println("Note des 1. LKs der Q2:");
       String l12 = reader.readLine(); 
       int lk12 = Integer.parseInt(l12);
       System.out.println("Note des 1. LKs der Q3:");
       String l13 = reader.readLine();  
       int lk13 = Integer.parseInt(l13);
       System.out.println("Note des 1. LKs der Q4:");
       String l14 = reader.readLine(); 
       int lk14 = Integer.parseInt(l14);
       System.out.println("Note des 2. LKs der Q1:");
       String l21 = reader.readLine(); 
       int lk21 = Integer.parseInt(l21);
       System.out.println("Note des 2. LKs der Q2:");
       String l22 = reader.readLine(); 
       int lk22 = Integer.parseInt(l22);
       System.out.println("Note des 2. LKs der Q3:");
       String l23 = reader.readLine();  
       int lk23 = Integer.parseInt(l23);
       System.out.println("Note des 2. LKs der Q4:");
       String l24 = reader.readLine(); 
       int lk24 = Integer.parseInt(l24);
       
       System.out.println("Note des 1. GKs:");
       String g01 = reader.readLine(); 
       int gk01 = Integer.parseInt(g01);
       System.out.println("Note des 2. GKs:");
       String g02 = reader.readLine(); 
       int gk02 = Integer.parseInt(g02);
       System.out.println("Note des 3. GKs:");
       String g03 = reader.readLine(); 
       int gk03 = Integer.parseInt(g03);
       System.out.println("Note des 4. GKs:");
       String g04 = reader.readLine(); 
       int gk04 = Integer.parseInt(g04);
       System.out.println("Note des 5. GKs:");
       String g05 = reader.readLine(); 
       int gk05 = Integer.parseInt(g05);
       System.out.println("Note des 6. GKs:");
       String g06 = reader.readLine(); 
       int gk06 = Integer.parseInt(g06);
       System.out.println("Note des 7. GKs:");
       String g07 = reader.readLine(); 
       int gk07 = Integer.parseInt(g07);
       System.out.println("Note des 8. GKs:");
       String g08 = reader.readLine(); 
       int gk08 = Integer.parseInt(g08);
       System.out.println("Note des 9. GKs:");
       String g09 = reader.readLine(); 
       int gk09 = Integer.parseInt(g09);
       System.out.println("Note des 10. GKs:");
       String g10 = reader.readLine(); 
       int gk10 = Integer.parseInt(g10);
       System.out.println("Note des 11. GKs:");
       String g11 = reader.readLine(); 
       int gk11 = Integer.parseInt(g11);
       System.out.println("Note des 12. GKs:");
       String g12 = reader.readLine(); 
       int gk12 = Integer.parseInt(g12);
       System.out.println("Note des 13. GKs:");
       String g13 = reader.readLine(); 
       int gk13 = Integer.parseInt(g13);
       System.out.println("Note des 14. GKs:");
       String g14 = reader.readLine(); 
       int gk14 = Integer.parseInt(g14);
       System.out.println("Note des 15. GKs:");
       String g15 = reader.readLine(); 
       int gk15 = Integer.parseInt(g15);
       System.out.println("Note des 16. GKs:");
       String g16 = reader.readLine(); 
       int gk16 = Integer.parseInt(g16);
       System.out.println("Note des 17. GKs:");
       String g17 = reader.readLine(); 
       int gk17 = Integer.parseInt(g17);
       System.out.println("Note des 18. GKs:");
       String g18 = reader.readLine(); 
       int gk18 = Integer.parseInt(g18);
       System.out.println("Note des 19. GKs:");
       String g19 = reader.readLine(); 
       int gk19 = Integer.parseInt(g19);
       System.out.println("Note des 20. GKs:");
       String g20 = reader.readLine(); 
       int gk20 = Integer.parseInt(g20);
       System.out.println("Note des 21. GKs:");
       String g21 = reader.readLine(); 
       int gk21 = Integer.parseInt(g21);
       System.out.println("Note des 22. GKs:");
       String g22 = reader.readLine(); 
       int gk22 = Integer.parseInt(g22);
       System.out.println("Note des 23. GKs:");
       String g23 = reader.readLine(); 
       int gk23 = Integer.parseInt(g23);
       System.out.println("Note des 24. GKs:");
       String g24 = reader.readLine(); 
       int gk24 = Integer.parseInt(g24);
       
       System.out.println("Note der 1. Prüfung:");
       String p1 = reader.readLine(); 
       int pf1 = Integer.parseInt(p1);
       System.out.println("Note der 2. Prüfung:");
       String p2 = reader.readLine(); 
       int pf2 = Integer.parseInt(p2);
       System.out.println("Note der 3. Prüfung:");
       String p3 = reader.readLine(); 
       int pf3 = Integer.parseInt(p3);
       System.out.println("Note der 4. Prüfung:");
       String p4 = reader.readLine(); 
       int pf4 = Integer.parseInt(p4);
       System.out.println("Note der 5. Prüfung:");
       String p5 = reader.readLine(); 
       int pf5 = Integer.parseInt(p5);
       
       
       int LKs = lk11 + lk12 + lk13 + lk14 + lk21 + lk22 + lk23 + lk24;
       int GKs = gk01 + gk02 + gk03 + gk04 + gk05 + gk06 + gk07 + gk08 + gk09 + gk10 + gk11 + gk12 + gk13 + gk14 + gk15 + gk16 + gk17 + gk18 + gk19 + gk20 + gk21 + gk22 + gk23 + gk24;
       int PFs = pf1 + pf2 + pf3 + pf4 + pf5;
       int result = 2 * LKs + GKs + 4 * PFs;
       
       String grade = "";
       if(result == 300) 
       {
         grade = "4,0";
         }  
       else if(result >= 301 && result <= 318){
         grade = "3,9";
       }
       else if(result >= 319 && result <= 336){
         grade = "3,8";
       }
       else if(result >= 337 && result <= 354){
         grade = "3,7";
       }
       else if(result >= 355 && result <= 372){
         grade = "3,6";
       }
       else if(result >= 373 && result <= 390){
         grade = "3,5";
       }
       else if(result >= 391 && result <= 408){
         grade = "3,4";
       }
       else if(result >= 409 && result <= 426){
         grade = "3,3";
       }
       else if(result >= 427 && result <= 444){
         grade = "3,2";
       }
       else if(result >= 445 && result <= 462){
         grade = "3,1";
       }
       else if(result >= 463 && result <= 480){
         grade = "3,0";
       }
       else if(result >= 481 && result <= 498){
         grade = "2,9";
       }
       else if(result >= 499 && result <= 516){
         grade = "2,8";
       }
       else if(result >= 517 && result <= 534){
         grade = "2,7";
       }
       else if(result >= 535 && result <= 552){
         grade = "2,6";
       }
       else if(result >= 553 && result <= 570){
         grade = "2,5";
       }
       else if(result >= 571 && result <= 588){
         grade = "2,4";
       }
       else if(result >= 589 && result <= 606){
         grade = "2,3";
       }
       else if(result >= 607 && result <= 624){
         grade = "2,2";
       }
       else if(result >= 625 && result <= 642){
         grade = "2,1";
       }
       else if(result >= 643 && result <= 660){
         grade = "2,0";
       }
       else if(result >= 661 && result <= 678){
         grade = "1,9";
       }
       else if(result >= 679 && result <= 696){
         grade = "1,8";
       }
       else if(result >= 697 && result <= 714){
         grade = "1,7";
       }
       else if(result >= 715 && result <= 732){
         grade = "1,6";
       }
       else if(result >= 733 && result <= 750){
         grade = "1,5";
       }
       else if(result >= 751 && result <= 768){
         grade = "1,4";
       }
       else if(result >= 769 && result <= 786){
         grade = "1,3";
       }
       else if(result >= 787 && result <= 804){
         grade = "1,2";
       }
       else if(result >= 805 && result <= 822){
         grade = "1,1";
       }
       else if(result >= 823 && result <= 900){
         grade = "1,0";
       }
       else{
         grade = "Nicht bestanden, oder ungültige Eingabe.";
         }
       // end of if-else
       System.out.println("Erzielte Punkte:" + String.valueOf(result));
       System.out.println("Note:" + grade); 
       String preventClosing = reader.readLine();
    }
}       