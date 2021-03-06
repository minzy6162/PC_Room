package solmin;
import java.awt.Button;
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

import database.DBTime;
import database.DBsignup;

public class Buy_Time {

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private int i = 0;
	JButton []seat = new JButton[16];
	JLabel [] l_seat = new JLabel[16];
	JButton food = new JButton();

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
		
		
		int j = 90;
		for(int i = 0; i<6; i++) {
			seat[i] = new JButton();
			seat[i].setLayout(null);
			l_seat[i] = new JLabel((i+1) + "번");
			l_seat[i].setBounds(65, -30, 100, 100);
			seat[i].setBounds(new Rectangle(j, 185, 160, 180));//55, 185, 160, 180
			j+= 170;
			seat[i].setBackground(new Color(255, 255, 228, 255));
			l_seat[i].setFont(new Font("굴림", Font.BOLD, 20));
			seat[i].add(l_seat[i]);
			panel.add(seat[i]);
			
			
			seat[i].addActionListener(new ActionListener() {
	            // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                Modal m = new Modal(frame);
	                m.setVisible(true);
	                
	            }
	            
	        });
		}
		
		
		
		int k = 90;
		for(int i = 6; i<12; i++) {
			seat[i] = new JButton();
			seat[i].setLayout(null);
			l_seat[i] = new JLabel((i+1) + "번");
			l_seat[i].setBounds(60, -30, 100, 100);
			seat[i].setBounds(new Rectangle(k, 570, 160, 180));//55, 570, 160, 180
			k+= 170;
			seat[i].setBackground(new Color(255, 255, 228, 255));
			l_seat[i].setFont(new Font("굴림", Font.BOLD, 20));
			seat[i].add(l_seat[i]);
			panel.add(seat[i]);
			
			seat[i].addActionListener(new ActionListener() {
	            // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                Modal m = new Modal(frame);
	                m.setVisible(true);
	            }
	            
	        });
		}
		
		int o = 130;
		for(int i = 12; i<16; i++) {
			seat[i] = new JButton();
			seat[i].setLayout(null);
			l_seat[i] = new JLabel((i+1) + "번");
			l_seat[i].setBounds(60, -30, 100, 100);
			seat[i].setBounds(new Rectangle(1200, o, 160, 180));//1167, 486, 160, 180
			o+= 190;
			seat[i].setBackground(new Color(255, 255, 228, 255));
			l_seat[i].setFont(new Font("굴림", Font.BOLD, 20));
			seat[i].add(l_seat[i]);
			panel.add(seat[i]);
			
			
			seat[i].addActionListener(new ActionListener() {
	            // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                Modal m = new Modal(frame);
	                m.setVisible(true);
	                
	            }
	            
	        });

			
		}
		
		Button food = new Button("음식");
		food.setFont(new Font("굴림", Font.BOLD, 40));
		food.setBounds(0, 0, 228, 73);
		panel.add(food);
		
		
		food.addActionListener(new ActionListener() {
            // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
            @Override
            public void actionPerformed(ActionEvent e) {
                FoodExam m = new FoodExam();
                m.setVisible(true);
                
            }
            
        });
	
		
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource();
			if((JButton)obj == seat[i]) {{
					seat[i].setEnabled(false);
					seat[i].setBackground(Color.GRAY);
				}
			}
		}
		
		
		
	}
	
	

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}


