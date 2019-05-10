import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GameMenuFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameMenuFrame frame = new GameMenuFrame();
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
	public GameMenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel p1 = new JPanel();
		contentPane.add(p1, BorderLayout.NORTH);
		
		JButton btnbefore = new JButton("← 이전으로");
		btnbefore.setMargin(new Insets(2, 10, 2, 10));
		btnbefore.setPreferredSize(new Dimension(100, 30));
		p1.add(btnbefore);
		
		JPanel p2 = new JPanel();
		contentPane.add(p2, BorderLayout.CENTER);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pn = new JPanel();
		p2.add(pn);
		pn.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		pn.add(panel);
		
		JLabel lblNewLabel = new JLabel("Playground");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		pn.add(panel_1);
		
		JButton btnNewButton = new JButton("복불복게임");
		panel_1.add(btnNewButton);
		btnNewButton.setPreferredSize(new Dimension(110, 200));
		btnNewButton.setMargin(new Insets(5, 20, 5, 20));
		
		JButton btnNewButton_1 = new JButton("테이블대전");
		btnNewButton_1.setMargin(new Insets(5, 20, 5, 20));
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setPreferredSize(new Dimension(110, 200));
		
		JButton btnNewButton_2 = new JButton("모두의행운");
		btnNewButton_2.setMargin(new Insets(5, 20, 5, 20));
		panel_1.add(btnNewButton_2);
		btnNewButton_2.setPreferredSize(new Dimension(110, 200));
		
		JPanel ps = new JPanel();
		contentPane.add(ps, BorderLayout.SOUTH);
		ps.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnchoice = new JButton("선택완료");
		btnchoice.setPreferredSize(new Dimension(640, 40));
		ps.add(btnchoice);
	}

}
