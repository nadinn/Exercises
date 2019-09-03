package Exercise;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "-----No plot------";
    }
    public String getName(){
        return this.name;
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }
    @Override
    public String plot(){
        return "plot for Jaws";
    }
}
class HarryPotter extends Movie{
    public HarryPotter(){
        super("Harry Potter");
    }
    @Override
    public String plot(){
        return "plot for Harry Potter";
    }
}
class ThePaintedVeil extends Movie{
    public ThePaintedVeil (){
        super("The painted veil");
    }
    @Override
    public String plot(){
        return "plot for The painted veil";
    }
}
class TheRoad extends Movie{
    public TheRoad(){
        super("The road");
    }
    @Override
    public String plot(){
        return "plot for The Road";
    }
}
class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable ");
    }

}

public class MovieTest {
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5)+1;
        System.out.println("Random number generated ----->" + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new HarryPotter();
            case 3:
                return new ThePaintedVeil();
            case 4:
                return new TheRoad();
            case 5:
                return new Forgettable();
        }
        return null;
    }

    public static void main (String args[]){
        for (int i=1; i<10; i++){
            Movie movie = randomMovie();
            System.out.println("movie # " + i+" "+ movie.getName()+" "+ movie.plot());
        }

    }
}
