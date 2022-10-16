public class MyTurtle extends BaseTurtle {

    public void draw() {

        // ----------- casa ---------------

        this.back(4); // back up 4 units to put the triangle at the center of the base
        this.forward(8); // draw first side (using default one-pixel-wide red line)
        this.turn(90); // rotate 120 degrees
        pen.setColor(0, 0, 1); // the next side will be blue.
        this.forward(4); // draw the second side
        this.turn(45);
        pen.setColor(0, 1, 0); // the last side will be green.
        this.forward(8); // draw the third side
        this.turn(90);
        pen.setColor(0, 1, 0); // the last side will be green.
        this.forward(8); // draw the third side
        this.turn(45);
        pen.setColor(0, 0, 1);
        this.forward(4);
        this.turn(90);
        this.forward(4);

        this.pause(2); // pause for two seconds
        this.reset(); // return to initial state

        // ------------ JC -----------------
        this.back(4);
        this.forward(4);
        this.turn(90);
        this.forward(8);
        this.turn(-90);
        this.forward(2);
        this.turn(90);
        this.forward(2);
        this.turn(90);
        this.forward(6);
        this.turn(90);
        this.forward(2);
        this.turn(90);
        this.forward(2);
        this.turn(-90);
        this.forward(6);
        this.turn(-90);
        this.forward(2);
        this.turn(-90);
        this.forward(1);
        this.turn(90);
        this.forward(2);
        this.turn(90);
        this.forward(3);
        this.turn(90);
        this.forward(2);

        this.pause(2); // pause for two seconds
        this.reset(); // return to initial state

    }
}
