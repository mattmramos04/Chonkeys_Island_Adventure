import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main (String[] args)
    {
        MFrame frame = new MFrame();

        frame.setSize(700, 700);

//      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//      frame.setLocation((int)(screenSize.getWidth()/2 - frame.getSize().getWidth()/2), (int)(screenSize.getHeight()/2 - frame.getSize().getHeight()/2));

        frame.setResizable(false);
        frame.setTitle("Chonkey's Island Adventure");
        frame.setVisible(true);
//when the app is closed, the code ends
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
