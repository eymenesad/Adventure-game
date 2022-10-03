package pmn;

public class ToolStore extends NormalLoc{

	ToolStore(Player player) {
		super(player,"Magaza" );
		
	}
	public boolean getLocation() {
		System.out.println("Para:" +player.getMoney());
		System.out.println("1.Silahlar");
		System.out.println("2.Z�rhlar");
		System.out.println("3.��k�s");
		System.out.print("Se�iminiz: ");
		int selTool = scan.nextInt();
		int selItemID;
		switch (selTool) {
		case 1:
			selItemID = weaponMenu();
			buyWeapon(selItemID);
			break;
		case 2:
			selItemID = armorMenu();
			buyArmor(selItemID);
			break;
		default:
			break;
		}
		return true;
	}
	public int armorMenu() {
		System.out.println("1.Hafif\t --> para :15, engelleme:1");
		System.out.println("2.Orta\t --> para :25, engelleme:3");
		System.out.println("3.A��r\t --> para :40, engelleme:5");
		System.out.println("4.��k�s");
		System.out.println("Silah se�iniz: ");
		int selArmorID = scan.nextInt();
		return selArmorID;
	}
	public void buyArmor(int itemID) {
		int avoid = 0,price = 0;
		String aName = null;
		switch(itemID) {
		case 1:
			avoid = 1;
			aName = "Hafif Z�rh";
			price = 15;
			break;
		case 2:
			avoid = 3;
			aName = "Orta Z�rh";
			price = 25;
			break;	
		case 3:
			avoid = 5;
			aName = "A��r Z�rh";
			price = 40;
			break;	
		case 4:
			System.out.println("��k�� yap�l�yor");
			break;
		default: 
			System.out.println("Ge�ersiz i�lem");
			break;
		}	
			if(price >0) {
				if (player.getMoney() > price) {
					player.getInv().setArmor(avoid);
					player.getInv().setaName(aName);
					player.setMoney(player.getMoney() - price);
					System.out.println(aName+" sat�n ald�n�z, engellenen hasar: "+player.getInv().getArmor());
					System.out.println("Kalan para: " + player.getMoney());
				}else {  
					System.out.println("Bakiye yetersiz");
						
				}
			}
			
		}
	public int weaponMenu() {
		System.out.println("1.Tabanca\t --> para :25, hasar:2");
		System.out.println("2.K�l��\t --> para :35, hasar:3");
		System.out.println("3.T�fek\t --> para :45, hasar:7");
		System.out.println("4.��k�s");
		System.out.println("Z�rh se�iniz: ");
		int selWeaponID = scan.nextInt();
		return selWeaponID;
	
	}
	public void buyWeapon(int itemID) {
		int damage = 0,price = 0;
		String wName = null;
		switch(itemID) {
		case 1:
			damage = 2;
			wName = "Tabanca";
			price = 25;
			break;
		case 2:
			damage = 3;
			wName = "K�l�c";
			price = 35;
			break;	
		case 3:
			damage = 7;
			wName = "T�fek";
			price = 45;
			break;	
		case 4:
			System.out.println("��k�� yap�l�yor");
			break;
		default: 
			System.out.println("Ge�ersiz i�lem");
			break;
		}
		if(price >0) {
			if (player.getMoney() > price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney() - price);
				System.out.println(wName+" sat�n ald�n�z, �nceki Hasar: "+player.getDamage()+ " Yeni hasar: "+ player.getTotalDamage());
				System.out.println("Kalan para: " + player.getMoney());
			}else {  
				System.out.println("Bakiye yetersiz");
					
			}
		}
		
	}
}
