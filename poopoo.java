
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class poopoo {
  public static void main(String[] args) {
    String pooPoo = "poopoo";
    JFrame frame = new JFrame("poopoo");
    String repeat = (String)JOptionPane.showInputDialog(null,"how many times?");
    int times = Integer.parseInt(repeat);
    for (int i = 0; i < times; i++) {
   JOptionPane.showMessageDialog(frame,"poopoo " + i);
    }
  }
}
