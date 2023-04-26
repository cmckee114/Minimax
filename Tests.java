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
        System.out.println(NimRunner.bestMove(2, true));//should return 1
        System.out.println(NimRunner.bestMove(3, true));//should return 2

        //Testing runGame function
        System.out.println("Testing my runGame method");
        System.out.println(NimRunner.runGame(7));
    }

}