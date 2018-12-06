//Suchit Peddireddy

public class Dice{

	private int getValue;
	private int sides;

	public Dice(){
		getValue = 6;
		sides = 6;
	}

	public Dice(int sides){
		this.sides = sides;
		roll();
	}

	public int getDice(){
		return getValue;
	}

	public void roll(){
		int rand = (int)(Math.random()*6)+1;
		getValue = rand;
	}

	public String toString(){
		return "Number of sides : " + sides + ", Value : " + getValue;
	}






}