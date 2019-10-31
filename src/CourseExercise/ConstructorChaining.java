package CourseExercise;

public class ConstructorChaining {
    private int x;
    private int y;
    private int width;
    private int height;
/**
    public ConstructorChaining(){
        this.x=0;
        this.y=0;
        this.width=0;
        this.height=0;
    }
 **/
    // calls second constructor
    public ConstructorChaining(){
        this(0,0);
    }

/**
    public ConstructorChaining(int width, int height){
        this.x=0;
        this.y=0;
        this.width=width;
        this.height=height;

    }
 **/
    // calls third constructor
    public ConstructorChaining(int width, int height){
        this(0,0, width,height);
    }

    // initialises variables, does all the work
    public ConstructorChaining(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class SuperConstructorShape{
    private int x;
    private int y;

    public SuperConstructorShape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Rectangle extends SuperConstructorShape{
    private int width;
    private int height;

    public Rectangle(int x, int y){
        this(x,y,0,0); // calls other constructor

    }



    public Rectangle(int x, int y, int width, int height){
        super(x,y);  // calls constructor from parent
        this.width=width;
        this.height=height;
    }

}
