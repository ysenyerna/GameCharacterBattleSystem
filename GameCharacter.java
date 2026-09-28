public class GameCharacter {

	private String characterName;
	private int health;
	private int attackPower;

	public GameCharacter(String name, int startingHealth, int attackPower) {
		
		this.characterName = name.trim();
		this.health = startingHealth;
		this.attackPower = attackPower;
		if (characterName.isEmpty()) {
			throw new IllegalArgumentException("Character name must not be empty.");
		}

		if (this.health <= 0) {
			throw new IllegalArgumentException("Starting health must be greater than 0.");
		}
		if (this.attackPower <= 0) {
			throw new IllegalArgumentException("Attack power must be greater than 0.");
		}
	}


	public String GetCharacterName() {
		return characterName;
	}

	public int GetCharacterHealth() {
		return health;
	}

	public int GetCharacterAttackPower() {
		return attackPower;
	}

	public Boolean IsCharacterAlive() {
		return health > 0;
	}

	public void TakeDamage(int damageAmount) {
		if (damageAmount < 0) {
			throw new IllegalArgumentException("Damage amount cannot be negative.");
		}
		System.out.println(characterName + " takes " + damageAmount + " damage.");
		health -= damageAmount;
		// Print damage message
		if (!IsCharacterAlive()) {
			System.out.println(characterName + " has been defeated!");
		}
		else {
			System.out.println(characterName + "'s health is now at " + health + ".\n");
		}
	}

	public void AttackCharacter(GameCharacter character) {
		// Check character states
		if (!IsCharacterAlive()) {
			throw new IllegalStateException("Error: This character cannot attack as they are already defeated.");
		}
		if (!character.IsCharacterAlive()) {
			throw new IllegalStateException("Error: Cannot attack a character who is already defeated.");
		}
		// Perform attack
		System.out.println(characterName + " attacks " + character.GetCharacterName() + ".");
		character.TakeDamage(attackPower);
	}


	public void DisplayCharacterInformation() {
		System.out.println("Name: " + characterName +
			"\nHealth: " + health + 
			"\nAttackPower: " + attackPower
		);
	}
}
