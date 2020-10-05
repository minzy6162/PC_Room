package solmin;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import database.DBsignup;

public class Buy_Time {

	private JFrame frame;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buy_Time window = new Buy_Time();
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
	public Buy_Time() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("좌석");
		frame.setBounds(100, 100, 1600, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);//창 가운데 정렬
		frame.setResizable(false);//창 크기 고정
		panel.setBounds(0, 0, 1600, 1000);
		panel.setBackground(new Color(128,0,128));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
//		int j = 90;
//		for(int i = 1; i<6; i++) {
//			seat[i] = new JPanel();
//			seat[i].setLayout(null);
//			l_seat[i] = new JLabel((i+1) + "번");
//			l_seat[i].setBounds(65, -30, 100, 100);
//			seat[i].setBounds(new Rectangle(j, 130, 160, 180));
//			j+= 170;
//			seat[i].setBackground(new Color(255, 255, 228, 255));
//			l_seat[i].setFont(new Font("굴림", Font.BOLD, 20));
//			seat[i].add(l_seat[i]);
//			left.add(seat[i]);
//		}
//		
//		int k = 90;
//		for(int i = 6; i<12; i++) {
//			seat[i] = new JPanel();
//			seat[i].setLayout(null);
//			l_seat[i] = new JLabel((i+1) + "번");
//			l_seat[i].setBounds(60, -30, 100, 100);
//			seat[i].setBounds(new Rectangle(j, 130, 160, 180));
//			k+= 170;
//			seat[i].setBackground(new Color(255, 255, 228, 255));
//			l_seat[i].setFont(new Font("굴림", Font.BOLD, 20));
//			seat[i].add(l_seat[i]);
//			left.add(seat[i]);
//		}


		
			
//		for(int i = 1; i <= 6; i++) {
//				JButton b2 = new JButton(Integer.toString(i));
//				b2.setVerticalAlignment(SwingConstants.TOP);
//				b2.setLocation(i*175, 570);
//				b2.setSize(160, 180);
//				panel.add(b2);
//		}
		
		
		
		JButton bnt1 = new JButton("1번");
		bnt1.setVerticalAlignment(SwingConstants.TOP);
		bnt1.setBounds(55, 185, 160, 180);
		panel.add(bnt1);
		
		bnt1.addActionListener(new ActionListener() {
            // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
            @Override
            public void actionPerformed(ActionEvent e) {
                Modal m = new Modal(frame);
                m.setVisible(true);
            }
            
        });
		
		
		JButton bnt2 = new JButton("2\uBC88");
		bnt2.setVerticalAlignment(SwingConstants.TOP);
		bnt2.setBounds(230, 185, 160, 180);
		panel.add(bnt2);
		
		JButton bnt3 = new JButton("3\uBC88");
		bnt3.setVerticalAlignment(SwingConstants.TOP);
		bnt3.setBounds(405, 185, 160, 180);
		panel.add(bnt3);
		
		JButton bnt4 = new JButton("4\uBC88");
		bnt4.setVerticalAlignment(SwingConstants.TOP);
		bnt4.setBounds(580, 185, 160, 180);
		panel.add(bnt4);
		
		JButton bnt5 = new JButton("5\uBC88");
		bnt5.setVerticalAlignment(SwingConstants.TOP);
		bnt5.setBounds(755, 185, 160, 180);
		panel.add(bnt5);
		
		JButton bnt6 = new JButton("6\uBC88");
		bnt6.setVerticalAlignment(SwingConstants.TOP);
		bnt6.setBounds(930, 185, 160, 180);
		panel.add(bnt6);
		
		
		
		JButton bnt7 = new JButton("7\uBC88");
		bnt7.setVerticalAlignment(SwingConstants.TOP);
		bnt7.setBounds(55, 570, 160, 180);
		panel.add(bnt7);
		
		JButton bnt8 = new JButton("8\uBC88");
		bnt8.setVerticalAlignment(SwingConstants.TOP);
		bnt8.setBounds(230, 570, 160, 180);
		panel.add(bnt8);
		
		JButton bny9 = new JButton("9\uBC88");
		bny9.setVerticalAlignment(SwingConstants.TOP);
		bny9.setBounds(405, 570, 160, 180);
		panel.add(bny9);
		
		JButton bnt10 = new JButton("10\uBC88");
		bnt10.setVerticalAlignment(SwingConstants.TOP);
		bnt10.setBounds(580, 570, 160, 180);
		panel.add(bnt10);
		
		JButton bnt11 = new JButton("11\uBC88");
		bnt11.setVerticalAlignment(SwingConstants.TOP);
		bnt11.setBounds(755, 570, 160, 180);
		panel.add(bnt11);
		
		JButton bnt12 = new JButton("12\uBC88");
		bnt12.setVerticalAlignment(SwingConstants.TOP);
		bnt12.setBounds(930, 570, 160, 180);
		panel.add(bnt12);

		JButton bnt13 = new JButton("13\uBC88");
		bnt13.setVerticalAlignment(SwingConstants.TOP);
		bnt13.setBounds(1167, 102, 160, 180);
		panel.add(bnt13);
		
		JButton bnt14 = new JButton("14\uBC88");
		bnt14.setVerticalAlignment(SwingConstants.TOP);
		bnt14.setBounds(1167, 294, 160, 180);
		panel.add(bnt14);
		
		JButton bnt15 = new JButton("15\uBC88");
		bnt15.setVerticalAlignment(SwingConstants.TOP);
		bnt15.setBounds(1167, 486, 160, 180);
		panel.add(bnt15);
		
		JButton bnt16 = new JButton("16\uBC88");
		bnt16.setVerticalAlignment(SwingConstants.TOP);
		bnt16.setBounds(1167, 678, 160, 180);
		panel.add(bnt16);
		
		JButton food = new JButton("\uC74C\uC2DD");
		food.setFont(new Font("굵은안상수체", Font.PLAIN, 34));
		food.setBounds(1359, 254, 210, 361);
		panel.add(food);
		
		food.addActionListener(new ActionListener() {
            // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
            @Override
            public void actionPerformed(ActionEvent e) {
            	Food m = new Food();
                m.setVisible(true);
            }
            
        });
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1600, 1000);
		frame.getContentPane().add(panel_1);
		
		
		
		
	}
}


