package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
int fails = 0;
int mw = 0;
	JFrame f = new JFrame();
JPanel p = new JPanel();
Random r = new Random();
JLabel l = new JLabel();
void drawButtons(int random){
	f.remove(p);
	p = new JPanel();
	for(int i = 0; i < 24; i++) {
		JButton b1 = new JButton();
		b1.addActionListener(this);
		if(i == random) {
			b1.setText("Mole");
		}
		else {
			b1.setText("      ");
		}
		p.add(b1);
	}
	f.add(p);
	f.pack();
	f.setSize(250, 400);
}
WhackAMole(){
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	f.add(p);
	drawButtons(r.nextInt(24));
	f.setSize(250, 400);
}
public static void main(String[] args) {
	WhackAMole wam = new WhackAMole();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JButton b = (JButton)arg0.getSource();
if(b.getText().equals("Mole")) {
	drawButtons(r.nextInt(24));
	mw++;
}
else {
	drawButtons(r.nextInt(24));
//	speak("Missed!");
	fails++;
	mw++;
}
if(mw >= 10) {
	f.dispose();
	endGame(new Date(), mw);
}
if(fails >= 5) {
	f.dispose();
	endGame(new Date(), mw);
}
}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}

private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
}
