import java.util.*;
public class Tests{

    public static void main(String[] args){
        //Testing minimax function
        System.out.println("Testing my NimRunner class.");
        System.out.println(NimRunner.minimax(1,true)==-1); //this should print out true if i'm getting -1
        System.out.println(NimRunner.minimax(1,false)==1); //this should print out true if it's working (im getting 1)
        System.out.println(NimRunner.minimax(0,true)==1);//edge case I won should return 1
        System.out.println(NimRunner.minimax(4,true)==1);//should return 1 true 

        //Testing bestMove function 
        System.out.println("Testing my best move method");
        System.out.println(NimRunner.bestMove(2, true)==1);
        System.out.println(NimRunner.bestMove(3, true)==2);
        System.out.println(NimRunner.bestMove(2, false)==1);
        System.out.println(NimRunner.bestMove(3,false)==2); 
        System.out.println(NimRunner.bestMove(4,true)==3);         
        System.out.println(NimRunner.bestMove(6, true)==1);

        //Testing runGame function
        System.out.println("Testing my runGame method");
        //System.out.println(NimRunner.runGame(3)==true); 
        System.out.println(NimRunner.runGame(6)==true);
        
        System.out.println("Testing minimax should return true");
        System.out.println(NimRunner.minimax(1, false)==1);

        System.out.println("Testing simpleNim with 20");
        System.out.println(NimRunner.runGame(10));

        System.out.println("Testing real nim:");
        ArrayList<Integer> zTest1 = new ArrayList<>();
        zTest1.add(1);
        zTest1.add(3);
        zTest1.add(5);
        zTest1.add(7);
        System.out.println(RealNim.minimax(zTest1, true));//this should return -1

        // ArrayList<Integer> zTest1 = new ArrayList<>();
        // zTest2.add(3);
        // zTest2.add(5);
        // zTest2.add(7);
        // System.out.println(RealNim.minimax(zTest2, true));//this should return 1

        //  ArrayList<Integer> piles = new ArrayList<>();
        //  piles.add(3);
        //  System.out.println(RealNim.bestMove(piles, false)); //stack overflow error 
        
        
        //System.out.println(RealNim.runGame()); 
    }

}