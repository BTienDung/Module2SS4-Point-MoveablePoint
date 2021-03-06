package season_4.Poind_MoveablePoint;

public class Point {
    private float x;
    private float y;

    public Point(){}
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }

    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float [] array = {this.x,this.y};
        return array;
    }

    @Override
    public String toString(){
        return "( x = " +this.x
                + "y = " +this.y
                +")";
    }

}
