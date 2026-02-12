public class QNo02 {
    public static void main(String[] args) {
        ThreeD threed1=new ThreeD();
        threed1.setX(1);
        threed1.setY(2);
        threed1.setZ(3);
        
        ThreeD threed2=new ThreeD(4,5,6);
        double dist=threed1.distance(threed2);
        System.out.println("Distance is: "+dist);
    }
}
class TwoD{
    protected int x,y;
    TwoD(){
        x=0;
        y=0;
        System.out.println("TwoD default constructor");
    }
    TwoD(int x, int y){
        this.x=x;
        this.y=y;
        System.out.println("TwoD constructor with two arguments");
    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
}
class ThreeD extends TwoD{
    private int z;
    ThreeD(){
        //super();
        z=0;
    }
    ThreeD(int z,int x, int y){
        super(x, y);
        this.z=z;
    }
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public double distance(ThreeD other){
        int dx=this.x-other.x;
        int dy=this.y-other.y;
        int dz=this.z-other.z;

        return Math.sqrt(dx*dx+dy*dy+dz*dz);
    }
}