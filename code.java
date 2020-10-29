import javax.swing.*;
class mainpage{
	public void display()
	{
		JFrame frame = new JFrame("FILL DETAILS");
		JLabel lblName, lblEmail, lblId, lblContact, lblTime, lblHostName, lblHostEmail, lblHost, lblIdType, lblVenue, lblStayingPlace, lblDays; 
		JTextField txtName, txtEmail, txtId, txtContact, txtHostName, txtHostEmail, txtDays;
		JComboBox txtIdType, txtStayingPlace;

		//**************************************************************************************************************
		// USER DETAILS
			lblName = 	new JLabel("Name: ");
			lblEmail = 	new JLabel("Email: ");
			lblIdType = new JLabel("ID Type:");
			lblId = new JLabel("ID: ");
			lblContact = new JLabel("Contact no.: ");
			lblTime = new JLabel("Choose hours of stay: ");		

			txtName = new JTextField(60);
			txtEmail = new JTextField("abc@iiita.ac.in", 60);
			txtId = new JTextField(60);
			txtContact = new JTextField(60);

			String txtIdTypeOptions[] = {"Aadhar card", "PAN card", "Passport"};
			txtIdType = new JComboBox(txtIdTypeOptions);
			txtIdType.setSelectedIndex(0);

			int x=30, y=30, height=30, width=150;
			lblName.setBounds(x,y,width,height);				txtName.setBounds(x+160,y,width+100,height);
			lblEmail.setBounds(x,y+40,width,height);			txtEmail.setBounds(x+160,y+40,width+100,height);
			lblIdType.setBounds(x,y+80,width,height);			txtIdType.setBounds(x+160,y+80,width+100,height);
			lblId.setBounds(x,y+120,width,height);				txtId.setBounds(x+160,y+120,width+100,height);
			lblContact.setBounds(x,y+160,width,height);			txtContact.setBounds(x+160,y+160,width+100,height);
			
			frame.add(lblName);		frame.add(txtName);
			frame.add(lblEmail);		frame.add(txtEmail);
			frame.add(lblIdType);		frame.add(txtIdType);	
			frame.add(lblId);		frame.add(txtId);
			frame.add(lblContact);		frame.add(txtContact);
		//**************************************************************************************************************
		
		//**************************************************************************************************************
		// HOST DETAILS
			lblHost = new JLabel("Host Details");
			lblHostName = new JLabel("Host Name: ");
			lblHostEmail = new JLabel("Host Email: ");

			txtHostName = new JTextField(60);
			txtHostEmail = new JTextField(60);
			
			lblHost.setBounds(x, y+210, width, height);
			lblHostName.setBounds(x,y+240,width,height);		txtHostName.setBounds(x+160,y+240,width+100,height);
			lblHostEmail.setBounds(x,y+280,width,height);		txtHostEmail.setBounds(x+160,y+280,width+100,height);
			
			frame.add(lblHost);
			frame.add(lblHostName);		frame.add(txtHostName);
			frame.add(lblHostEmail);	frame.add(txtHostEmail);
		//**************************************************************************************************************
		
		//**************************************************************************************************************
		// VENUE DETAILS
			lblVenue = new JLabel("Venue Details");
			lblStayingPlace = new JLabel("Staying Place: ");
			lblDays = new JLabel("For How Many Days?");

			String txtAllPlaces[] = {"BH-1,2", "BH-3,4", "BH-5", "GH-1,2,3"};
			txtStayingPlace = new JComboBox(txtAllPlaces);
			txtStayingPlace.setSelectedIndex(2);
			txtDays = new JTextField(60);

			lblVenue.setBounds(x, y+330, width, height);
			lblStayingPlace.setBounds(x, y+360, width, height);		txtStayingPlace.setBounds(x+160, y+360, width+100, height);
			lblDays.setBounds(x, y+400, width, height);			txtDays.setBounds(x+160, y+400, width+100, height);

			frame.add(lblVenue);
			frame.add(lblStayingPlace);		frame.add(txtStayingPlace);
			frame.add(lblDays);			frame.add(txtDays);
		//**************************************************************************************************************	

		Webcam buildin = Webcam.getWebcams().get(0);
		frame.setSize(400,500);//400 width and 500 height  
		frame.setLayout(null);//using no layout managers  
		frame.setVisible(true);//making the frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class code{
	public static void main(String []args){
		mainpage obj = new mainpage();
		obj.display();
	}
}