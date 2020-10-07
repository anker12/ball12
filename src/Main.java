import java.lang.reflect.Array;
import java.util.*;

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

    public static void fjernTennisbolde(){
        List<Ball> balls = getBalls();
        System.out.println("____________________________________");
        System.out.println(balls.size());
        for (int i=balls.size()-1; i>=0; i--){
            Ball b = balls.get(i);
            if (b.getClass().getName()=="TennisBall"){
                balls.remove(b);

            }
        }
        System.out.println(balls.size());
        System.out.println(balls);
    }

    public static void hashmap(){
        ArrayList<Ball> balls = getBalls();

        HashMap<String, ArrayList<Ball>> map = new HashMap<>();

        ArrayList<Ball> fodbolde = new ArrayList<>();
        fodbolde.addAll(balls);
        for (int i=fodbolde.size()-1; i>=0; i--){
            Ball b = fodbolde.get(i);
            if (b.getClass().getName()=="TennisBall"){
                fodbolde.remove(b);

            }
        }
        ArrayList<Ball> tennisbolde = new ArrayList<>();
        tennisbolde.addAll(balls);
        for (int i=tennisbolde.size()-1; i>=0; i--){
            Ball b = tennisbolde.get(i);
            if (b.getClass().getName()=="FootBall"){
                tennisbolde.remove(b);

            }
        }
        map.put("fodbolde",fodbolde);
        map.put("tennisbolde",tennisbolde);

        //System.out.println(map.get("fodbolde"));
        //System.out.println(map.get("tennisbolde"));


        for (String str1: map.keySet()){
            ArrayList<Ball> val = map.get(str1);
            System.out.println(val);
        }

    }

    public static void main(String[] args){
        ArrayList<Ball> balls = getBalls();
        hashmap();

    }
}
