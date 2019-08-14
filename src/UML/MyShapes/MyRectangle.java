package UML.MyShapes;

/**
 * Class created by Krish
 */

public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int tL1, int tL2, int bR1, int bR2) {
        topLeft = new MyPoint(tL1, tL2);
        bottomRight = new MyPoint(bR1, bR2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft.toString() + ", bottomRight=" + bottomRight.toString();
    }

    public double getPerimeter() {
        MyPoint bottomLeft = new MyPoint(topLeft.getX(), bottomRight.getY());
        MyPoint topRight = new MyPoint(bottomRight.getX(), topLeft.getY());
        return topLeft.distance(topRight) + topRight.distance(bottomRight)
                + bottomRight.distance(bottomLeft) + bottomLeft.distance(topLeft);
    }

    public double getArea() {
        MyPoint bottomLeft = new MyPoint(topLeft.getX(), bottomRight.getY());
        MyPoint topRight = new MyPoint(bottomRight.getX(), topLeft.getY());
        return topLeft.distance(topRight) * topRight.distance(bottomRight);
    }


}
