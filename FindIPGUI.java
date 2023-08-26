import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;

public class FindIPGUI {
		public static void main(String[] args) {
				// create a frame
				JFrame frame = new JFrame();

				// create top label
				JLabel topLabel = new JLabel();
				topLabel.setText("Enter the host below");
				topLabel.setBounds(50, 0, 150, 40);
				// create textfield
				JTextField input = new JTextField();
				input.setBounds(50, 50, 300, 40);

				// create label
				JLabel olabel = new JLabel();
				olabel.setBounds(50, 150, 200, 80);

				// create button
				JButton button = new JButton(" Convert ");
				button.setBounds(50, 300, 100, 40);
				button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
								try {
										String ip = InetAddress.getByName(input.getText()).getHostAddress();
										System.out.println(ip);
										olabel.setText("IP Address: " + ip);
								}
								catch(Exception ex) {
										olabel.setText("Invalid host!!");
								}
						}
				});

				// add to frame
				frame.add(topLabel);
				frame.add(input);
				frame.add(olabel);
				frame.add(button);

				// frame properties
				frame.setSize(500, 500);
				frame.setLayout(null);
				frame.setVisible(true);
		}
}
