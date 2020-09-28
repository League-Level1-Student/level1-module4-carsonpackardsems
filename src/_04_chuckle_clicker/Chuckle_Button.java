package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Button implements ActionListener {
public	String buttons;
public static void main(String[] args) {
Chuckle_Button c = new Chuckle_Button();
c.makeButtons("Joke code enabled");
}

public void makeButtons(String buttons) {
	JOptionPane.showMessageDialog(null, "loading makeButtons(). " + buttons + "instaniated");
	JOptionPane.showMessageDialog(null, "loading makeButtons().. " + buttons + "instaniated");
	JOptionPane.showMessageDialog(null, "loading makeButtons()... " + buttons + "instaniated" );
	JOptionPane.showMessageDialog(null, "adding JFrames, JPanels, JButtons, and JTs...");
	JOptionPane.showMessageDialog(null, "Chuckle Clicker Operational.");
	JFrame j = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	j.setVisible(true);
	j.add(p);
	p.add(b1);
	p.add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	j.setTitle("Chuckle Clicker Code: h02vt4");
	b1.setText("Joke");
	b2.setText("Punchline");
	j.pack();
	j.setSize(400, 75);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
