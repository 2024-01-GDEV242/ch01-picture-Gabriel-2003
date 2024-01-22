/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Jose Gabriel Torres
 * @version 2024.01.22
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    private Circle sun3;
    private Person me;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        sun2 = new Circle();
        sun3 = new Circle();
        me = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            
            sun.changeColor("black");
            sun.moveHorizontal(70);
            sun.moveVertical(-50);
            sun.changeSize(80);
            sun.makeVisible();
            
            sun2.changeColor("black");
            sun2.moveHorizontal(-90);
            sun2.moveVertical(-50);
            sun2.changeSize(80);
            sun2.makeVisible();
            
            sun3.changeColor("black");
            sun3.moveHorizontal(-40);
            sun3.moveVertical(-10);
            sun3.changeSize(140);
            sun3.makeVisible();
            
            roof.changeColor("red");
            roof.changeSize(90,200);
            roof.moveHorizontal(50);
            roof.moveVertical(60);
            roof.makeVisible();
            
            wall.changeColor("white");
            wall.moveHorizontal(-90);
            wall.moveVertical(130);
            wall.changeSize(20);
            wall.makeVisible();
            
            window.changeColor("white");
            window.moveHorizontal(-30);
            window.moveVertical(130);
            window.changeSize(20);
            window.makeVisible();
    
            me.changeColor("yellow");
            me.makeVisible();
            me.moveHorizontal(-20);
            me.moveVertical(80);
            
            

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sun2.changeColor("black");
        sun3.changeColor("black");
        wall.changeColor("white");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("red");
        sun.changeColor("black");
        sun2.changeColor("black");
        sun3.changeColor("black");
    }
}
