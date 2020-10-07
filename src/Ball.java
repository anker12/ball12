import java.util.Objects;

public abstract class Ball implements Comparable<Ball>{
    private int size;
    private String name;

    public Ball(int size, String name) {
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
        return size == ball.size &&
                Objects.equals(name, ball.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name);
    }

    @Override
    public String toString(){
        return "Size="+ size + " Name=" + name + " " + getExtraInfo();
    }
}
