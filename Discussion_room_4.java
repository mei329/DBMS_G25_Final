import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Discussion_room_4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Discussion_room_4 window = new Discussion_room_4();
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
	public Discussion_room_4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("4F");
		tglbtnNewToggleButton.setBounds(37, 34, 71, 56);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("5F");
		tglbtnNewToggleButton_1.setBounds(131, 34, 71, 56);
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("6F");
		tglbtnNewToggleButton_2.setBounds(226, 34, 71, 56);
		frame.getContentPane().add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("7F");
		tglbtnNewToggleButton_3.setBounds(323, 34, 71, 56);
		frame.getContentPane().add(tglbtnNewToggleButton_3);
		
		JButton btnNewButton = new JButton("401 \r\n\u4EBA\u6578\u9650\u52361-4\u4EBA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setBounds(75, 128, 127, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("402 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_1.setBounds(226, 128, 127, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("403 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2.setBounds(75, 161, 127, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("404 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(226, 161, 127, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("405 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2_2.setBounds(75, 194, 127, 23);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("406 \u4EBA\u6578\u9650\u52361-4\u4EBA");
		btnNewButton_2_3.setBounds(226, 194, 127, 23);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("407 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2_4.setBounds(75, 230, 127, 23);
		frame.getContentPane().add(btnNewButton_2_4);
		
		JButton btnNewButton_2_5 = new JButton("408 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2_5.setBounds(226, 227, 127, 23);
		frame.getContentPane().add(btnNewButton_2_5);
		
		JButton btnNewButton_2_6 = new JButton("409 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2_6.setBounds(75, 263, 127, 23);
		frame.getContentPane().add(btnNewButton_2_6);
		
		JButton btnNewButton_2_7 = new JButton("410 \u4EBA\u6578\u9650\u52365-10\u4EBA");
		btnNewButton_2_7.setBounds(226, 260, 143, 26);
		frame.getContentPane().add(btnNewButton_2_7);
	}

}
