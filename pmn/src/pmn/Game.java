package pmn;

import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);
	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Macera oyununa hos geldiniz");
		System.out.print("Oyuna ba�lamadan once isminizi giriniz: a ");
		//String playerName = scan.nextLine();
		player = new Player("a");
		player.selectCha();
		start();

	}
	public void start() {
		while(true) {
			System.out.println();
			System.out.println("**********");
			System.out.println();
			System.out.println("Lutfen yer secin");
			System.out.println("1. Guvenli ev --> Size ait guvenli bir ev");
			System.out.println("2.Magara --> Burada zombi olabilir");
			System.out.println("3.Orman-->Vampir ��kabili");
			System.out.println("4.Nehir--> Ay� ��kabilir");
			System.out.println("5.Magaza--> Silah veya z�rh alabilrsiniz");
			int selLoc = scan.nextInt();
			while (selLoc <0 || selLoc> 5) {
				System.out.print("Lutfen gecerli bir say� giriniz");
				selLoc = scan.nextInt();
				
			}
			switch(selLoc) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new Cave(player);
				break;
			case 3 :
				location = new Forest(player);
				break;
			case 4:
				location = new River(player);
				break;
			case 5:
				location = new ToolStore(player);
				break;
			default:
				location = new SafeHouse(player);
			}
			if(location.getClass().getName().equals("SafeHouse")) {
				if(player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
					System.out.println("Tebrikler oyunu kazand�n�z! ");
					break;
				}
			}
			if(!location.getLocation()) {
				System.out.println("Oyun bitti");
				break;
			}
		}
	}
}

