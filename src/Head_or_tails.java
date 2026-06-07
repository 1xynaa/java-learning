import java.util.Random;

public class Head_or_tails {
    public static void main (String[]arg){
        Random random = new Random();
        boolean isHeads;
        isHeads=random.nextBoolean();
        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
