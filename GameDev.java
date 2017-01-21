import java.util.*;
import java.util.concurrent.TimeUnit;

public class GameDev{
    public static void fight(Player player, Enemy enemy) {  // TODO: Consider def 
        player.setHp(player.getHp()-enemy.getAtk());
        enemy.setHp(enemy.getHp()-player.getAtk());
        System.out.printf("You take %d damage\n", enemy.getAtk());
        System.out.printf("Enemy takes %d damage\n", player.getAtk());
    }

/*    public static Equipment generateEquipment(){    // TODO: Randomize atk and def 
        Random rand = new Random();
        int randQuality = rand.nextInt(10) + 1;
        if(randQuality<=3)
            return new Weapon("poor", 30, 10, 100);
        else if(randQuality<=5)
            return new Weapon("uncommon", 50, 15, 100);
        else if(randQuality<=7)
            return new Weapon("rare", 65, 20, 100);
        else if(randQuality<=9)
            return new Weapon("epic", 75, 25, 100);
        else
            return new Weapon("legendary", 100, 35, 100);
    }
*/
	public static void main(String[] args) throws InterruptedException{
		//Creates array of weapons, scanner class
		Weapon[] weapons = new Weapon[4];
		for(int i = 0; i < 4; i++){
			weapons[i] = new Weapon();
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t WELCOME TO GAME");
		System.out.println("\t\t\t What should I call you, adventurer?");
		System.out.print("Input: ");
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
		int choiceOfClass = 0;
		do{
			System.out.print("Input:");
			choiceOfClass = sc.nextInt();
		}while(choiceOfClass > 4 || choiceOfClass < 1);
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
		//Enter pseudoload
		psuedoLoad(2);

		//<--------- ADVENTURE BEGINS HERE -------------->
		//Seperate paths 4 choices
		pDel("\t\t*THUMP*\n", TimeUnit.MILLISECONDS);
		Thread.sleep(700);
		pDel("\t\t....\n", TimeUnit.MILLISECONDS);
		Thread.sleep(500);
		pDel("\t\t\"Urgh... Where am I?\"\n", TimeUnit.MILLISECONDS);
		Thread.sleep(400);
		pDel("\t\tLucifer: There are 4 paths to take... Choose one, adventurer...\n", TimeUnit.MILLISECONDS);
		//Choice to take
		pDel("\t\t1. A straight path that heads NORTH\n", TimeUnit.MILLISECONDS);
		pDel("\t\t2. A path bathed with smog that heads EAST\n", TimeUnit.MILLISECONDS);
		pDel("\t\t3. A path heading SOUTH that leads to a gate\n", TimeUnit.MILLISECONDS);
		pDel("\t\t4. A path that heads WEST and a figure behind it\n", TimeUnit.MILLISECONDS);

		int choiceOfPath1 = 0;	
		do{
			System.out.print("Input: ");
			choiceOfPath1 = sc.nextInt();
		}while(choiceOfPath1 < 1 || choiceOfPath1 > 4);


		//<--------- CHARACTER TAKES NORTH, FIRST CHOICE ------------->
		if(choiceOfPath1 == 1){
			pDel("\t\tYou took the straight path...\n", TimeUnit.MILLISECONDS);
			pDel("\t\tAlong the way you see a shiny object sitting on a rock\n", TimeUnit.MILLISECONDS);
			pDel("\t\t1. Take the shiny object\n", TimeUnit.MILLISECONDS);
			pDel("\t\t2. Leave it alone\n", TimeUnit.MILLISECONDS);
			int choiceToTakeShinyObject = 0;
			do{
				System.out.print("Input: ");
				choiceToTakeShinyObject = sc.nextInt();
			}while(choiceToTakeShinyObject < 1 || choiceToTakeShinyObject > 2);

			//Choice on whether he took the shiny object
			//The shiny object is ?
			if(choiceToTakeShinyObject == 1){ //Took the shiny object
				pDel("\t\t-You took the shiny object-\n", TimeUnit.MILLISECONDS);
				pDel("\t\t\"I wonder what this is for...\"\n", TimeUnit.MILLISECONDS);

			}else{
				pDel("\t\t-You walk away from the shiny object-\n", TimeUnit.MILLISECONDS);
			}
		}

		//<--------------- CHARACTER TAKES WEST, FOURTH CHOICE ------------------>
		//For shannon's combat test
		if(choiceOfPath1 == 4){
			pDel("\t\tThe ground starts shaking immensely\n", TimeUnit.MILLISECONDS);
			pDel("\t\tA large monster materialized from the muddy plains\n", TimeUnit.MILLISECONDS);
			pDel("\t\tLucifer: Stay on your toes, fool! This is gonna be your first battle!\n", TimeUnit.MILLISECONDS);
			//Psuedo load
			psuedoLoad(3);

		}


	}



	//<--------------------------- METHODS ---------------------------->

	//Print Delay - pDel
	//Fixed to 15ms
	public static void pDel(String data, TimeUnit unit)throws InterruptedException{
		for(char ch:data.toCharArray()){
			System.out.print(ch);
			unit.sleep(15);
		}
	}

	//Displays fake loading screen
	public static void psuedoLoad(int k)throws InterruptedException{
		int psuedoLoading = 1;
		int timeToDecrease = 100;

		System.out.print("\t\t|");
		for(int i = 0; i < 55; i++){
			if(timeToDecrease - psuedoLoading < 0){
				timeToDecrease = 0;
				psuedoLoading = 0;
			}
			Thread.sleep(timeToDecrease - psuedoLoading);
			System.out.print("#");
			psuedoLoading += k;
		}
		System.out.println("|\n");
	}

	//Displays combat menu
	public static void combatMenu(){
		System.out.println("\t\t------------------------");
		System.out.println("\t\t1. Attack\t2.Skills");
		System.out.println("\t\t3. HP Pot\t4.MP Pot");
		System.out.println("\t\t------------------------");
	}

	
}
