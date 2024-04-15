package HW1_27;


public class Player extends Game {
    public String name;
    public int size;
    public void move() {
        System.out.println("Moving around");
    }
    @Override
    public void stop(){
        System.out.println("Stop moving");
    }

    public Player(String name, int size) {
        this.name = name;
        this.size=size;
    }
    @Override
    public void crash() {
        super.crash();
    }
    public void update () {
        System.out.println("System Update");
    }
}
