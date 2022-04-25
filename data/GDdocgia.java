package data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import chat.ClientChatter;

import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GDdocgia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GDdocgia frame = new GDdocgia();
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
	public GDdocgia() {
		setTitle("QU\u1EA2N L\u00DD TH\u01AF VI\u1EC6N");
		setIconImage(Toolkit.getDefaultToolkit().getImage(GDdocgia.class.getResource("/image/H.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 10, 735, 368);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Chat", new ImageIcon(GDdocgia.class.getResource("/image/F.png")), panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Chat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientChatter cc = new ClientChatter();
				cc.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.setBounds(467, 98, 190, 65);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(GDdocgia.class.getResource("/image/N.png")));
		lblNewLabel_1.setBounds(120, 69, 204, 160);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("TH\u01AF VI\u1EC6N");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblNewLabel.setBounds(554, 0, 160, 42);
		contentPane.add(lblNewLabel);
	}
}
