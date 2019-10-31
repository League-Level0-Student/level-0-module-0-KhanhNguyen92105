package _04_knock_knock;

import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		
		String badjoke = JOptionPane.showInputDialog("knock knock");
		if(badjoke.equalsIgnoreCase("who's there?")) {
			JOptionPane.showMessageDialog(null, "your mother, and it's time to go clean your room you dirty piece of ungrateful, useless crap.");
		}
		
		
		
	}

}
