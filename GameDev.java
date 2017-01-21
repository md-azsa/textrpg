import java.util.*;
import java.util.concurrent.TimeUnit;

public class GameDev{
    public static void fight(Player player, Enemy enemy) {
        player.setHp(player.getHp()-enemy.getAtk());
        enemy.setHp(enemy.getHp()-player.getAtk());
        System.out.printf("You take %d damage\n", enemy.getAtk());
        System.out.printf("%s takes %d damage\n", player.getAtk());
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
		weapons[0].setType("sword");
		weapons[0].setAtk(65);
		weapons[0].setDurability(100);
		//Mage class
		weapons[1].setType("staff");
		weapons[1].setAtk(40);
		weapons[1].setDurability(100);
		//Rogue class
		weapons[2].setType("dagger");
		weapons[2].setAtk(50);
		weapons[2].setDurability(100);
		//Gunslinger class
		weapons[3].setType("gun");
		weapons[3].setAtk(50);
		weapons[3].setDurability(100);
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
			pDel("\t\tSeek knowledge through adventure, young Mage...\n", TimeUnit.MILLISECONDS);
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
		System.out.println("\n\n\t\t\t\tTeleporting to realm of Obsidian");
		Thread.sleep(600);
		System.out.print("\t\t|");
		int psuedoLoading = 1;
		for(int i = 0; i < 55; i++){
			Thread.sleep(100 - psuedoLoading);
			System.out.print("#");
			psuedoLoading++;
		}
		System.out.println("|\n");

		//<--------- ADVENTURE BEGINS HERE -------------->
		//Seperate paths 4 choices
		pDel("\t\t*THUMP*\n", TimeUnit.MILLISECONDS);
		Thread.sleep(700);
		pDel("\t\t....\n", TimeUnit.MILLISECONDS);
		Thread.sleep(500);
		pDel("\t\tUrgh... Where am I?\n", TimeUnit.MILLISECONDS);
		Thread.sleep(400);
		pDel("\t\tThere are 4 paths to take...\n", TimeUnit.MILLISECONDS);
		//Choice to take
		pDel("\t\t1. A straight path that heads NORTH\n", TimeUnit.MILLISECONDS);
		pDel("\t\t2. A path bathed with smog that heads EAST\n", TimeUnit.MILLISECONDS);
		pDel("\t\t3. A path heading SOUTH that leads to a gate\n", TimeUnit.MILLISECONDS);
		pDel("\t\t4. A path that heads WEST and a figure behind it\n", TimeUnit.MILLISECONDS);



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
