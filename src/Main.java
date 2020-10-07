import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static ArrayList<Ball> getBalls(){
        ArrayList<Ball> balls = new ArrayList<Ball>();
        balls.add( new FootBall(4,"Adidas"));
        balls.add( new TennisBall(3,"Jeff"));
        FootBall fb = new FootBall(1,"Wilson");
        TennisBall tb = new TennisBall(3,"Yee");
        TennisBall tb2 = new TennisBall(2,"Geoff");

        balls.add(fb);
        balls.add(tb);
        balls.add(tb2);

        //System.out.println(balls);

        //int i = balls.indexOf(fb);
        //System.out.println(i);

        FootBall fb2 = new FootBall(4,"Adidas");
        //i = balls.indexOf(fb2);
        //System.out.println(i);

        System.out.println("fb sammenlignet med fb2 (size=1,size=4), "+fb.compareTo(fb2));
        System.out.println("tb sammenlignet med fb (size=3,size=1), "+tb.compareTo(fb));
        System.out.println("fb sammenlignet med tb (size=1,size=3), "+fb.compareTo(tb));
        System.out.println("fb2 sammenlignet med fb (size=4,size=1), "+fb2.compareTo(fb));
        System.out.println();

        return balls;

    }

    public static void main2(){
        List<Ball> balls = getBalls();
        System.out.println(balls);

        Collections.sort(balls);
        Ball mindste = (Ball) Collections.min(balls);
        System.out.println("Den mindste bold er " + mindste);
        System.out.println(balls);
        System.out.println();


        ArrayList<TennisBall> tbList = new ArrayList<>();
        for (Ball bb: balls){
            if(bb instanceof TennisBall){
                tbList.add((TennisBall) bb);
            }
        }

        System.out.println("Der er "+tbList.size()+" tennisbolde, ud af "+balls.size()+" bolde ialt");
    }

    public static void main(String[] args){
        List<Ball> balls = getBalls();


    }
}
