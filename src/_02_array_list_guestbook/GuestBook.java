package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int num = 1;
	JButton add = new JButton("Add Names");
	JButton view = new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();
	
	public void setup() {
		panel.add(view);
		panel.add(add);
		frame.add(panel);
		add.addActionListener(this);
		view.addActionListener(this);
		
		frame.setVisible(true);
		frame.pack();
	}
	@Override
	
	
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == add) {
			String name = JOptionPane.showInputDialog("Enter A name: ");
			names.add("Guest #" + num + ":" +name+ "\n");
			num+=1;
		}
		if(buttonPressed == view) {
			String s = "";
			for(int i = 0; i<names.size(); i++) {
				s += names.get(i);
				

			}
			JOptionPane.showMessageDialog(null, s);
			
		}
	}
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
