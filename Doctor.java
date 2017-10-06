/**
* <h1>Doctor's Registration Form</h1> 
* This opens up a Doctor's Registration Form
* Code implies use of BPP.
* Giving proper comments in your program makes it more
  user friendly and it is assumed as a high quality code.

  
* @author  GAURI KULKARNI
* @version 1.0
* @since   1.0v 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Doctor extends JFrame implements ActionListener
{
	
	//Using JPanel Initializing the labels with some values
	JPanel welcomepanel = new JPanel();
	JPanel centerpanel = new JPanel();
	JPanel namepanel = new JPanel();
	JPanel surnamepanel = new JPanel();
	JPanel phonepanel = new JPanel();
	JPanel emailpanel = new JPanel();
	JPanel addresspanel = new JPanel();
	JPanel genderpanel = new JPanel();
	JPanel designationpanel = new JPanel();
	JPanel specializationpanel = new JPanel();
	JPanel buttonpanel = new JPanel();

	//USing JLabel
	JLabel welcome = new JLabel("Doctor Registration Form.");
	JLabel nameLabel = new JLabel("Name: ");
	JLabel surnameLabel = new JLabel("Surname: ");
	JLabel phoneLabel = new JLabel("Phone Number:");
	JLabel emailLabel = new JLabel("Email Id:");
	JLabel addressLabel = new JLabel("Address: ");
	JLabel genderLabel = new JLabel("Gender: ");
	JLabel designationLabel = new JLabel("Designation: ");
	JLabel specializationLabel = new JLabel("Specialization: ");
	JLabel Iresult = new JLabel();

	//Using JTextField
	JTextField name = new JTextField(20);
	JTextField surname = new JTextField(20);
	JTextField phone = new JTextField(12);
	JTextField email = new JTextField(30);
	JTextArea address = new JTextArea(10,13);
	
	//Using JCheckBox
	JCheckBox Senior_Doctor = new JCheckBox("Senior Doctor");
	JCheckBox Junior_Doctor = new JCheckBox("Junior Doctor");
	JCheckBox Receptionist = new JCheckBox("Receptionist");
	JCheckBox Nurse = new JCheckBox("Nurse");

	//Using JRadioButton
	JRadioButton male = new JRadioButton("Male");
	JRadioButton female = new JRadioButton("Female");
	ButtonGroup bg = new ButtonGroup();

	//Applying JComboBox for dropdown list.
	String specializationlist[] ={"Physician","Dentist"," Gynecologist","ENT","Surgeon","Psychiatrist"};
	JComboBox<String> specialization = new JComboBox<String>(specializationlist);

	//JButton to create buttons.
	JButton submit = new JButton("Submit");
	JButton cancel = new JButton("Cancel");

/**
* This Constructor is used to add cotents.
* It is also used to add Values to the form.
* @return Nothig
**/
	Doctor()
		{	
	
			//Adding all the contents in the Form.
			welcomepanel.add(welcome);
			add(welcomepanel,BorderLayout.NORTH);

			buttonpanel.add(submit,BorderLayout.WEST);
			buttonpanel.add(cancel,BorderLayout.EAST);
			buttonpanel.add(Iresult,BorderLayout.SOUTH);

			add(buttonpanel,BorderLayout.SOUTH);

			namepanel.add(nameLabel);
			namepanel.add(name);
			
			surnamepanel.add(surnameLabel);
			surnamepanel.add(surname);
			
			phonepanel.add(phoneLabel);
			phonepanel.add(phone);
			
			emailpanel.add(emailLabel);
			emailpanel.add(email);
			
			addresspanel.add(addressLabel);
			addresspanel.add(address);
			
			//Add RadioButton to the group so that only one can be selected.
			bg.add(male);
			bg.add(female);

			genderpanel.add(genderLabel);
			genderpanel.add(male);
			genderpanel.add(female);

			
			designationpanel.add(Senior_Doctor);
			designationpanel.add(Junior_Doctor);
			designationpanel.add(Receptionist);
			designationpanel.add(Nurse);
			
			centerpanel.add(namepanel);
			centerpanel.add(surnamepanel);
			centerpanel.add(addresspanel);
			centerpanel.add(genderpanel);
			centerpanel.add(designationpanel);
			centerpanel.add(specializationpanel);
			
			specializationpanel.add(specializationLabel);
			specializationpanel.add(specialization);

			centerpanel.setLayout(new BoxLayout(centerpanel,BoxLayout.PAGE_AXIS));
			add(centerpanel,BorderLayout.CENTER);

			//Adding Listener
			submit.addActionListener(this);
			cancel.addActionListener(this);
		}
		
/**This method is used to catch the action performed using buttons.
*@param a This is the first paramter to store the action event
* @return Nothing
**/
		//Performing Action
		public void actionPerformed(ActionEvent a)
		{
			String caption = a.getActionCommand();
			
			if(caption.equals("Submit"))
			{	
				String tname=name.getText();
				String tsurname=surname.getText();
				String radiotext;
				if(male.isSelected())
					radiotext=male.getText();
				if(female.isSelected())
					radiotext=female.getText();

				Iresult.setText(tname+"Your Data Has been Saved!");
			}
			if(caption.equals("Cancel"))
			{
				name.setText("");
				surname.setText("");
				email.setText("");
				phone.setText("");
				address.setText("");
				
			}
		}//End of ActionPerformed.
		
/**This main method created an object of type Doctor register and sets parameters for it.
* @param args Unused.
* @return Nothing.
* @exception IOException On input error.
* @see IOException
**/		
		public static void main(String args[])
		{
			Doctor register = new Doctor();
			register.setSize(700,700);
			register.setTitle("Doctor Registration Form");
			register.setVisible(true);
			register.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}//End of main
		
}//End Of the Class Doctor.