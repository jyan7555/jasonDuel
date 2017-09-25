package duel;

public class CharacterB implements Dueler {
	private int hp;
	private boolean gunloaded;
	private int placeholder;
	public void taunt() {
		System.out.println("THIS ISN'T EVEN MY FINAL FORM");
	}

	
	public String getName() {
		return "Freezer";
	}

	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}

	
	public int getHP() {
		return hp;
	}

	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if (d.getHP() == hp) {
			return true;
		}
		return false;
	}

	public int getPh() {
		return placeholder = (int)((Math.random() * 2)+1);
	}
	public int getAction(Object caller) {
		getPh();
		if (caller instanceof Duel){
			if (gunloaded == true)
			{	
				if (placeholder == 1) {
					gunloaded = false;
					return 1;
				}
				if (placeholder == 2) {
					return 2;
				}
			}
			if (gunloaded == false) {
				gunloaded = true;
				return 0;
			}
		}
		return 3;
	}

	public void hit(Object caller) {
		if (caller instanceof Duel){
		hp += -10;
		}
		
	}

}
