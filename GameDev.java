import java.util.*;
import java.util.concurrent.TimeUnit;

public class GameDev{

	public static class Weapon{
		int weaponType;
		int weaponDamage;
		int weaponDurability;
	}

	public static void main(String[] args) throws InterruptedException{
		//Creates array of weapons, scanner class
		Weapon[] weapons = new Weapon[4];
		for(int i = 0; i < 4; i++){
			weapons[i] = new Weapon();
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t WELCOME TO GAME");
		System.out.println("\t\t\t What should I call you, adventurer?");
		System.out.print("Input:");
		String characterName = sc.nextLine();
		
		//Sword class
		weapons[0].weaponType = 1;
		weapons[0].weaponDamage = 65;
		weapons[0].weaponDurability = 100;
		//Mage class
		weapons[1].weaponType = 2;
		weapons[1].weaponDamage = 40;
		weapons[1].weaponDurability = 100;
		//Rogue class
		weapons[2].weaponType = 3;
		weapons[2].weaponDamage = 50;
		weapons[2].weaponDurability = 100;
		//Gunslinger class
		weapons[3].weaponType = 4;
		weapons[3].weaponDamage = 50;
		weapons[3].weaponDurability = 100;
		pDel("\t\tNice to meet you ", TimeUnit.MILLISECONDS);
		pDel(characterName, TimeUnit.MILLISECONDS);
		pDel("!\n", TimeUnit.MILLISECONDS);
		
		Thread.sleep(600);
		pDel("\t\tI'm Lucifer and I'll grant you the power that you've always wanted...\n", TimeUnit.MILLISECONDS);
		Thread.sleep(1000);
		System.out.println("\t\t----------------------------------------------------------");
		System.out.println("\t\t\t\tCHOOSE YOUR CLASS, HERO");
		System.out.println("\t\t----------------------------------------------------------");

		System.out.println("\t\t\t 1. Warrior: Equipped with a sword");
		System.out.println("\t\t\t 2. Magician: Equipped with a staff");
		System.out.println("\t\t\t 3. Rogue: Equipped with dual-daggers");
		System.out.println("\t\t\t 4. Gunslinger: Equipped with a dual-pistols");
		System.out.print("Input:");
		int choiceOfClass = sc.nextInt();
		//Story of class
		Thread.sleep(1020);

		if(choiceOfClass == 1){
			pDel("\t\tThe sharpest steel needs a sharper mind\n", TimeUnit.MILLISECONDS);
			Thread.sleep(700);
			pDel("\t\tGo forth Warrior! Avenge your tribe!\n", TimeUnit.MILLISECONDS);
		}
		else if(choiceOfClass == 2){
			pDel("\t\tHmmm.... Interesting choice of class\n", TimeUnit.MILLISECONDS);
			Thread.sleep(700);
			pDel("\t\tSeek knowledge through adventure, young Mage...", TimeUnit.MILLISECONDS);
		}
		else if(choiceOfClass == 3){
			pDel("\t\tWhat you lack in power...\n", TimeUnit.MILLISECONDS);
			pDel("\t\tYou make it up with speed...\n", TimeUnit.MILLISECONDS);
			Thread.sleep(700);
			pDel("\t\tStrive and strike in darkness, Rogue!\n", TimeUnit.MILLISECONDS);
		}
		else if(choiceOfClass == 4){
			pDel("\t\tYou've got a rocket in your pocket, young one\n", TimeUnit.MILLISECONDS);
			pDel("\t\tDestroy everything in your path, Gunslinger!\n", TimeUnit.MILLISECONDS);
			
		}
		pDel("\t\tGet ready, adventurer!", TimeUnit.MILLISECONDS);
		Thread.sleep(1000);
		System.out.println("\n\t\t\t\tTeleporting to realm of Obsidian");
		Thread.sleep(600);
		System.out.print("\t\t|");
		int psuedoLoading = 1;
		for(int i = 0; i < 55; i++){
			Thread.sleep(100 - psuedoLoading);
			System.out.print("#");
			psuedoLoading++;
		}
		System.out.println("|\n\n");

	}

	//Print Delay - pDel
	//Fixed to 20ms
	public static void pDel(String data, TimeUnit unit)throws InterruptedException{
		for(char ch:data.toCharArray()){
			System.out.print(ch);
			unit.sleep(20);
		}
	}
	
	
}