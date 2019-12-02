import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
//import java.util.Random;

public class Ticketbooking {
	
static int id=200;
public int ticktrate;
	private JFrame frame;
	private JTextField T1;
	private JTextField T2;
	private JTextField T3;
	private JTextField T4;
	private JTextField T5;
	private JTextField T6;
	private JTextField T7;
	private JTextField T8;
	private JTextField T9;
	private JTextField T10;
	private JTextField T11;
	private JTextField T12;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketbooking window = new Ticketbooking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(SystemColor.text);
		frame.setBounds(100, 100, 888, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(240, 240, 240));
		panel.setBorder(new TitledBorder(null, "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBounds(404, 119, 458, 321);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel L6 = new JLabel("Name");
		L6.setFont(new Font("Tahoma", Font.BOLD, 14));
		L6.setBounds(25, 32, 62, 14);
		panel.add(L6);
		
		T5 = new JTextField();
		T5.setBounds(97, 31, 155, 20);
		panel.add(T5);
		T5.setColumns(10);
		
		JLabel L7 = new JLabel("From");
		L7.setFont(new Font("Tahoma", Font.BOLD, 12));
		L7.setBounds(25, 81, 62, 14);
		panel.add(L7);
		
		T6 = new JTextField();
		T6.setBounds(97, 79, 124, 20);
		panel.add(T6);
		T6.setColumns(10);
		
		JLabel L8 = new JLabel("To");
		L8.setFont(new Font("Tahoma", Font.BOLD, 12));
		L8.setBounds(25, 121, 46, 14);
		panel.add(L8);
		
		T7 = new JTextField();
		T7.setBounds(97, 119, 124, 20);
		panel.add(T7);
		T7.setColumns(10);
		
		JLabel L9 = new JLabel("Date");
		L9.setFont(new Font("Tahoma", Font.BOLD, 12));
		L9.setBounds(25, 159, 46, 14);
		panel.add(L9);
		
		T8 = new JTextField();
		T8.setBounds(97, 157, 124, 20);
		panel.add(T8);
		T8.setColumns(10);
		
		JLabel L10 = new JLabel("Time");
		L10.setFont(new Font("Tahoma", Font.BOLD, 11));
		L10.setBounds(25, 199, 46, 14);
		panel.add(L10);
		
		T9 = new JTextField();
		T9.setBounds(97, 196, 124, 20);
		panel.add(T9);
		T9.setColumns(10);
		
		JLabel L11 = new JLabel("Ticket No");
		L11.setFont(new Font("Tahoma", Font.BOLD, 12));
		L11.setBounds(243, 82, 62, 14);
		panel.add(L11);
		
		T10 = new JTextField();
		T10.setBounds(317, 79, 113, 20);
		panel.add(T10);
		T10.setColumns(10);
		
		JLabel L12 = new JLabel("Price");
		L12.setFont(new Font("Tahoma", Font.BOLD, 12));
		L12.setBounds(243, 125, 46, 14);
		panel.add(L12);
		
		T11 = new JTextField();
		T11.setBounds(317, 119, 113, 20);
		panel.add(T11);
		T11.setColumns(10);
		
		JLabel L13 = new JLabel("Route");
		L13.setFont(new Font("Tahoma", Font.BOLD, 12));
		L13.setBounds(243, 160, 46, 14);
		panel.add(L13);
		
		T12 = new JTextField();
		T12.setBounds(317, 157, 113, 20);
		panel.add(T12);
		T12.setColumns(10);
		JRadioButton Rb1 = new JRadioButton("Standard");
		Rb1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Rb1.setBounds(28, 187, 92, 23);
		frame.getContentPane().add(Rb1);
		
		JRadioButton Rb4 = new JRadioButton("First Class");
		Rb4.setFont(new Font("Tahoma", Font.BOLD, 11));
		Rb4.setBounds(28, 230, 92, 23);
		frame.getContentPane().add(Rb4);
		
		JRadioButton Rb5 = new JRadioButton("AC");
		Rb5.setFont(new Font("Tahoma", Font.BOLD, 11));
		Rb5.setBounds(131, 230, 49, 23);
		frame.getContentPane().add(Rb5);
		
		JRadioButton Rb6 = new JRadioButton("Sleeper");
		Rb6.setFont(new Font("Tahoma", Font.BOLD, 11));
		Rb6.setBounds(182, 230, 75, 23);
		frame.getContentPane().add(Rb6);
		
		ButtonGroup g1=new ButtonGroup();
		g1.add(Rb1);                       //my code
		g1.add(Rb4);
		g1.add(Rb5);
		g1.add(Rb6);
		
		
		
		
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_2.setBounds(258, 274, 84, 20);
		frame.getContentPane().add(comboBox_2);
		
		JButton B10 = new JButton("Confirm");
		B10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String st1=T5.getText();
				String st2=T10.getText();
				String st3=T6.getText();
				String st4=T7.getText();
			String st5=(String)comboBox_2.getSelectedItem();
				String st6=T9.getText();
				String st7=T8.getText();
				//String st8="";
				String ac="";
				String st9=T11.getText();
				
				
				if(Rb5.isSelected())
				{
					ac="AC/Sleeper";
				}
				else
				{
					ac="Non Ac";
				}
					
							
							String[] row={st1,st2,st3,st4,st5,st6,st7,ac,st9};
						DefaultTableModel model1=(DefaultTableModel)table.getModel();
							model1.addRow(row);
			}
		});
		B10.setBounds(163, 258, 89, 23);
		panel.add(B10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(172, 29, 441, 67);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel L1 = new JLabel("Ticket Booking");
		L1.setFont(new Font("Tahoma", Font.BOLD, 20));
		L1.setBounds(140, 11, 257, 45);
		panel_1.add(L1);
		
		JLabel L2 = new JLabel("Name");
		L2.setFont(new Font("Tahoma", Font.BOLD, 16));
		L2.setBounds(28, 129, 75, 14);
		frame.getContentPane().add(L2);
		
		T1 = new JTextField();
		T1.setBounds(96, 128, 153, 20);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 159, 345, 2);
		frame.getContentPane().add(separator);
		
		
		
		
		JRadioButton Rb3 = new JRadioButton("Adult");
		Rb3.setFont(new Font("Tahoma", Font.BOLD, 11));
		Rb3.setBounds(259, 187, 109, 23);
		frame.getContentPane().add(Rb3);
		
		JRadioButton Rb7 = new JRadioButton("Child");
		Rb7.setFont(new Font("Tahoma", Font.BOLD, 11));
		Rb7.setBounds(263, 230, 105, 23);
		frame.getContentPane().add(Rb7);
		
		ButtonGroup g2=new ButtonGroup();
		//g2.add(Rb2);
		g1.add(Rb1); 
		g2.add(Rb3);		//mycode
		g2.add(Rb7);
		
		JRadioButton Rb2 = new JRadioButton(" Single Ticket");
		Rb2.setFont(new Font("Tahoma", Font.BOLD, 11));
		Rb2.setBackground(new Color(240, 240, 240));
		Rb2.setBounds(133, 187, 116, 23);
		frame.getContentPane().add(Rb2);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"kollam", "punalur", "kottayam"}));
		comboBox.setBounds(28, 274, 92, 20);
		frame.getContentPane().add(comboBox);
		
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"kollam", "punalur", "kottayam"}));
		comboBox_1.setBounds(145, 274, 84, 20);
		frame.getContentPane().add(comboBox_1);
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 305, 345, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel L3 = new JLabel("Tax");
		L3.setFont(new Font("Tahoma", Font.BOLD, 13));
		L3.setBounds(43, 326, 60, 20);
		frame.getContentPane().add(L3);
		
		T2 = new JTextField();
		T2.setBounds(108, 326, 130, 20);
		frame.getContentPane().add(T2);
		T2.setColumns(10);
		
		JLabel L4 = new JLabel("Sub Total");
		L4.setFont(new Font("Tahoma", Font.BOLD, 11));
		L4.setBounds(43, 357, 60, 20);
		frame.getContentPane().add(L4);
		
		T3 = new JTextField();
		T3.setBounds(108, 357, 130, 21);
		frame.getContentPane().add(T3);
		T3.setColumns(10);
		
		JLabel L5 = new JLabel("Total");
		L5.setFont(new Font("Tahoma", Font.BOLD, 11));
		L5.setBounds(43, 388, 46, 14);
		frame.getContentPane().add(L5);
		
		T4 = new JTextField();
		T4.setBounds(108, 385, 130, 20);
		frame.getContentPane().add(T4);
		T4.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(10, 413, 345, 8);
		frame.getContentPane().add(separator_2);

		
		
		
		
		
		
		
		
		
		JButton B1 = new JButton("Total");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str=T1.getText();
				T5.setText(str);
				String fr=(String)comboBox.getSelectedItem();
				String to=(String)comboBox_1.getSelectedItem();
				
				String no=(String)comboBox_2.getSelectedItem();
				float no1=Float.parseFloat(no);
				
				//float Taxrate;
				float tax=0;
				
				float stotal=0;
				float total=0;
				float Rt,Tt;
				if(fr.equals("kollam")&&to.equals("kottayam"))
				{
					ticktrate=50;
				}
				else if(fr.equals("kollam")&&to.equals("punalur"))
				{
					ticktrate=100;
				}

				else if(fr.equals("kollam")&&to.equals("kottayam"))
				{

					ticktrate=50;
				}
				else if(fr.equals("kottayam")&&to.equals("punalur"))
				{
					ticktrate=150;
				}
				else if(fr.equals("punalur")&&to.equals("Kollam"))
				{
					ticktrate=100;
				}
				else if(fr.equals("punalur")&&to.equals("kottayam"))
				{
					ticktrate=150;
				}

				else
				{
				if((fr.equals("kollam"))&&(to.equals("kollam")))
				{

				JOptionPane.showMessageDialog(null, "Enter valid Destination",
				"Ticket Details ",JOptionPane.OK_OPTION);

				  }
				else if(fr.equals("kottayam")&&to.equals("kottayam"))

				    {

				JOptionPane.showMessageDialog(null, "Enter valid Destination",
				"Ticket Details ",JOptionPane.OK_OPTION);

				  }
				else
				{
				      if(fr.equals("punalur")&&to.equals("punalur"))
				        {
				        JOptionPane.showMessageDialog(null, "Enter valid Destination",
				"Ticket Details ",JOptionPane.OK_OPTION);

				        }
				}
				}
				
				if(Rb1.isSelected())
				{
					Rt=(float)(ticktrate+(ticktrate*0.2));
					Tt=(float)(Rt*0.3);
					 tax=(float)Tt*no1;
					 
					 stotal=(float)(Rt*no1);
					total=(float)tax+stotal;
					
					
				}
				if(Rb4.isSelected())
				{
					Rt=(float)(ticktrate+(ticktrate*0.4));
					Tt=(float)(Rt*0.5);
					 tax=(float)Tt*no1;
					 
					 stotal=(float)(Rt*no1);
					total=(float)tax+stotal;
					
				}
				if(Rb5.isSelected())
				{
					Rt=(float)(ticktrate+(ticktrate*0.6));
					Tt=(float)(Rt*0.5);
					 tax=(float)Tt*no1;
					 
					 stotal=(float)(Rt*no1);
					total=(float)tax+stotal;
					
				}
				if(Rb6.isSelected())
				{
					Rt=(float)(ticktrate+(ticktrate*0.2));
					Tt=(float)(Rt*0.5);
					 tax=(float)Tt*no1;
					 
					 stotal=(float)(Rt*no1);
					total=(float)tax+stotal;
					
				}
				String s1=String.valueOf(tax);
				String s2=String.valueOf(stotal);
				String s3=String.valueOf(total);
				T2.setText(s1);
				T3.setText(s2);
				T4.setText(s3);
				String s4=(String)comboBox.getSelectedItem();
				T6.setText(s4);
				String s5=(String)comboBox_1.getSelectedItem();
				T7.setText(s5);
				T11.setText(s3);
				T12.setText("Any");
				LocalDate m=java.time.LocalDate.now();
				String q=String.valueOf(m);
				T8.setText(q);
				
				LocalTime m1=java.time.LocalTime.now();
				String q1=String.valueOf(m1);
				T9.setText(q1);
				
				/*Random objGenerator = new Random();
	            for (int iCount = 0; iCount< 10; iCount++){
	             int randomNumber = objGenerator.nextInt(100);
	             String c1=String.valueOf(randomNumber);
					T10.setText(c1);
	              //System.out.println("Random No : " + randomNumber); 
	            }
				/*int c=0;
				c++;
				*/
				 String c1=String.valueOf(id);
					T10.setText(c1);
					id++;
				
				
				
				
			}
		});
		B1.setBackground(Color.WHITE);
		B1.setFont(new Font("Tahoma", Font.BOLD, 11));
		B1.setBounds(31, 432, 89, 23);
		frame.getContentPane().add(B1);
		
		JButton B2 = new JButton("Reset");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				T1.setText(null);
				g1.clearSelection();
				g2.clearSelection();
				
				Rb2.setSelected(false);
				
				T2.setText(null);
				T3.setText(null);
				T4.setText(null);
				T5.setText(null);
				T6.setText(null);
				T7.setText(null);
				T8.setText(null);
				T9.setText(null);
				T10.setText(null);
				T11.setText(null);
				T12.setText(null);
				//T13.setText(null);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				
				
				
			}
		});
		B2.setBackground(Color.WHITE);
		B2.setFont(new Font("Tahoma", Font.BOLD, 11));
		B2.setBounds(140, 432, 89, 23);
		frame.getContentPane().add(B2);
		
		JButton B3 = new JButton("Exit");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
		
		/*JButton B6 = new JButton("Conform");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String st1=T5.getText();
			String st2="";
			String st3=T6.getText();
			String st4=T7.getText();
			String st5="";
			String st6=T8.getText();
			String st7=T9.getText();
			String st8="";
			String st9=T11.getText();
			
			if(Rb5.isSelected())
			{
				String ac="AC/Sleeper";
			}
			else
			{
				String ac="Non Ac";
			}
				
						
						String[] row={st1,st2,st3,st4,st5,st6,st7,st8,st9};
					DefaultTableModel model1=(DefaultTableModel)table.getModel();
						model1.addRow(row);
		}
	});*/
		
		B3.setBackground(Color.WHITE);
		B3.setFont(new Font("Tahoma", Font.BOLD, 11));
		B3.setBounds(250, 432, 89, 23);
		frame.getContentPane().add(B3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBounds(28, 466, 814, 105);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No.Of Seats", "Time", "Date", "AC/Non Ac", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 794, 83);
		panel_2.add(table);
	}
}
