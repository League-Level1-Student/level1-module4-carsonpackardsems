package _06_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {
JLabel l;
String i2 = "download2.jpeg";
String i3 = "thirdImage.png";
	// 1. Make a JFrame variable and initialize it using "new JFrame()"
JFrame f = new JFrame();
	public void run() {
		// 2. make the frame visible
		f.setVisible(true);
		// 3. set the size of the frame
		f.setSize(300,100);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel l;
		// 7. use the "loadImage..." methods below to initialize your JLabel
		l = loadImageFromComputer(i2);
		// 8. add your JLabel to the frame
		f.add(l);
		// 9. call the pack() method on the frame
		f.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		f.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("Clicked");
		// 12. remove everything from the frame that was added earlier
		f.dispose();
		f = new JFrame();
		// 13. load a new image like before (this is more than one line of code)
		l = loadImageFromComputer(i3);
		f.add(l);
		f.setVisible(true);
		// 14. pack the frame
		f.pack();
		
	}
	int pun = 0;
	String r4 = "I'm INVINCIBLE!!!";
	String r1 = "C'mon. Click the illusion.";
	String r2 = "Click it.";
	String r3 = "You can't get rid of me. Don't you get it?";{
	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups
	// Annoying popups

	
	if(pun == 0) {
		JOptionPane.showMessageDialog(null, r1);
		pun++;
	}
	else if(pun >= 1 || pun <= 4) {
		JOptionPane.showMessageDialog(null, r2);
		JOptionPane.showMessageDialog(null, r1);
		pun++;
	}
	else if(pun >= 5 || pun <= 9) {
		JOptionPane.showMessageDialog(null, r2);
		JOptionPane.showMessageDialog(null, r1);
		JOptionPane.showMessageDialog(null, r2);
		pun++;
	}
	else if(pun == 10) {
		JOptionPane.showMessageDialog(null, r3);
		JOptionPane.showMessageDialog(null, r4);
		pun = 0;	
	}
	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	}
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
}
}


