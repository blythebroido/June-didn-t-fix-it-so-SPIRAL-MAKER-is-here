// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
Tortoise.setSpeed(10);
		// 3. Make a variable to hold the number of sides and set it to 0
int sides = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or
		// pentagon)
String octopus = JOptionPane.showInputDialog("How many sides do you want?");
int starfish = Integer.parseInt(octopus);
		// 5. Set the number of sides depending on what the user entered
		// (multiple lines of code)

		// 6. If the user enters something else, say
		// "Sorry, I don't know how to draw a ..."

		// 1. Make the Tortoise draw a square spiral shape. If you get stuck,
		// use these instructions: http://bit.ly/YJUOkn
	

		// 2. Change your code to turn the square spiral into a triangle spiral
for (int b = 0; b < 81; b++) {
	Tortoise.move(b * 4);
	Tortoise.turn(360/starfish);
}
	}

}
