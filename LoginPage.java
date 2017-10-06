/**
* <h1>Login Page for the Hospital management System</h1>
* This code shows Login for Admin and Doctor.
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
//
class LoginPage extends JFrame implements ActionListener
{
	//contents
	JLabel label1;
	JTextField username;
	JLabel label2;
	JPasswordField password;
	JButton button;
	JButton button2;
	JFrame f;
	Dimension d;
/**
* This constructor is used to initialize all the contents and container
*It is also used for adding elements to the container 
*/
	LoginPage()
	{
		//Objects created
		label1=new JLabel("Username");
		username=new JTextField(5);
		label2=new JLabel("Password");
		password=new JPasswordField(5);
		button =new JButton("Login");
		button2=new JButton("Clear");
		f=new JFrame();
		d=new Dimension(100,100);
		button.setSize(d);
		button2.setSize(d);
	
		//Container created
		Container c =getContentPane();
		c.setLayout(new GridLayout(10,3));
		c.add(label1);
		c.add(username);
		c.add(label2);
		c.add(password);
		c.add(button);
		c.add(button2);
		
		//Add Listener
		button.addActionListener(this);
		button2.addActionListener(this);
		
	}
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
			String user=username.getText();
			char arr[]={'a','d','m','i','n'};
			char pass[]=password.getPassword();
			
			if(user.length()>0 && pass.length>0)
			{
				if(user.equals("admin"))
				{
					if(Arrays.equals(pass,arr))
					{
						
						
					}
					else
					{
						JOptionPane.showMessageDialog(f,"Password invalid");
					}
				}
				if(Arrays.equals(pass,arr))
				{
					if(user.equals("admin"))
					{
						JOptionPane.showMessageDialog(f,"Valid Login");
					}
					else
					{
						JOptionPane.showMessageDialog(f,"Username invalid");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(f,"Invalid Login");
				}
			}
			else if(user.length()==0 && pass.length==0)
			{
				JOptionPane.showMessageDialog(f,"Username and Password both are empty");
			}
			else if(user.length()==0)
			{
				JOptionPane.showMessageDialog(f,"Username cannot be empty");
			}
			else if(pass.length==0)
			{
				JOptionPane.showMessageDialog(f,"Password cannot be empty");
			}

		}
		else if(caption.equals("Clear"))
		{
			username.setText("");
			password.setText("");
		}
	}
	
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
		LoginPage login=new LoginPage();

		
		login.setSize(400,500);
		login.setVisible(true);
		login.setTitle("Action Events");
		login.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}//end of main function
}//end of class login