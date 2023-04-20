public class NimRunner{
    public static int pieces;
    public static void main (String[] args){
       // display(7, true);
    }
    // public static void runGame(int numChips){
    //     while (numPieces>0){
    //         getXMove();
    //         getYMove();
    //     }
    // }

    // public static int getXMove(int pieces, boolean turn){
    //     return 1;
    // }
    // public static int getYMove(int pieces, boolean turn){
    //     return -1;
    // }

    public static void display(int pieces, boolean turn){ //shows a line of asterisks for the number of chips on the table 
        for (int i=0; i<pieces; i++){
            System.out.print("*");
        }
        System.out.println(" ");
    }

    public static int miniMax(int state, boolean myTurn){ //state=numPieces 
        if (state==0){
            if (myTurn==false){
                return -1;
            }
            else{
                return 1;
            }
        }
        else{
            for (int piecesToTake = 1; piecesToTake<=3;piecesToTake++){
                if (pieces<=state){
                    int score = miniMax(state-piecesToTake, myTurn);
                }
            }
        }
        return -1;
    }
}