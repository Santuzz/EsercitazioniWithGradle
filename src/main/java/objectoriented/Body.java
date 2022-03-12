package objectoriented;

/**
 * Implement a Body class representing a two-dimensional body (x, y) capable of moving with a certain speed (vx, vy).
 *
 * The class implements three constructors:
 * Body() - Setting x = y = vy = vy = 0
 * Body(x, y) Setting x, y as specified and vx = vy = 0
 * Body(x, y, vx, vy) Setting x, y, vx, vy as specified
 *
 * The class have also to implement the following methods:
 * getters and setters for x, y, vx, vy
 * progress(t) updating x, y considering a constant movement at velocity vx, vy for t seconds
 * toString() printing x, y, vx, vy
 *
 * @author Nicola Bicocchi
 */

public class Body {
    double x,y,vX,vY;


    // 3 Constructor
    public Body() {
        this.x = 0;
        this.y = 0;
        this.vX = 0;
        this.vY = 0;
    }

    public Body(double x, double y) {
        this.x = x;
        this.y = y;
        this.vX = 0;
        this.vY = 0;
    }

    public Body(double x, double y, double vX, double vY) {
        this.x = x;
        this.y = y;
        this.vX = vX;
        this.vY = vY;
    }

    //Getter e setter of X

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    //Getter e setter of Y

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //Getter e setter of vX

    public double getVX() {
        return vX;
    }

    public void setVX(double vX) {
        this.vX = vX;
    }

    //Getter e setter of vY

    public double getVY() {
        return vY;
    }

    public void setvY(double vY) {
        this.vY = vY;
    }

    public void setSpeed(double vx, double vy){
        vX = vx;
        vY = vy;
    }

    public void progress(double t){
        x += vX * t;
        y += vY * t;
    }

    @Override
    public String toString(){
        return "Body [X: " + x + "; Y: " + y + "], [vX: " + vX + "; vY: " + vY + "]";
    }

}
