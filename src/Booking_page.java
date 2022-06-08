import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Booking_page extends JFrame{

	public JFrame frame;
	private Booking_page_1 dReserve;
	private long id;
	private User user = new User();
	private String name;
	

	/**
	 * Create the application.
	 */
	public Booking_page(long id) {
		this.id=id;
		name = user.getUser(id);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(219,219,178));
		frame.getContentPane().setForeground(new Color(219,219,178));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("歡迎 "+id+" "+name);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel.setForeground(new Color(66,66,28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(90, 74, 258, 19);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("\u8A0E\u8AD6\u5BA4\u9810\u7D04");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton.setForeground(new Color(115,121,59));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dReserve = new Booking_page_1(id);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(43, 129, 151, 74);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\u5716\u66F8\u9928\u81EA\u7FD2\u4F4D\u7F6E\u5283\u4F4D");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Study_location_1 study1 = new Study_location_1(id);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_1.setForeground(new Color(115,121,59));
		btnNewButton_1.setBounds(239, 129, 159, 74);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\u767B\u51FA");
		btnNewButton_2.setForeground(new Color(115,121,59));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_in login = new Login_in();
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(344, 17, 85, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
	
	public Booking_page_1 getBookingPage1() {
		return dReserve;
	}

}
