package solmin;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;

public class SingnIn_Up {

	private JFrame frame;
	private JTextField T_Id;
	private JTextField T_Password;
	private JTextField T_NCardnumber;
	private JTextField T_SId;
	private JPasswordField PF_SPassword;
	private JTextField T_SNmae;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingnIn_Up window = new SingnIn_Up();
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
	public SingnIn_Up() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("∏ﬁ¿Œ»≠∏È");
		frame.setBounds(100, 100, 1400, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);//√¢ ∞°øÓµ• ¡§∑ƒ
		frame.setResizable(false);//√¢ ≈©±‚ ∞Ì¡§
		
		
		
		
		
		//==================================================        
		
		
		
		final JPanel Psignup = new JPanel();//»∏ø¯∞°¿‘ »≠∏È
		Psignup.setBackground(new Color(128,0,128));
		Psignup.setBounds(0, 0, 1395, 965);
		frame.getContentPane().add(Psignup);
		Psignup.setLayout(null);
		
		JLabel L_Sinup = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		L_Sinup.setForeground(Color.WHITE);
		L_Sinup.setFont(new Font("HYµø≥ËM", Font.PLAIN, 50));
		L_Sinup.setBounds(552, 195, 213, 98);
		Psignup.add(L_Sinup);
		
		JLabel L_SName = new JLabel("\uC774\uB984 : ");
		L_SName.setForeground(Color.WHITE);
		L_SName.setFont(new Font("±º∏≤", Font.BOLD, 30));
		L_SName.setBounds(512, 382, 132, 45);
		Psignup.add(L_SName);
		
		T_SNmae = new JTextField();
		T_SNmae.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		T_SNmae.setColumns(10);
		T_SNmae.setBounds(636, 382, 216, 41);
		Psignup.add(T_SNmae);
		
		JLabel L_SId = new JLabel("\uC544\uC774\uB514 : ");
		L_SId.setForeground(Color.WHITE);
		L_SId.setFont(new Font("±º∏≤", Font.BOLD, 30));
		L_SId.setBounds(512, 471, 132, 45);
		Psignup.add(L_SId);
		
		T_SId = new JTextField();
		T_SId.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		T_SId.setColumns(10);
		T_SId.setBounds(658, 471, 216, 41);
		Psignup.add(T_SId);
		
		JLabel L_SPassword = new JLabel("\uBE44\uBC00\uBC88\uD638 : ");
		L_SPassword.setForeground(Color.WHITE);
		L_SPassword.setFont(new Font("±º∏≤", Font.BOLD, 30));
		L_SPassword.setBounds(512, 557, 170, 45);
		Psignup.add(L_SPassword);
		
		PF_SPassword = new JPasswordField();
		PF_SPassword.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		PF_SPassword.setColumns(10);
		PF_SPassword.setBounds(684, 559, 216, 41);
		Psignup.add(PF_SPassword);
		
		JButton B_signup = new JButton("\uD68C\uC6D0\uAC00\uC785");
		B_signup.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		B_signup.setBounds(609, 765, 132, 27);
		Psignup.add(B_signup);
		
		JButton B_SBack = new JButton("\u2190");
		B_SBack.setFont(new Font("±º∏≤", Font.BOLD, 50));
		B_SBack.setBounds(14, 908, 90, 45);
		Psignup.add(B_SBack);
		
		JButton bnt_DoubleCheck = new JButton("\uC911\uBCF5\uD655\uC778");
		bnt_DoubleCheck.setBounds(894, 471, 90, 41);
		Psignup.add(bnt_DoubleCheck);
		Psignup.setVisible(false);
		

		

		
		//==================================================
		
		
		
		final JPanel Pmember = new JPanel();//»∏ø¯ »≠∏È
		Pmember.setBackground(new Color(128,0,128));
		Pmember.setBounds(0, 0, 1395, 965);
		frame.getContentPane().add(Pmember);
		Pmember.setLayout(null);
		
		JLabel L_Login = new JLabel("\uD68C\uC6D0 LogIn");
		L_Login.setForeground(Color.WHITE);
		L_Login.setBounds(601, 153, 264, 98);
		L_Login.setFont(new Font("HYµø≥ËM", Font.PLAIN, 50));
		Pmember.add(L_Login);
		
		JLabel L_Id = new JLabel("\uC544\uC774\uB514 : ");
		L_Id.setForeground(Color.WHITE);
		L_Id.setBounds(527, 394, 132, 45);
		L_Id.setFont(new Font("±º∏≤", Font.BOLD, 30));
		Pmember.add(L_Id);
		
		T_Id = new JTextField();
		T_Id.setBounds(673, 394, 216, 41);
		T_Id.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		Pmember.add(T_Id);
		T_Id.setColumns(10);
		
		JLabel L_Password = new JLabel("\uBE44\uBC00\uBC88\uD638 : ");
		L_Password.setForeground(Color.WHITE);
		L_Password.setBounds(527, 472, 170, 45);
		L_Password.setFont(new Font("±º∏≤", Font.BOLD, 30));
		Pmember.add(L_Password);
		
		T_Password = new JPasswordField();
		T_Password.setBounds(700, 474, 216, 41);
		T_Password.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		T_Password.setColumns(10);
		Pmember.add(T_Password);
		
		JButton B_Login = new JButton("\uB85C\uADF8\uC778");
		B_Login.setBounds(673, 793, 105, 27);
		B_Login.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		Pmember.add(B_Login);
		
		JButton B_Back = new JButton("\u2190");
		B_Back.setFont(new Font("±º∏≤", Font.BOLD, 50));
		B_Back.setBounds(14, 908, 90, 45);
		Pmember.add(B_Back);
		
		
		
		Pmember.setVisible(false);
		
		
		
		
		//==================================================
		
		
		
		final JPanel PNmember = new JPanel();//∫Ò»∏ø¯ »≠∏È
		PNmember.setBackground(new Color(128,0,128));
		PNmember.setBounds(0, 0, 1395, 965);
		frame.getContentPane().add(PNmember);
		PNmember.setLayout(null);
		
		JLabel L_NLing = new JLabel("\uBE44\uD68C\uC6D0 LogIn");
		L_NLing.setForeground(Color.WHITE);
		L_NLing.setFont(new Font("HYµø≥ËM", Font.PLAIN, 50));
		L_NLing.setBounds(557, 221, 318, 98);
		PNmember.add(L_NLing);
		
		JLabel L_NCardnumber = new JLabel("\uCE74\uB4DC\uBC88\uD638 : ");
		L_NCardnumber.setForeground(Color.WHITE);
		L_NCardnumber.setBounds(519, 446, 170, 45);
		PNmember.add(L_NCardnumber);
		L_NCardnumber.setFont(new Font("±º∏≤", Font.BOLD, 30));
		
		T_NCardnumber = new JTextField();
		T_NCardnumber.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		T_NCardnumber.setColumns(10);
		T_NCardnumber.setBounds(702, 449, 216, 41);
		PNmember.add(T_NCardnumber);
		
		JButton B_NLogin = new JButton("\uB85C\uADF8\uC778");
		B_NLogin.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		B_NLogin.setBounds(654, 675, 105, 27);
		PNmember.add(B_NLogin);
		
		JButton B_NBack = new JButton("\u2190");
		B_NBack.setFont(new Font("±º∏≤", Font.BOLD, 50));
		B_NBack.setBounds(14, 908, 90, 45);
		PNmember.add(B_NBack);
		PNmember.setVisible(false);
		
		
		
		
		
		//==================================================  
		
		
		
		
		
		final JPanel Pmain = new JPanel();//√π»≠∏È
		Pmain.setBackground(new Color(128,0,128));
		Pmain.setBounds(0, 0, 1395, 965);
		frame.getContentPane().add(Pmain);
		Pmain.setLayout(null);
		
		JLabel L_PCroom = new JLabel("PC\uBC29");
		L_PCroom.setForeground(Color.WHITE);
		L_PCroom.setBounds(644, 145, 127, 134);
		Pmain.add(L_PCroom);
		L_PCroom.setFont(new Font("HYµø≥ËM", Font.PLAIN, 50));
		
		JButton B_member = new JButton("\uD68C\uC6D0");//∫Ò»∏ø¯
		B_member.setBounds(456, 508, 189, 73);
		Pmain.add(B_member);
		B_member.setFont(new Font("±º∏≤", Font.BOLD, 40));
		
		JButton B_Nmember = new JButton("\uBE44\uD68C\uC6D0");//»∏ø¯
		B_Nmember.setBounds(736, 508, 181, 73);
		Pmain.add(B_Nmember);
		B_Nmember.setFont(new Font("±º∏≤", Font.BOLD, 40));
		
		JButton B_SignUp = new JButton("\uD68C\uC6D0\uAC00\uC785");//»∏ø¯∞°¿‘
		B_SignUp.setFont(new Font("±º∏≤", Font.BOLD, 40));
		B_SignUp.setBounds(595, 704, 228, 73);
		Pmain.add(B_SignUp);
		
		
		
		
		//==================================================  

		
		
		
		B_member.addActionListener(new ActionListener() {//∏ﬁ¿Œ => »∏ø¯
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Pmember.setVisible(true);
				Pmain.setVisible(false);
			}
		});
		
		B_Back.addActionListener(new ActionListener() {//»∏ø¯ => ∏ﬁ¿Œ
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Pmain.setVisible(true);
				Pmember.setVisible(false);
			}
		});
		
		
		B_Nmember.addActionListener(new ActionListener() {//∏ﬁ¿Œ => ∫Ò»∏ø¯
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				PNmember.setVisible(true);
				Pmain.setVisible(false);
			}
		});
		
		B_NBack.addActionListener(new ActionListener() {//∫Ò»∏ø¯ => ∏ﬁ¿Œ
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Pmain.setVisible(true);
				PNmember.setVisible(false);
			}
		});
			

		
		B_SignUp.addActionListener(new ActionListener() {//∏ﬁ¿Œ => »∏ø¯∞°¿‘
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Psignup.setVisible(true);
				Pmain.setVisible(false);
			}
		});
		
		B_SBack.addActionListener(new ActionListener() {//»∏ø¯∞°¿‘ => ∏ﬁ¿Œ
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Pmain.setVisible(true);
				Psignup.setVisible(false);
			}
		});
		
		
		
	}
}
