import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Discussion_room_7 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Discussion_room_7 window = new Discussion_room_7();
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
	public Discussion_room_7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 390);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("4F");
		tglbtnNewToggleButton.setBounds(38, 10, 71, 56);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("5F");
		tglbtnNewToggleButton_1.setBounds(132, 10, 71, 56);
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("6F");
		tglbtnNewToggleButton_2.setBounds(227, 10, 71, 56);
		frame.getContentPane().add(tglbtnNewToggleButton_2);
		
		JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("7F");
		tglbtnNewToggleButton_3.setBounds(324, 10, 71, 56);
		frame.getContentPane().add(tglbtnNewToggleButton_3);
		
		JButton btnNewButton = new JButton("701 \r\n\u4EBA\u6578\u9650\u52361-4\u4EBA");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(63, 104, 127, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("702 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_1.setBounds(214, 104, 127, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("703 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2.setBounds(63, 137, 127, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("704 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2_1.setBounds(214, 137, 127, 23);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("705 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2_2.setBounds(63, 170, 127, 23);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("706 \u4EBA\u6578\u9650\u52361-4\u4EBA");
		btnNewButton_2_3.setBounds(214, 170, 127, 23);
		frame.getContentPane().add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("707 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2_4.setBounds(63, 210, 127, 23);
		frame.getContentPane().add(btnNewButton_2_4);
		
		JButton btnNewButton_2_5 = new JButton("708 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2_5.setBounds(214, 210, 127, 23);
		frame.getContentPane().add(btnNewButton_2_5);
		
		JButton btnNewButton_2_6 = new JButton("709 \u4EBA\u6578\u9650\u52363-6\u4EBA");
		btnNewButton_2_6.setBounds(63, 243, 127, 23);
		frame.getContentPane().add(btnNewButton_2_6);
		
		JButton btnNewButton_2_7 = new JButton("710 \u4EBA\u6578\u9650\u52365-10\u4EBA");
		btnNewButton_2_7.setBounds(214, 243, 143, 26);
		frame.getContentPane().add(btnNewButton_2_7);
	}

}
