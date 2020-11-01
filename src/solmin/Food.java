package solmin;

import java.awt.Font;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Food extends JFrame {
	public Food() {
		setTitle("음식");
		Panel p = new Panel();
		JLabel l0 = new JLabel("음식을 골라주세요");
		l0.setHorizontalAlignment(JLabel.CENTER);
		l0.setFont(new Font("HY동녘M", Font.PLAIN, 80));
		l0.setSize(60000, 1000);
		l0.setLocation(0, 200);
		
		
		ImageIcon buger = new ImageIcon("C:\\Users\\최민정\\Desktop\\project_sol\\PC_Room\\img\\buger.jpg");
		Image img1 = buger.getImage();
		Image changebuger = img1.getScaledInstance(300, 300,  Image.SCALE_SMOOTH);
		ImageIcon changeIcon1 = new ImageIcon(changebuger);
		JLabel l1 = new JLabel(changeIcon1);
		l1.setBounds(11644, 145, 127, 134);
		JLabel ll1 = new JLabel("5000원");
		JButton bm1 = new JButton("-");
		JButton bp1 = new JButton("+");
		JButton b1 = new JButton("확인");
		
		ImageIcon donkkaseu = new ImageIcon("C:\\Users\\최민정\\Desktop\\project_sol\\PC_Room\\img\\donkkaseu.jpg");
		Image img2 = donkkaseu.getImage();
		Image changedonkkaseu = img2.getScaledInstance(300, 300,  Image.SCALE_SMOOTH);
		ImageIcon changeIcon2 = new ImageIcon(changedonkkaseu);
		JLabel l2 = new JLabel(changeIcon2);
		JLabel ll2 = new JLabel("음식을 골라주세요");
		JButton bm2 = new JButton("-");
		JButton bp2 = new JButton("+");
		JButton b2 = new JButton("확인");
		
		ImageIcon malatang = new ImageIcon("C:\\Users\\최민정\\Desktop\\project_sol\\PC_Room\\img\\malatang.jpg");
		Image img3 = malatang.getImage();
		Image changemalatang = img3.getScaledInstance(300, 300,  Image.SCALE_SMOOTH);
		ImageIcon changeIcon3 = new ImageIcon(changemalatang);
		JLabel l3 = new JLabel(changeIcon3);
		JLabel ll3 = new JLabel("음식을 골라주세요");
		JButton bm3 = new JButton("-");
		JButton bp3 = new JButton("+");
		JButton b3 = new JButton("확인");
		
		ImageIcon noodle = new ImageIcon("C:\\Users\\최민정\\Desktop\\project_sol\\PC_Room\\img\\noodle.jpg");
		Image img4 = noodle.getImage();
		Image changenoodle = img4.getScaledInstance(300, 300,  Image.SCALE_SMOOTH);
		ImageIcon changeIco4 = new ImageIcon(changenoodle);
		JLabel l4 = new JLabel(changeIco4);
		JLabel ll4 = new JLabel("음식을 골라주세요");
		JButton bm4 = new JButton("-");
		JButton bp4 = new JButton("+");
		JButton b4 = new JButton("확인");
		
		ImageIcon pizza = new ImageIcon("C:\\Users\\최민정\\Desktop\\project_sol\\PC_Room\\img\\pizza.jpg");
		Image img5 = pizza.getImage();
		Image changepizza = img5.getScaledInstance(300, 300,  Image.SCALE_SMOOTH);
		ImageIcon changeIcon5 = new ImageIcon(changepizza);
		JLabel l5 = new JLabel(changeIcon5);
		JLabel ll5 = new JLabel("8000원");
		JButton bm5 = new JButton("-");
		JButton bp5 = new JButton("+");
		JButton b5 = new JButton("확인");
		
		p.add(l0);
		
		p.add(l1);
		p.add(bm1);
		p.add(bp1);
		p.add(b1);

		p.add(l2);
		p.add(bm2);
		p.add(bp2);
		p.add(b2);

		p.add(l3);
		p.add(bm3);
		p.add(bp3);
		p.add(b3);
		
		p.add(l4);
		p.add(bm4);
		p.add(bp4);
		p.add(b4);
		
		p.add(l5);
		p.add(bm5);
		p.add(bp5);
		p.add(b5);
		
		add(p);
		setSize(1300, 800);
		setVisible(true);
	}
	public static void name(String args[]) {
		new Food();
	}
}
