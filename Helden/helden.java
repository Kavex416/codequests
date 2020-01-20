package helden;

import java.util.Scanner;

public class helden {
int att;
int def;
int hp;

static boolean destroyed = false; 

static helden WP1;
static helden BS1;
static helden T1;
static helden AT1;

static helden WP2;
static helden BS2;
static helden T2;
static helden AT2;

static waffen RL;
static waffen HK;
static waffen NO;

static int ATT;
static int DEF;
static int WP;

public helden(int attack, int defense, int health) {
	att = attack;
	def = defense;
	hp = health;
}

@SuppressWarnings("resource")
public static void main(String[] Args) throws InterruptedException {
	WP1 = new helden(4, 1, 50);
	BS1 = new helden(7, 2, 50);
	T1 = new helden(5, 3, 50);
	AT1 = new helden(10, 0, 50);
	
	WP2 = new helden(4, 1, 50);
	BS2 = new helden(7, 2, 50);
	T2 = new helden(5, 3, 50);
	AT2 = new helden(10, 0, 50);
	
	RL = new waffen(5);
	HK = new waffen(3);
	NO = new waffen(1);
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Choose the attacker: \n [1] Warplane \n [2] Battleship \n [3] Tank \n [4] Anti Tank Unit");
	int e = scanner.nextInt();
	if (e == 1) {
		ATT = 1;
	}
	else if (e == 2) {
		ATT = 2;
	}
	else if (e == 3) {
		ATT = 3;
	}
	else if (e == 4) {
		ATT = 4;
	}
	else {
		System.out.println("Unexpected Error");
	}
	System.out.println("Choose the attacker´s weapon: \n [1] Rocket Launcher \n [2] HK416 \n [3] None");
	int f = scanner.nextInt();
	if (f == 1) {
		WP = 1;
	}
	else if (f == 2) {
		WP = 2;
	}
	else if (f == 3) {
		WP = 3;
	}
	else {
		System.out.println("Unexpected Error");
	}
	System.out.println("Choose the victim: \n [1] Warplane \n [2] Battleship \n [3] Tank \n [4] Anti Tank Unit");
	int g = scanner.nextInt();
	if (g == 1) {
		WP2 = new helden(4, 1, 50);
		DEF = 1;
	}
	else if (g == 2) {
		BS2 = new helden(7, 2, 50);
		DEF = 2;
	}
	else if (g == 3) {
		T2 = new helden(5, 8, 50);
		DEF = 3;
	}
	else if (g == 4) {
		AT2 = new helden(10, 0, 50);
		DEF = 4;
	}
	else {
		System.out.println("Unexpected Error");
	}
	combat();
}

public static void combat() throws InterruptedException {
	int turn = 0;
	if (DEF == 1){
		if (ATT == 1){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = WP1.att + RL.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Warplane has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = WP1.att + HK.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Warplane has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = WP1.att + NO.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Warplane has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 2){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = BS1.att + RL.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Warplane has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = BS1.att + HK.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Warplane has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = BS1.att + NO.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Warplane has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 3){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = T1.att + RL.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Tank dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = T1.att + HK.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Tank dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = T1.att + NO.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Tank dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Warplane has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 4){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = AT1.att + RL.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Warplane has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = AT1.att + HK.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Warplane has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = AT1.att + NO.att - WP2.def;
					WP2.hp = WP2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Warplane \n Warplane now has " + WP2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Warplane has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else {
			System.out.println("Unexpected Error");
		}
	}
	else if (DEF == 2){
		if (ATT == 1){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = WP1.att + RL.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = WP1.att + HK.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = WP1.att + NO.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 2){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = BS1.att + RL.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = BS1.att + HK.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = BS1.att + NO.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 3){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = T1.att + RL.att - BS2.def;
					BS2.hp = WP2.hp - dmg;
					System.out.println("Tank dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = T1.att + HK.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = T1.att + NO.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 4){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = AT1.att + RL.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = AT1.att + HK.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = AT1.att + NO.att - BS2.def;
					BS2.hp = BS2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Battleship \n Battleship now has " + BS2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Battleship has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else {
			System.out.println("Unexpected Error");
		}
		
	}
	else if (DEF == 3){
		if (ATT == 1){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = WP1.att + RL.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = WP1.att + HK.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = WP1.att + NO.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 2){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = BS1.att + RL.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = BS1.att + HK.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = BS1.att + NO.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 3){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = T1.att + RL.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Tank dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = T1.att + HK.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Tank dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = T1.att + NO.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Tank dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 4){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = AT1.att + RL.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = AT1.att + HK.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = AT1.att + NO.att - T2.def;
					T2.hp = T2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Tank \n Tank now has " + T2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Tank has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else {
			System.out.println("Unexpected Error");
		}
		
	}
	else if (DEF == 4){
		if (ATT == 1){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = WP1.att + RL.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = WP1.att + HK.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = WP1.att + NO.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Warplane dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 2){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = BS1.att + RL.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = BS1.att + HK.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = BS1.att + NO.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Battleship dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 3){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = T1.att + RL.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Tank dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = T1.att + HK.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Tank dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = T1.att + NO.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Tank dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else if (ATT == 4){
			if (WP == 1) {
				while (destroyed == false) {
					int dmg = AT1.att + RL.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 2) {
				while (destroyed == false) {
					int dmg = AT1.att + HK.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit has been destroyed. It lasted " + turn + " turns.");
			}
			else if (WP == 3) {
				while (destroyed == false) {
					int dmg = AT1.att + NO.att - AT2.def;
					AT2.hp = AT2.hp - dmg;
					System.out.println("Anti-Tank-Unit dealt " + dmg + "HP damage to Anti-Tank-Unit \n Anti-Tank-Unit now has " + AT2.hp + "HP.");
					turn ++;
					Thread.sleep(2000);
					check();
				}
				System.out.println("Anti-Tank-Unit2 has been destroyed. It lasted " + turn + " turns.");
			}
			else {
				System.out.println("Unexpected Error");
			}
		}
		else {
			System.out.println("Unexpected Error");
		}
		
	}
	else {
		System.out.println("Unexpected Error");
	}
}

public static void check() {
	if (WP2.hp <= 0 || BS2.hp <= 0 || T2.hp <= 0 || AT2.hp <= 0) {
		destroyed = true;
	}
}
}