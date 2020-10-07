import java.util.Objects;

public abstract class Ball implements Comparable<Ball>{
    private static long nextId;

    private int size;
    private String name;
    private long id = 0;


    public Ball(int size, String name) {
        this.id = Ball.getNextId();
        this.size = size;
        this.name = name;
    }

    @Override
    public int compareTo(Ball o) {

        if(o.getClass().getName()=="FootBall" && this.getClass().getName()=="TennisBall"){
            return -1;
        }
        if(o.getClass().getName()=="TennisBall" && this.getClass().getName()=="FootBall"){
            return 1;
        }
        if(o.getClass().getName()=="TennisBall" && this.getClass().getName()=="TennisBall"){
            if(o.getSize()>this.getSize()){
                return -1;
            }
            if(o.getSize()<this.getSize()){
                return 1;
            }
            //if(o.getSize()==this.getSize()){
            else{
                return 0;
            }
        }
        if(o.getClass().getName()=="FootBall" && this.getClass().getName()=="FootBall"){
            if(o.getSize()>this.getSize()){
                return -1;
            }
            if(o.getSize()<this.getSize()){
                return 1;
            }
            //if(o.getSize()==this.getSize()){
            else{
                return 0;
            }
        }
        else{
            return 1337;
        }
    }

    public static long getNextId() {
        nextId++;
        return nextId;
    }

    public static void setNextId(long nextId) {
        Ball.nextId = nextId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getExtraInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return id ==ball.id;
        //return size == ball.size &&
        //        Objects.equals(name, ball.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,size, name);
    }

    @Override
    public String toString(){
        return "Id=#"+id+" Size="+ size + " Name=" + name + " " + getExtraInfo();
    }
}
