package music;

public class Instrument {
    public String name;
    public final static int ID = 12;
    private String type;
    protected String size;
    int height;

    public Instrument(){
        this.name = "Bingo";
        this.type = "Instrument";
        this.size = "Medium";
        this.height = 5;
    }

}
