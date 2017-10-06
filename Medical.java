/**
* <h1>Patient Registration Form</h1>
* This code shows Patient Registration Form.
* It implements basic techniques of BPP
*<p>
* Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
* 
*
* @author  Manasvi Agrawal
* @version 1.0
* @since   v1.0
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Medical extends JFrame implements ItemListener, ActionListener
{
	//Contents
	JLabel lwelcome, lname, lage, lheight, lgender, lbloodgroup, leyecolour, lweight, lemail, lphone,ldisease,lresult;
	JTextField tname, tage, tweight, theight, temail, tphone,tdisease;
	JComboBox cbloodgroup, ceyecolour;
	JRadioButton male,female;
	JButton submit, cancel;
	ButtonGroup bg;
	JPanel pname,page,pheight,pgender,pbloodgroup,peyecolour,pweight,pemail,pphone,pdisease,pbutton;
	
	//Attributes
	String name, age, height, weight, gender, bloodgroup, eyecolour, email, phone,disease;
	//name=age=height=weight=gender=bloodgroup=eyecolour=email=phone="";
	
/**
* This constructor is used to initialize all the contents and container
*It is also used for adding elements to the container 
@return Nothing
*/

	Medical()
	{
		
		//Initializing the labels with some values
		lwelcome=new JLabel("Please fill in the following medical details");
		lname=new JLabel("Name: ");
		lage=new JLabel("Age: ");
		lgender=new JLabel("Gender: ");
		lheight=new JLabel("Height: ");
		lbloodgroup=new JLabel("Blood Group: ");
		leyecolour=new JLabel("Eye Colour: ");
		lweight=new JLabel("Weight: ");
		lemail=new JLabel("Email: ");
		lphone=new JLabel("Phone Number: ");
		ldisease=new JLabel("Disease: ");
		lresult=new JLabel("");
		
		
		//Initializing TextFields
		tname=new JTextField(15); 
		tage=new JTextField(15);
		tweight=new JTextField(15);
		theight=new JTextField(15);
		temail=new JTextField(15);
		tphone=new JTextField(15);
		tdisease=new JTextField(15);
		
		
		//Adding values to all the comboboxes
		cbloodgroup=new JComboBox();
		cbloodgroup.addItem("A+");
		cbloodgroup.addItem("A-");
		cbloodgroup.addItem("B+");
		cbloodgroup.addItem("A-");
		cbloodgroup.addItem("O+");
		cbloodgroup.addItem("O-");
		cbloodgroup.addItem("AB+");
		cbloodgroup.addItem("AB-");
		
		ceyecolour=new JComboBox();
		ceyecolour.addItem("Black");
		ceyecolour.addItem("Amber");
		ceyecolour.addItem("Blue");
		ceyecolour.addItem("Brown");
		ceyecolour.addItem("Green");
		ceyecolour.addItem("Hazel");
		ceyecolour.addItem("Red");
		ceyecolour.addItem("Grey");
		
		
		//Initializing radiobuttons
		male=new JRadioButton("Male");
		female=new JRadioButton("Female");
		
		//Create Button group
		bg=new ButtonGroup();
		
		//Add RadioButtons to the group so that only one of them can be selected
		bg.add(male);
		bg.add(female);
		
		
		//Initializing Buttons
		submit=new JButton("Submit");
		cancel=new JButton("Cancel");
		
		//Initializing panels
		pname=new JPanel(new FlowLayout());
		page=new JPanel(new FlowLayout());
		pheight=new JPanel(new FlowLayout());
		pgender=new JPanel(new FlowLayout());
		pbloodgroup=new JPanel(new FlowLayout());
		peyecolour=new JPanel(new FlowLayout());
		pweight=new JPanel(new FlowLayout());
		pemail=new JPanel(new FlowLayout());
		pphone=new JPanel(new FlowLayout());
		pdisease=new JPanel(new FlowLayout());
		pbutton=new JPanel(new FlowLayout());
		
		//add contents to panel
		pname.add(lname);
		pname.add(tname);
		page.add(lage);
		page.add(tage);
		pgender.add(lgender);
		pgender.add(male);
		pgender.add(female);
		pheight.add(lheight);
		pheight.add(theight);
		pweight.add(lweight);
		pweight.add(tweight);
		pbloodgroup.add(lbloodgroup);
		pbloodgroup.add(cbloodgroup);
		peyecolour.add(leyecolour);
		peyecolour.add(ceyecolour);
		pphone.add(lphone);
		pphone.add(tphone);
		pemail.add(lemail);
		pemail.add(temail);
		pdisease.add(ldisease);
		pdisease.add(tdisease);
		pbutton.add(submit);
		pbutton.add(cancel);
		
		
		//Retrive Container
		Container cn=getContentPane();
		
		//Set layout
		cn.setLayout(new GridLayout(18,1));
		
		//Add contents
		cn.add(lwelcome);
		cn.add(pname);
		cn.add(page);
		cn.add(pgender);
		cn.add(pphone);
		cn.add(pemail);
		cn.add(pheight);
		cn.add(pweight);
		cn.add(peyecolour);
		cn.add(pbloodgroup);
		cn.add(pdisease);
		cn.add(pbutton);
		cn.add(lresult);
		
		//Add Listener
		submit.addActionListener(this);
		cancel.addActionListener(this);
		
	}//end of constructor
	
/**
* This method is used to catch the selection made in the combobox
* @param e This is the first paramter to store the state change
* @return Nothing
*/
	public void itemStateChanged(ItemEvent e)
	{
		bloodgroup=cbloodgroup.getSelectedItem().toString();
		eyecolour=ceyecolour.getSelectedItem().toString();
	}//end of itemStateChanged()
	
/**
* This method is used to catch the action performed using buttons
* @param a This is the first paramter to store the action event
* @return Nothing
*/
	public void actionPerformed(ActionEvent a)
	{
		String caption=a.getActionCommand();
		
		if(caption.equals("Submit"))
		{
			name=tname.getText();
			lresult.setText(name+" your data has been successfully submitted..!!");
		}
		
		if(caption.equals("Cancel"))
		{
			tname.setText("");
			tage.setText("");
			temail.setText("");
			theight.setText("");
			tphone.setText("");
			tweight.setText("");
			lresult.setText("Entry Cancelled..!!");
		}
	}//end of actionPerformed()
	
/**
* This is the main method which creates object of type Medical and sets parameters for it
* @param args Unused.
* @return Nothing.
* @exception IOException On input error.
* @see IOException
*/

	public static void main(String args[])
	{
			Medical medi= new Medical();
			medi.setSize(700,700);
			medi.setTitle("Patient Entry Form");
			medi.setVisible(true);
			medi.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}//end of main()
	
}//class Medical ends