import java.awt.*;

public class MFrame extends javax.swing.JFrame
{
    public MFrame()
    {
        Game panel = new Game();
        panel.setLocation(0,0);
        panel.setSize(this.getSize());
        panel.setBackground(Color.GRAY);
        panel.setVisible(true);
        this.add(panel);

        addKeyListener(new KeyDown(panel));
    }
}
