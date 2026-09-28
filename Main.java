public class Main {
    public static void main(String[] args) {
		System.out.println("--- Game Character Battle System ---");
		System.out.println("------------------------------------\n");

		// Initialize characters
		System.out.println("Starting Characters: ");

		Warrior warrior = new Warrior("Brutus", 100, 20);
		warrior.DisplayCharacterInformation();
		System.out.println();

		Mage mage = new Mage("Elara", 80, 25);
		mage.DisplayCharacterInformation();
		System.out.println();

		Archer archer = new Archer("Rowan", 90, 15);
		archer.DisplayCharacterInformation();
		System.out.println();

		// Begin battle
		System.out.println("Battle Begins!");
		warrior.AttackCharacter(mage);
		mage.AttackCharacter(archer);
		archer.AttackCharacter(warrior);

		// Test invalid action with try catch
		System.out.println("Testing Invalid Action: ");
		Warrior warrior2;
		try  {
			warrior2 = new Warrior("Seth", 0, 15);
			warrior2.AttackCharacter(mage);
		}
		catch (IllegalArgumentException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
	}
}