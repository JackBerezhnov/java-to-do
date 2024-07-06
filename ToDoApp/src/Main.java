import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
		String tasks[] = {"Wash a car", "Work", "Sleep"};
		
		JFrame frame = new JFrame();
		JButton addButton = new JButton("Add Task");
		JPanel panel = new JPanel();
		JTextField input = new JTextField();
		DefaultListModel<String> taskListModel = new DefaultListModel<>();
		JList<String> listOfTasks = new JList<>(taskListModel);
		
		addButton.setBounds(150, 200, 220, 50);
		Dimension preferredSize = new Dimension(300, 20);
		input.setPreferredSize(preferredSize);
			
		panel.add(input);
		panel.add(addButton);
		
		frame.add(panel, "North");
		frame.add(new JScrollPane(listOfTasks), "Center");

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String task = input.getText().trim();
				if(!task.isEmpty()) {
					taskListModel.addElement(task);
					input.setText("");
				}
			}
		});
		
		frame.setSize(500, 600);
		frame.setVisible(true); 
		
	}
}
