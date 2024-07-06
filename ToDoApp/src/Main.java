import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Add Task");
		JPanel panel = new JPanel();
		JTextField input = new JTextField();
		
		button.setBounds(150, 200, 220, 50);
		Dimension preferredSize = new Dimension(300, 20);
		input.setPreferredSize(preferredSize);
		
		panel.add(input);
		panel.add(button);
		
		frame.add(panel);
		frame.setSize(500, 600);
		frame.setVisible(true); 
		
	}
}
