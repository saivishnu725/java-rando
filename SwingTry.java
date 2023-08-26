import java.awt.event.*;
import javax.swing.*;

public class SwingTry {
		public static void main(String[] args) {
				// create a frame
				JFrame f = new JFrame();

				// create a textfield
				JTextField text = new JTextField();
				text.setBounds(150, 50, 200, 40);

				// create a button
				JButton b = new JButton("Click here");
				b.setBounds(150, 150, 110, 40);

				// add textfield, button to frame
				f.add(text);
				f.add(b);

				// ActionListener to set text on click
				b.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
								text.setText("Hello, world!!");
						}
				});

				//set properties of frame and make it visible
				f.setSize(400,500);
				f.setLayout(null);
				f.setVisible(true);
		}
}
