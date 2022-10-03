package pmn;

public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player, "Guvenli ev");
		
	}
	public boolean getLocation() {
		player.setHealth(player.getrHealth());
		System.out.println("Ýyileþtiniz");
		System.out.println("Su an guvenli evdesiniz");
		return true;
	}
}
