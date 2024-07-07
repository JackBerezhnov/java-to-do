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
		
		listOfTasks.addListSelectionListener( new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				System.out.print(listOfTasks.getSelectedIndex());
			}
		});
		
		frame.setSize(500, 600);
		frame.setVisible(true); 
		
	}
}
