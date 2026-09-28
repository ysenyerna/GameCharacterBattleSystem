public class Archer extends GameCharacter {
	

	public Archer(String name, int startingHealth, int attackPower) {
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
		System.out.println(GetCharacterName() + " shoots an arrow at " + character.GetCharacterName() + "!");
		character.TakeDamage(GetCharacterAttackPower());
	}

	@Override
	public void DisplayCharacterInformation() {
		System.out.println("Archer: " + GetCharacterName() +
			"\nHealth: " + GetCharacterHealth() + 
			"\nAttackPower: " + GetCharacterAttackPower()
		);
	}
}
