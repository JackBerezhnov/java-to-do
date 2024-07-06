import java.awt.Color;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Click");
		JPanel panel = new JPanel();
		
		button.setBounds(150, 200, 220, 50);
		
		panel.add(button);
		
		frame.add(panel);
		
		frame.setSize(500, 600);
		
		frame.setVisible(true); 
		
	}
}
