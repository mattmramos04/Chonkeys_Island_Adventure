import java.awt.*;

public class Player
{
    Game panel;
    int x;
    int y;

    //player height
    int width;
    int height;

    //player speed
    double xspeed;
    double yspeed;

    Rectangle hitBox;

    boolean keyLeft;
    boolean keyRight;
    boolean keyUp;
    boolean keyDown;

    //constructor
    public Player(int x, int y, Game panel)
    {
        this.panel = panel;
        this.x = x;
        this.y = y;

        width = 50;
        height = 100;
        hitBox = new Rectangle(x, y, width, height);
    }

    public void set()
    {
        if(keyLeft && keyRight || !keyLeft && !keyRight) xspeed *= 0.8;
        else if (keyLeft && !keyRight) xspeed = xspeed - 1;
        else if (keyRight && !keyLeft) xspeed = xspeed + 1;

        if (xspeed > 0 && xspeed < 0)
            

        x += xspeed;
        y += yspeed;

        hitBox.x = x;
        hitBox.y = y;
    }

    public void draw(Graphics2D p)
    {
        p.setColor(Color.orange);
        p.fillRect(x, y, width, height);
    }
}
