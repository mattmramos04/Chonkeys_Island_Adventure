import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyDown extends KeyAdapter
{
    Game panel;

    public KeyDown (Game panel)
    {
        this.panel = panel;
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        panel.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        panel.keyReleased(e);
    }
}
