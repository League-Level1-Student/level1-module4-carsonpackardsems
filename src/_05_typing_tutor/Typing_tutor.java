package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Typing_tutor implements KeyListener {
	char currentLetter;
	JLabel l = new JLabel();
	Typing_tutor(){
		currentLetter = generateRandomLetter();
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setTitle("Type, Type, Type!(or die)");
		f.add(l);
		l.setText("" + currentLetter);
		l.setFont(l.getFont().deriveFont(28.0f));
		l.setHorizontalAlignment(JLabel.CENTER);
		f.addKeyListener(this);
		f.pack();
		f.setSize(300, 100);
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	public static void main(String[] args) {
		Typing_tutor t = new Typing_tutor();	
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		currentLetter = generateRandomLetter();
		l.setText("" + currentLetter);
		l.setFont(l.getFont().deriveFont(28.0f));
		l.setHorizontalAlignment(JLabel.CENTER);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		//What the heck do I do  now?
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
