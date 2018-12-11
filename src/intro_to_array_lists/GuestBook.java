package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
		
		JFrame boi = new JFrame();
		JPanel esketit = new JPanel();
		JButton wow = new JButton();
		JButton boof = new JButton();
		ArrayList<String> pass = new ArrayList<String>();
		GuestBook() {
			boi.add(esketit);
			boi.setVisible(true);
			esketit.add(wow);
			esketit.add(boof);
			wow.addActionListener(this);
			boof.addActionListener(this);
			wow.setText("Add name");
			boof.setText("View name(s)");
			boi.pack();
	
		}
		public static void main(String[] args) {
			GuestBook lol = new GuestBook();
					}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
		@Override
		
		public void actionPerformed(ActionEvent arg0) {
			JButton ButtonPressed = (JButton) arg0.getSource();
			// TODO Auto-generated method stub
			if (ButtonPressed == wow) {
				String ayy = JOptionPane.showInputDialog("Add a name");
				pass.add(ayy);
			}
			else {
				String lsd = "";
				for (int i = 0;i < pass.size(); i++) {
					String bad = pass.get(i);
					lsd += " Guest #" + (i+1) + ": " + bad;
				}
				JOptionPane.showMessageDialog(null, lsd);
			}
		}
}
