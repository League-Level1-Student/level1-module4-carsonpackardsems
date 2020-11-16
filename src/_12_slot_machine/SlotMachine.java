package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
JFrame f = new JFrame();
JPanel p = new JPanel();
JLabel l1;
JLabel l2;
JLabel l3;
JButton reel = new JButton();
Random r = new Random();
int image1 = r.nextInt(2);
int image2 = r.nextInt(2);
int image3 = r.nextInt(2);

SlotMachine(){
try {
	l1 = createLabelImage("StartPosition.jpeg");
	l2 = createLabelImage("StartPosition.jpeg");
	l3 = createLabelImage("StartPosition.jpeg");
} catch (MalformedURLException e) {
	e.printStackTrace();
}
f.setVisible(true);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
 f.add(p);
 p.add(l1);
 p.add(l2);
 p.add(l3);
 p.add(reel);
 reel.setText("SPIN THAT WHEEL!");
 reel.addActionListener(this);
 f.pack();
}
public static void main(String[] args) {
	SlotMachine sm = new SlotMachine();
}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	image1 = r.nextInt(3);
	image2 = r.nextInt(3);
	image3 = r.nextInt(3);
	p.remove(l1);
	p.remove(l2);
	p.remove(l3);
	if(image1 == 0) {
		try {
			l1 = createLabelImage("banana.jpeg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}
	if(image1 == 1) {
		try {
			l1 = createLabelImage("Jackfruit.jpeg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}
	if(image1 == 2) {
		try {
			l1 = createLabelImage("Strawberry.jpeg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}
	if(image2 == 0) {
		try {
			l2 = createLabelImage("banana.jpeg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}
	if(image2 == 1) {
		try {
			l2 = createLabelImage("Jackfruit.jpeg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}
	if(image2 == 2) {
		try {
			l2 = createLabelImage("Strawberry.jpeg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}
	if(image3 == 0) {
		try {
			l3 = createLabelImage("banana.jpeg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}
	if(image3 == 1) {
		try {
			l3 = createLabelImage("Jackfruit.jpeg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}
	if(image3 == 2) {
		try {
			l3 = createLabelImage("Strawberry.jpeg");
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}
	}

	
	p.add(l1);
	p.add(l2);
	p.add(l3);
	f.pack();
	if(image1 == image2) {
		if(image2 == image3) {
			JOptionPane.showMessageDialog(null, "YOU WIN!!!");
		}
	}
}
}
