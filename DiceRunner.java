import java.util.ArrayList;

public class DiceRunner{
	public static void main(String[]args){

		//Test 1

			/*Dice dice1 = new Dice();
			Dice dice2 = new Dice();
			int counter = 0;

			while(dice1.getDice() != 1 || dice2.getDice() != 1){
				dice1.roll();
				dice2.roll();
				counter++;

				System.out.println("Roll #" + counter);
				System.out.println("Dice 1 : " + dice1 + "\nDice 2 : " + dice2 + "\n");
			}*/


		//Test 2

			//ArrayList<Dice> diceCup = new ArrayList();
			boolean start = true;
			diceHolder dHolder = new diceHolder();
			//int cntr = 1;
			Dice d = null;
			while(start){

				d = new Dice();
				int val = dHolder.addDie(d);

				//System.out.println("dHolder:" + dHolder);

				//System.out.println("val: " + val + ", Dice:" + d);
				if(val == -1) { // DiceHolder is full

					start = false;
					dHolder.shake();

					System.out.println("dHolder:" + dHolder);
				}
			}





	}
}