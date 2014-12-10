package DiGiPets;

import java.awt.*;

import javax.swing.*;

public class gui extends JFrame{
	private Container conts;
	private BorderLayout bl;
	private JPanel top,mid,bot;
	private JButton stb,lb;
	private JButton qtb, pb;
	public gui(String n){//yeh dis default kinda
		super("DIGI pets - "+n);
		conts = getContentPane();
		bl = new BorderLayout();
		top = new JPanel();
		mid = new JPanel();
		bot = new JPanel();
		conts.add(top, bl.NORTH);
		conts.add(mid, bl.CENTER);
		conts.add(bot, bl.SOUTH);
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	 }
	public void initmen(){
		 //start menu gui
	 }
	 public void intistart(){
		 //start game gui
	 }
	 public void intiload(){
		 //start load gui
	 }
}
