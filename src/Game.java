import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Game extends javax.swing.JPanel implements ActionListener
{
    //Class variables
    Player player;

    Timer gameTime;

    //constructor
    public Game()
    {
        player = new Player(400, 300, this);

        gameTime = new Timer();
        gameTime.schedule(new TimerTask()
        {
            @Override
            public void run() {
                player.set();
                repaint();
            }
///60 fps is 16.7 milliseconds every frame AKA wait 17 milliseconds between every frame
        },0, 17);
    }

    public void paint(Graphics g)
    {

        super.paint(g);

        Graphics2D p = (Graphics2D) g;

        player.draw(p);
    }





    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyChar() == 'a') player.keyLeft = true;
        if(e.getKeyChar() == 'w') player.keyUp = true;
        if(e.getKeyChar() == 's') player.keyDown = true;
        if(e.getKeyChar() == 'd') player.keyRight = true;
    }

    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyChar() == 'a') player.keyLeft = false;
        if(e.getKeyChar() == 'w') player.keyUp = false;
        if(e.getKeyChar() == 's') player.keyDown = false;
        if(e.getKeyChar() == 'd') player.keyRight = false;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
