import java.awt.Color;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Add Task");
		JPanel panel = new JPanel();
		JTextField input = new JTextField();
		
		button.setBounds(150, 200, 220, 50);
		input.setBounds(0, 0, 500, 100);
		
		panel.add(button);
		panel.add(input);
		
		frame.add(panel);
		
		frame.setSize(500, 600);
		
		frame.setVisible(true); 
		
	}
}
