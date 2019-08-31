package Exercise;

public class PC {
    private Case thecase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case thecase, Monitor theMonitor, Motherboard theMotherboard) {
        this.thecase = thecase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }
    public void powerUp(){
        thecase.powerButton();
        drawLogo();

    }

    private void drawLogo(){
        theMonitor.drawPixelAt(144,54,"blue");
    }
}
