package HW1_27;

public class Game implements Info{
    protected String name;
    protected int id;
    private String status;
    public void start(){
        System.out.println("Start Game");
    }

    public void stop(){
        System.out.println("Stop Game");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID  is " + id);
    }
    public void crash (){
        System.out.println("Game has crashed");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    private int calculatePrice(){
        return 7;
    }
}
