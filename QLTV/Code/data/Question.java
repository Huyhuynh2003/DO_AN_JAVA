package data;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Question extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question frame = new Question();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Question() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Question.class.getResource("/image/H.png")));
		setTitle("QU\u1EA2N L\u00DD TH\u01AF VI\u1EC6N");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Question.class.getResource("/image/B.png")));
		lblNewLabel.setBounds(25, 39, 280, 307);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0110\u0102NG NH\u1EACP HO\u1EB6C \u0110\u0102NG K\u00CD");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(318, 21, 356, 51);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("\u0110\u0102NG NH\u1EACP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Question.class.getResource("/image/A.png")));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnNewButton.setBounds(398, 94, 201, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0110\u0102NG K\u00CD");
		btnNewButton_1.setIcon(new ImageIcon(Question.class.getResource("/image/M.png")));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnNewButton_1.setBounds(398, 199, 201, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("THO\u00C1T");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Question.class.getResource("/image/G.png")));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnNewButton_2.setBounds(398, 304, 201, 51);
		contentPane.add(btnNewButton_2);
	}
}
