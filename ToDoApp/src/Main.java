import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JButton addButton = new JButton("Add Task");
		JButton deleteButton = new JButton("Delete Task");
		JButton completeButton = new JButton("Complete Task");
		JPanel panel = new JPanel();
		JTextField input = new JTextField();
		DefaultListModel<String> taskListModel = new DefaultListModel<>();
		JList<String> listOfTasks = new JList<>(taskListModel);
		
		addButton.setBounds(150, 200, 220, 50);
		deleteButton.setBounds(150, 200, 220, 50);
		completeButton.setBounds(150, 200, 220, 50);
		Dimension preferredSize = new Dimension(200, 20);
		input.setPreferredSize(preferredSize);
			
		panel.add(input);
		panel.add(addButton);
		panel.add(deleteButton);
		panel.add(completeButton);
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
		
		deleteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = listOfTasks.getSelectedIndex();
				if (selectedIndex != -1) {
					taskListModel.remove(selectedIndex);
				}
			}
		});
		
		completeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = listOfTasks.getSelectedIndex();
				if (selectedIndex != -1) {
					String task = taskListModel.getElementAt(selectedIndex);
					taskListModel.set(selectedIndex, task + " (Completed)");
				}
			}
		});
		
		frame.setSize(700, 700);
		frame.setVisible(true); 
		
	}
}
