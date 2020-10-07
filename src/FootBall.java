public class FootBall extends Ball{

    public FootBall(int size, String name) {
        super(size, name);
    }

    @Override
    public String getExtraInfo() {
        return "I am a " + this.getClass().getName();
    }
}
