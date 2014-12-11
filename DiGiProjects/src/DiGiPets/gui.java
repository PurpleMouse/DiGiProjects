package DiGiPets;

import java.awt.*;

import javax.swing.*;

public class gui extends JFrame{
	private Container conts;
	private BorderLayout bl;
	private JPanel top,mid,bot;
	private JButton startBtn,loadBtn, quitBtn;
	public gui(String n){//yeh dis default kinda
		super("DIGI pets - "+n);
		conts = getContentPane();
		bl = new BorderLayout();
		top = new JPanel();
		mid = new JPanel();
		bot = new JPanel();
		startBtn = new JButton("Start");//text for clarity, take out later
		loadBtn = new JButton("Load");
		quitBtn = new JButton("Quit");
		setSize(800,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	 }
	public void initmen(){
		 //start menu gui
		mid.setLayout(null);
		conts.add(top, bl.NORTH);
		conts.add(mid, bl.CENTER);
		conts.add(bot, bl.SOUTH);
		startBtn.setBounds(230, 200, 350, 70);
		loadBtn.setBounds(230, 300, 350, 70);
		quitBtn.setBounds(230, 400, 350, 70);
		mid.add(startBtn);
		mid.add(loadBtn);
		mid.add(quitBtn);
	 }
	 public void intistart(){
		 //start game gui
	 }
	 public void intiload(){
		 //start load gui
	 }
}
