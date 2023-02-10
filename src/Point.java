public class Point {
    private int x;
    private int y;

    public Point() {
        super();
    }

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] arrayXY = new int[2];
        arrayXY[0] = this.getX();
        arrayXY[1] = this.getY();
        return arrayXY;
    }
    public void setXY(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public double distance(int x, int y){
        double distance = 0.0;
        distance = Math.sqrt(Math.pow((this.getX() - x),2)+ Math.pow((this.getY() - y),2));
        return distance;
    }

    public double distance(Point point){
        double distance = 0.0;
        distance = this.distance(point.getX(), point.getY());
        return distance;
    }

    public double distance(){
        double distance = 0.0;
        distance = this.distance(0,0);
        return distance;
    }
    @Override
    public String toString() {
        return "Line{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
