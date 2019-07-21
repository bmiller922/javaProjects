import java.awt.BorderLayout;

import javax.swing.*;

public class gui {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		JButton button1 = new JButton("Button 1 (PAGE_START)");
		JButton button2 = new JButton("Button 2 (PAGE_END)");
		frame.getContentPane().add(button1, BorderLayout.PAGE_START); //adds button to the content pane of frame
		frame.getContentPane().add(button2, BorderLayout.PAGE_END);
		frame.setVisible(true);
	}

}
