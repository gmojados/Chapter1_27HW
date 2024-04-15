package HW1_27;

public class TVShow {
    public String name;
    public int episodes;

    public static double season;
    public final static int SPECIAL_EP = 400;
    public static int count;
    public int showID;

    public TVShow(String name, int episodes){
        this.name = name;
        this.episodes = episodes;
        System.out.println("");
        showID = count;
        count++;
    }

    public void showName (){
        System.out.println("TV show name is: "+ name + " Season: "+season + "\n" + "ID Number" + showID);
    }

}
