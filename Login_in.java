import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Login_in {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_in window = new Login_in();
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
	public Login_in() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u4F7F\u7528\u8005\u767B\u5165(Login in)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(103, 25, 216, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u4F7F\u7528\u8005\u5E33\u865F\uFF1A");
		lblNewLabel_1.setBounds(125, 86, 98, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(223, 94, 96, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(223, 151, 96, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u4F7F\u7528\u8005\u5BC6\u78BC\uFF1A");
		lblNewLabel_2.setBounds(123, 151, 74, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("\u767B\u5165");
		btnNewButton.setBounds(171, 212, 85, 23);
		frame.getContentPane().add(btnNewButton);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
