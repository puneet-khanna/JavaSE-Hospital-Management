/*
* <h1>Main Page for the Hospital management System</h1>
* This code shows three buttons which perform differnt actions.
* It implements basic techniques of BPP
*<p>
* Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
* 
*
* @author  Puneet Khanna
* @version 1.0
* @since   v1.0
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;
class MainPage extends JFrame implements ActionListener
{
	
	JButton button;
	JButton button2;
	JButton button3;
	JFrame f;
	Dimension d;
	/**
* This constructor is used to initialize all the contents and container
*It is also used for adding elements to the container 
*/
	MainPage()
	{
		//Objects created
		
		button =new JButton("Login");
		button2=new JButton("Doctor Registration");
		button3=new JButton("Pateint Registration");
		f=new JFrame();
		d=new Dimension(100,100);
		button.setSize(d);
		button2.setSize(d);
		button3.setSize(d);
	
		//Container created
		Container c =getContentPane();
		c.setLayout(new GridLayout(10,3));
		
		c.add(button);
		c.add(button2);
		c.add(button3);
		//Add Listener
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
	}
	//ActionEvent 
	/**
* This method is used to catch the action performed using buttons
* @param a This is the first paramter to store the action event
* @return Nothing
*/
//ActionEvent 
	public void actionPerformed(ActionEvent a)
	{
		String caption=a.getActionCommand();
		if(caption.equals("Login"))
		{
			LoginPage handle=new LoginPage();
			handle.setSize(700,700);
			handle.setVisible(true);
			handle.setTitle("Login");
			handle.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		else if(caption.equals("Doctor Registration"))
		{
			Doctor doc = new Doctor();
			doc.setSize(700,700);
			doc.setTitle("Doctor Entry Form");
			doc.setVisible(true);
			doc.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		else if(caption.equals("Pateint Registration"))
		{
			Medical medi= new Medical();
			medi.setSize(700,700);
			medi.setTitle("Patient Entry Form");
			medi.setVisible(true);
			medi.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}


	}//end of actionPerformed()

	//main function

	/**
* This is the main method which creates object of type LoginPage and sets parameters for it
* @param args Unused.
* @return Nothing.
* @exception IOException On input error.
* @see IOException
*/

	public static void main(String args[])
	{
		MainPage handle=new MainPage();

		
		handle.setSize(300,300);
		handle.setVisible(true);
		handle.setTitle("Action Events");
		handle.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}//end of main function
}//end of class main