package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiApp1 {

	// Note: Typically the main method will be in a
	// separate class. As this is a simple one class
	// example it's all in the one class.

	public static void main(String[] args)
	{
		new GuiApp1();
		JPanel newPanel = new JPanel();
		newPanel.setLayout(new BorderLayout());

		Component westernPanel = null;
		newPanel.add(westernPanel, BorderLayout.NORTH);
		Component yourOldPanel = null;
		newPanel.add(yourOldPanel, BorderLayout.CENTER);
		Component eastenPanel = null;
		newPanel.add(eastenPanel, BorderLayout.EAST);
	}
	public GuiApp1()
	{
		JFrame guiFrame = new JFrame();
		//Makes the GUI
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("First GUI");
		guiFrame.setSize(250, 100);
		
		guiFrame.setLocationRelativeTo(null);
		
		
		String[] Options = { "Yes","No" };
		// Options for the JList
		String[] yes = { "Good Fucking choice"};
		
		String[] no = { 
														// The first JPanel contains a JLabel and JCombobox
		"Asparagus", "Beans", "Broccoli", "Cabbage",
				"Carrot", "Celery", "Cucumber", "Leek", "Mushroom", "Pepper",
				"Radish", "Shallot", "Spinach", "Swede", "Turnip"
				};
		
		
		final JPanel comboPanel = new JPanel();
		
		JLabel comboLbl = new JLabel("Fruit or Veg?");
		
		JComboBox fruits = new JComboBox(Options);
		
		comboPanel.add(comboLbl);
		comboPanel.add(fruits);
															// Create the second JPanel. Add a JLabel and JList and
															// make use the JPanel is not visible.
		final JPanel listPanel = new JPanel();
		
		listPanel.setVisible(false);
		
		JLabel listLbl = new JLabel("");
		
		JList correctanswer = new JList(no);
		JList wronganswer = new JList(no);
		correctanswer.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		
		listPanel.add(listLbl);
		listPanel.add(correctanswer);
		
		JButton vegFruitBut = new JButton("");
		vegFruitBut.addActionListener(new ActionListener() {	
			@Override
		
			public void actionPerformed(ActionEvent event) {
														
				listPanel.setVisible(!listPanel.isVisible());
				comboPanel.setVisible(!comboPanel.isVisible());

			}
		});
																	// The JFrame uses the BorderLayout layout manager.
																	// Put the two JPanels and JButton in different areas.
		guiFrame.add(comboPanel, BorderLayout.NORTH);
		guiFrame.add(listPanel, BorderLayout.CENTER);
		guiFrame.add(vegFruitBut, BorderLayout.SOUTH);
		guiFrame.setVisible(true);									//makes it visible.
		
	}
}
