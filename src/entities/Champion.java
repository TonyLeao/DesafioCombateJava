package entities;

public class Champion {

	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;  
		this.attack = attack;
		this.armor = armor;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public int getLife() {
		return life;
	}
	
	/* Não coloquei um setLife(), porque entendi que a vida só
	 * poderá ser modificada a partir do takeDamage()
	 */
	
	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void takeDamage(Champion other) {
		int damage = other.getAttack() - this.armor;
		int lifeUpdated;
		
		if (damage <= 0) {
			lifeUpdated = this.getLife() - 1;
		}
		else {
			lifeUpdated = this.getLife() - damage;
		}
		
		lifeUpdated = (lifeUpdated < 0) ? 0 : lifeUpdated;
		this.life = lifeUpdated;
	}
	
	public String status() {
		String morreu = (this.getLife() == 0) ? " (morreu)" : "";
		
		return this.getName() + ": " + this.getLife() + " de vida" + morreu;
	}
}
