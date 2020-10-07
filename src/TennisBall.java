public class TennisBall extends Ball{

    public TennisBall(int size, String name) {
        super(size, name);
    }

    @Override
    public String getExtraInfo() {
        return "I am a " + this.getClass().getName();
    }
}
