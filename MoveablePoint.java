package season_4.Poind_MoveablePoint;

import java.security.PublicKey;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(){}
    public MoveablePoint(float xSpeed, float ySpeed, float x, float y){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public void setySpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public float getxSpeed(){
        return this.xSpeed;
    }
    public float getySpeed(){
        return this.ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] array = {this.xSpeed, this.ySpeed};
        return array;
    }

    @Override
    public String toString(){
        return "( x = " +(xSpeed+super.getX())
                +" y = " +(ySpeed + super.getY())
                +")";
    }

}
