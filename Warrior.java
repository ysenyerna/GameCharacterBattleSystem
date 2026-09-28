public class Warrior extends GameCharacter {
	

	public Warrior(String name, int startingHealth, int attackPower) {
		super(name, startingHealth, attackPower);
	}

	@Override
	public void AttackCharacter(GameCharacter character) {
		// Check character states
		if (!IsCharacterAlive()) {
			throw new IllegalStateException("Error: This character cannot attack as they are already defeated.");
		}
		if (!character.IsCharacterAlive()) {
			throw new IllegalStateException("Error: Cannot attack a character who is already defeated.");
		}
		// Perform attack
		System.out.println(GetCharacterName() + " swings a sword at " + character.GetCharacterName() + "!");
		character.TakeDamage(GetCharacterAttackPower());
	}

	@Override
	public void DisplayCharacterInformation() {
		System.out.println("Warrior: " + GetCharacterName() +
			"\nHealth: " + GetCharacterHealth() + 
			"\nAttackPower: " + GetCharacterAttackPower()
		);
	}
}
