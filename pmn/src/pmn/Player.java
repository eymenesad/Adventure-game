package pmn;

import java.util.Scanner;

public class Player {
	private int damage,health,money,rHealth;
	private String name, chaName;
	private Inventory inv;
	Scanner scan = new Scanner(System.in);
	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
		
	}
	public void selectCha() {
		switch(chaMenu()) {
		case 1:
			initPlayer("Samuray",5,21,15);
			//Samuray
			break;
		case 2:
			initPlayer("Okcu",7,18,20);
			//Okcu
			break;
		case 3:
			initPlayer("Sovalye",8,24,5);
			//Sovalye
			break;
		default:
			//Samuray
			setDamage(5);
			setHealth(21);
			setMoney(15);
			break;
		}
		System.out.println(getChaName()+ "secildi");
 	}
	public void initPlayer(String chaName,int dmg, int health,int money ){
	setChaName(chaName);
	setDamage(dmg);
	setHealth(health);
	setMoney(money);
	setrHealth(health);
	
	}
	
	public int chaMenu() {
		System.out.println("Karakterini sec");
		System.out.println("1-Samuray, hasar 5, saglýk 21, para 15 ");
		System.out.println("2-Okcu, hasar 7, saglýk 18, para 20 ");
		System.out.println("3-Sovalye, hasar 8, saglýk 24, para 5 ");
		System.out.println("Seciminiz: ");
		int chaID = scan.nextInt();
		while(chaID < 1 || chaID > 3) {
			System.out.print("Lutfen gecerli bir karakter girin ");
			chaID = scan.nextInt();
		}
		return chaID;
	}
	public int getTotalDamage() {
		return this.getDamage()+this.getInv().getDamage();
		
	}
	
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChaName() {
		return chaName;
	}
	public void setChaName(String charName) {
		this.chaName = charName;
	}
	public Inventory getInv() {
		return inv;
	}
	public void setInv(Inventory inv) {
		this.inv = inv;
	}
	public int getrHealth() {
		return rHealth;
	}
	public void setrHealth(int rHealth) {
		this.rHealth = rHealth;
	}
	
	
	
}
