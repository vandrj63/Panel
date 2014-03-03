import javax.swing.*;
import java.awt.*;
public class PanelExample extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
PaintPanel center;
   public PanelExample() {
      super("PanelExample");
      center=new PaintPanel();
      add(center,BorderLayout.CENTER);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(new Dimension(315,244));
      setVisible(true);
   }
   public static void main(String args[]) {
      new PanelExample();
   }
}
 class PaintPanel extends JPanel{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void paint(Graphics g){
g.setColor(Color.red);
g.fillOval(10,10,50,50);
}//paint
}
