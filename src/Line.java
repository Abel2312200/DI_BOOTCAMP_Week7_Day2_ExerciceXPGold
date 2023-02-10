public class Line {

    private Point begin;
    private Point end;

    public Line() {
        super();
    }

    public Line(Point begin, Point end) {
        super();
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.getBegin().getX();
    }

    public void setBeginX(int x) {
        Point setPoint = new Point(x, getBeginY());
        this.setBegin(setPoint);
    }

    public int getBeginY() {
        return this.getBegin().getY();
    }

    public void setBeginY(int y) {
        Point setPoint = new Point(getBeginX(),y);
        this.setBegin(setPoint);
    }

    public int[] getBeginXY(){
        int[] arrayBeginXY = new int[2];
        arrayBeginXY[0] = this.getBeginX();
        arrayBeginXY[1] = this.getBeginY();
        return arrayBeginXY;
    }
    public void setBeginXY(int x, int y){
        this.setBeginX(x);
        this.setBeginY(y);
    }

    public int getEndX() {
        return this.getEnd().getX();
    }

    public void setEndX(int x) {
        Point setPoint = new Point(x, getBeginY());
        this.setBegin(setPoint);
    }

    public int getEndY() {
        return this.getEnd().getY();
    }

    public void setEndY(int y) {
        Point setPoint = new Point(getEndX(),y);
        this.setEnd(setPoint);
    }

    public int[] getEndXY(){
        int[] arrayEndXY = new int[2];
        arrayEndXY[0] = this.getEndX();
        arrayEndXY[1] = this.getEndY();
        return arrayEndXY;
    }
    public void setEndXY(int x,int y){
        this.setEndX(x);
        this.setEndY(y);
    }
}
