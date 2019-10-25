package CourseExercise;
/**
 * simple program for OOP basics
 */
public class Wall {
    private double width;
    private double height;

    public Wall(){            }

    public Wall(double width, double height){
        if (width<0){
            this.width=0;
        } else if (height<0){
            this.height=0;
        }
        else
        {
            this.width=width;
            this.height=height;
        }
    }
    public void setWidth(double width){
        if (width<0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public void setHeight(double height){
        if (height<0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
     public double getArea(){
        return getHeight()*getWidth();
     }

    public static void main(String[] args) {
        Wall wall = new Wall(5, -1);
        System.out.println("area is: " + wall.getArea());
        wall.setHeight(-1.25);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
        System.out.println("area is: " + wall.getArea());
    }
}
