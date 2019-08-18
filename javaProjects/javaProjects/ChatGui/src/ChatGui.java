//usually require both swing and awt packages
// even if you are working with just swings
import javax.swing.*;
import java.awt.*;

public class ChatGui {
	public static void main(String[] args) {
		//Creating the frame
		JFrame frame = new JFrame("Chat Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		//create the Menu Bar and adding componenets
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("FILE");
		JMenu m2 = new JMenu("Help");
		mb.add(m1);
		mb.add(m2);
		JMenuItem m11 = new JMenuItem("Open");
		JMenuItem m22 = new JMenuItem("Save as");
		m1.add(m11);
		m2.add(m22);
		
		//Creating the panel at bottom and adding components
		JPanel panel = new JPanel(); //panel is not visible in output
		JLabel label = new JLabel("Enter Text");
		JTextField tf = new JTextField(10); //accepts up to 10 characters
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		panel.add(label); //components added using flow layout
		panel.add(label);
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		
		//Text area at the center
		JTextArea ta = new JTextArea();
		
		// Adding components to the frame
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, mb);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);
		}

}
