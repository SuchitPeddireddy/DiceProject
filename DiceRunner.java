public class DiceRunner{
	public static void main(String[]args){

		//Test 1

			Dice dice1 = new Dice();
			Dice dice2 = new Dice();
			int counter = 0;

			while(dice1.getDice() != 1 || dice2.getDice() != 1){
				dice1.roll();
				dice2.roll();
				counter++;

				System.out.println("Roll #" + counter);
				System.out.println("Dice 1 : " + dice1 + "\nDice 2 : " + dice2 + "\n");
			}

		//Test 2







	}
}