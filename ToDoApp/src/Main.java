import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
		String tasks[] = {"Wash a car", "Work", "Sleep"};
		
		JFrame frame = new JFrame();
		JButton button = new JButton("Add Task");
		JPanel panel = new JPanel();
		JTextField input = new JTextField();
		JList listOfTasks = new JList(tasks);
		
		button.setBounds(150, 200, 220, 50);
		Dimension preferredSize = new Dimension(300, 20);
		input.setPreferredSize(preferredSize);
			
		panel.add(input);
		panel.add(button);
		panel.add(listOfTasks);
		
		frame.add(panel);
		frame.setSize(500, 600);
		frame.setVisible(true); 
		
	}
}
