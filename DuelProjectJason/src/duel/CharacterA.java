package duel;

public class CharacterA implements Dueler{
	private int hp;
	private boolean loaded; 
	public CharacterA() {

	}
	public void taunt() {
		System.out.println("!?!");
	}
	public String getName() {
		return "its me";
	}
	public boolean getLoadStat() {
		return loaded;
	}
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if (d.getHP() == hp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int getAction(Object caller){
		if (caller instanceof Duel) {
			if (this.getLoadStat()) {
				loaded = false;
				return 1;
			}
			else if (Math.random() < .5) {
				loaded = true;
				return 0;
				
			}
			else 
				return 2;
		}
		else
			return 3;
	}
	public void hit (Object caller){
		if (caller instanceof Duel)
		hp += -10;
	}
}
	
//1
