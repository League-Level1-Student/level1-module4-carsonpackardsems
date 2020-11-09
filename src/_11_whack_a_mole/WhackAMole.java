package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
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
}
else {
	drawButtons(r.nextInt(24));
//	speak("Missed!");
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
}
