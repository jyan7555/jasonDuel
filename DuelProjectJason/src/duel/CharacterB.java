package duel;

public class CharacterB implements Dueler {
	private int hp;
	
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

	public int getAction(Object caller) {
		if (caller == this)
		{
			return (int)(Math.random() * 2);
		}
		else {
			return 3;
		}
	}

	public void hit(Object caller) {

	}

}