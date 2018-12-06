//Bridget Lobo

import java.util.ArrayList;

public class diceHolder{
	private ArrayList <Dice> diceCup;

	public diceHolder(){
		diceCup = new ArrayList <>();
	}

	public int addDie(Dice die){
		if(diceCup.size() < 6){
			diceCup.add(die);
			return 1;
		}
		else
			return -1;
	} //addDie

	public void shake(){
		for(int a = 0; a < diceCup.size(); a++){
			diceCup.get(a).roll();
		}
	} //shake

	private String a;
	public String toString(){
		for(int b = 0; b < diceCup.size(); b++){
			a += diceCup.get(b) + "\n";
		}
		return a;
	} //toString
}