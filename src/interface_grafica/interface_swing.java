package interface_grafica;

import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class interface_swing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("app");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 600);
		frame.setLayout(null);
		frame.setTitle("Java App JFrame");
		// configuracao inicial jframe
		JLabel label = new JLabel("Login: ");
		label.setBounds(10, 10, 100, 50);
		frame.add(label);
		
		JLabel label1 = new JLabel("User: ");
		label1.setBounds(100, 100, 50, 50);
		frame.add(label1);
		
		JLabel label2 = new JLabel("Password: ");
		label2.setBounds(100, 100, 300, 300);
		frame.add(label2);
		
		JTextField textField = new JTextField();
		textField.setBounds(150, 150, 100, 35);
		frame.add(textField);
		
		JTextField text2 = new JTextField();
		text2.setBounds(150, 270, 100, 35);
		frame.add(text2);
		
		frame.setVisible(true);
		

	}

}
