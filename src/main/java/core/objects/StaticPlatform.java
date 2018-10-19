package core.objects;

import processing.core.PApplet;
import processing.core.PVector;

import java.awt.*;
import java.io.Serializable;


public class StaticPlatform implements Collidable, Serializable {

    protected Rectangle rect;
    protected PVector pos;
    protected Color color;

    public StaticPlatform(PVector pos, float w, float h, Color c)
    {
        color = c;
        this.pos = pos;
        rect = new Rectangle((int) pos.x, (int) pos.y, (int) w, (int) h);
    }

    public Rectangle getRect() { return rect; }

    public PVector getPos() { return pos; }

    public void display(PApplet p)
    {
        update();
        p.fill(color.getRGB());
        p.noStroke();
        p.rect(pos.x, pos.y, rect.width, rect.height);
    }

    public void update() {

    }
}
