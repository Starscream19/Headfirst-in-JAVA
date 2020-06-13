import javax.swing.*;
import java.awt.*;
public class Panel1 {
	public static void main(String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
}
	void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		JButton button  = new JButton("shock me");
		JButton button1 = new JButton("bliss");
		JButton button2 = new JButton("huh");
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setSize(200,250);
		frame.setVisible(true);
		
		
	}

}
