package Assignment4;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.OutputStream;

import Assignment4.RecordManager;

public class RecordGUI extends Frame implements WindowListener, ActionListener {
	
	TextField commandtext = new TextField(15);
	
	JFrame frame = new JFrame("Test");
	
	JTextArea commands_being_output = new JTextArea(20,20);
	
	JScrollPane scroll = new JScrollPane(commands_being_output, 
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	
	String[] commandlist = { 						//the commands that the user can have in the 
				"c_k", "e_k", "s_k_d",				//JComboBox
				"d_k", "r_k", "xs",
				"xh", "xa", "xb", 
				"xp" };
	JComboBox commands = new JComboBox(commandlist);
	Button pressme;
	
	
	Font font  = new Font("Verdana", Font.BOLD, 12);	//changes the font 
	Font font2 = new Font("Times New Roman", Font.BOLD, 12);
	Font font3 = new Font("Verdana", Font.BOLD, 12);
	Font font4 = new Font("Verdana", Font.BOLD, 12);
	
	public RecordGUI(String title) {

		super(title);
		setLayout(new FlowLayout());
		addWindowListener(this);
		add(commands_being_output);
		add(commands);
		
		add(commandtext);
		commandtext.addActionListener(this);
		pressme = new Button("Press ME");
		add(pressme);
		pressme.addActionListener(this);
		
		/*JFrame frame = new JFrame("Test");
		JTextArea commands_being_output = new JTextArea(20,20);
		JScrollPane scroll = new JScrollPane(commands_being_output, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		frame.add(scroll);
		frame.setVisible(true);
	*/
	}
	

	public void actionPerformed(ActionEvent e) {							//put all my commands in the actionPerformed
																			//changes the font and color for each one
																			//roughly different each time
		String command = (String) commands.getSelectedItem();
		String userinput = commandtext.getText();
		
			
		if(command.equals("c_k")){											//Made it so the Strings in the String list, will check to 
			commands_being_output.setFont(font);							//if they are equivalent, if they are it will run the
			commands_being_output.setForeground(Color.blue);				//commands inside the if statement and call the RecordManager
			
			commands_being_output.append(RecordManager.c(Integer.parseInt(userinput)));
			
		}
		else if(command.equals("e_k")){
			commands_being_output.setFont(font2);
			commands_being_output.setForeground(Color.red);
			
			commands_being_output.append(RecordManager.e(Integer.parseInt(userinput)));
			
		}
		else if(command.equals("s_k_d")){
			commands_being_output.setFont(font3);
			commands_being_output.setForeground(Color.red);
			String seperation[] = userinput.split("\\s");
			int k = Integer.parseInt(seperation[0]);
			float d = Float.parseFloat(seperation[1]);
			commands_being_output.append(RecordManager.s(k,d));
			
		}
		else if(command.equals("d_k")){
			commands_being_output.setFont(font4);
			commands_being_output.setForeground(Color.red);
			
			commands_being_output.append(RecordManager.d(Integer.parseInt(userinput)));
			
		}
		else if(command.equals("r_k")){
			commands_being_output.setFont(font);
			commands_being_output.setForeground(Color.red);
			
			commands_being_output.append(RecordManager.r(Integer.parseInt(userinput)));
			
		}
		else if(command.equals("xs")){
			commands_being_output.setFont(font2);
			commands_being_output.setForeground(Color.green);
			
			commands_being_output.append(RecordManager.xs());
		
			
		}
		else if(command.equals("xh")){
			commands_being_output.setFont(font3);
			commands_being_output.setForeground(Color.orange);
			
			commands_being_output.append(RecordManager.xh());
		
		}
		else if(command.equals("xa")){
			commands_being_output.setFont(font4);
			commands_being_output.setForeground(Color.pink);
			
			commands_being_output.append(RecordManager.xa());
			
		}
		else if(command.equals("xb")){
			commands_being_output.setFont(font);
			commands_being_output.setForeground(Color.red);
		
			commands_being_output.append(RecordManager.xb());
			
		}
		else if (command.equals("xp")){
			commands_being_output.setFont(font2);
			commands_being_output.setForeground(Color.red);
			
			commands_being_output.append(RecordManager.xp());
		}
	
	}		
															//the methods below enable the 
	public void windowClosing(WindowEvent e) {				//GUI to close/open and 
		dispose();											//allow the user to interact with it
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
		return;
	}

	public void windowActivated(WindowEvent e) {
		return;
	}

	public void windowIconified(WindowEvent e) {
		return;
	}

	public void windowDeiconified(WindowEvent e) {
		return;
	}

	public void windowDeactivated(WindowEvent e) {
		return;
	}

	public void windowClosed(WindowEvent e) {
		return;
	}
	
	/*
	public void TextAreaOutputStream( JTextArea control ) {
		commands_being_output = control;
	}

	public void write( int b ) throws IOException {
	   commands_being_output.append(String.valueOf((char)b));
	}  
	
*/	public static void main(String[] args) {					//creates the GUI 
		RecordGUI myWindow = new RecordGUI("GUI Homework 4");
		myWindow.setSize(400,400);
		myWindow.setVisible(true);
		
	}
}