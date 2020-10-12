package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Calculator implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JLabel l = new JLabel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JTextField tp1 = new JTextField(10);
	JTextField tp2 = new JTextField(10);
	Calculator() {
		f.setVisible(true);
		f.setSize(200, 200);
		b1.setText("Add");
		b2.setText("Subtract");
		b3.setText("Multiply");
		b4.setText("Divide");
		f.setTitle("Simple Calculator");
		f.add(p);
		p.add(l);
		p.add(b1);
		b1.addActionListener(this);
		p.add(b2);
		b1.addActionListener(this);
		p.add(b3);
		b1.addActionListener(this);
		p.add(b4);
		b1.addActionListener(this);
		p.add(tp1);
		p.add(tp2);
		f.pack();
		f.setSize(200, 200);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
	}
	public void multiply (String input1, String input2) {
		int Input1 = Integer.parseInt(input1);
		int Input2 = Integer.parseInt(input2);
		int output = Input1 * Input2;
		JOptionPane.showMessageDialog(null, output);
	}
	public void divide (String input1, String input2) {
		int Input1 = Integer.parseInt(input1);
		int Input2 = Integer.parseInt(input2);
		int output = Input1 / Input2;
		JOptionPane.showMessageDialog(null, output);
	}
	public void subtract (String input1, String input2) {
		int Input1 = Integer.parseInt(input1);
		int Input2 = Integer.parseInt(input2);
		int output = Input1 - Input2;
		JOptionPane.showMessageDialog(null, output);
	}
	public void add (String input1, String input2) {
		int Input1 = Integer.parseInt(input1);
		int Input2 = Integer.parseInt(input2);
		int output = Input1 + Input2;
		JOptionPane.showMessageDialog(null, output);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String input1 = tp1.getText();
		String input2 = tp2.getText();
		if(arg0.getSource() == b1){
			add(input1, input2);
		}
		if(arg0.getSource() == b2){
			subtract(input1, input2);
		}
		if(arg0.getSource() == b3){
			multiply(input1, input2);
		}
		if(arg0.getSource() == b4){
			divide(input1, input2);
		}
	}
}
