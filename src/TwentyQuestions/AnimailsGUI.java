package TwentyQuestions;

import javax.swing.*;

import java.awt.TextField;
import java.awt.event.*;

public class AnimailsGUI extends JFrame {
	
	private JButton Yes;
	private JButton No;
	private JButton Sometimes;
	private JButton Unsure;
	private JPanel panel;
	private JLabel messageLabel;
	private TextField userinput;
	private JLabel useranswer;
	private TextField usermammel;
	
	private final int WINDOW_WIDTH = 250;
	private final int WINDOW_HEIGHT = 320;
	int c = 0;

	public AnimailsGUI() {
		setTitle("20 QUESTIONS");

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		messageLabel = new JLabel("Welcome to 20 Questions");

		userinput = new TextField(25);
		
		Yes = new JButton("Yes");
		No = new JButton("No");
		Sometimes = new JButton("Sometimes");
		Unsure = new JButton("Maybe/Unsure");
		
		useranswer = new JLabel("What was your mammel then?");
		
		usermammel = new TextField(15);

		Yes.addActionListener(new ButtonListener());
		No.addActionListener(new ButtonListener());
		Sometimes.addActionListener(new ButtonListener());
		Unsure.addActionListener(new ButtonListener());

		panel = new JPanel();
		panel.add(messageLabel);
		
		
		panel.add(userinput);
		
		panel.add(Yes);
		panel.add(No);
		panel.add(Sometimes);
		panel.add(Unsure);
		
		panel.add(useranswer);
		
		panel.add(usermammel);
		
		
		add(panel);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		AnimailsGUI eow = new AnimailsGUI();

	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String actionCommand = e.getActionCommand();

			if (actionCommand.equals("No")) {
				
			} else if (actionCommand.equals("Yes")) {
				
			} else if (actionCommand.equals("Sometimes")) {
				
			} else if (actionCommand.equals("Maybe/Unsure")) {
			
			}
		}

	}

	
}
