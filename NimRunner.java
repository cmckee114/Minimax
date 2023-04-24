public class NimRunner{
    public static int pieces;
    public static void main (String[] args){
       // display(7, true);
    }
    public static void runGame(int numChips){
        while (numPieces>0){
            getXMove();
            getYMove();
        }
    }
    public static int getXMove(int pieces){
       return bestMove(pieces, true);
    }
    public static int getYMove(int pieces){
       return bestMove(pieces, false);
    }

    public static int bestMove(int pieces, boolean myTurn){//returning the number of pieces we wanna take (for complicagted nim probs returns an arraylist )
        for (int piecesTaken=1; piecesTaken<3; piecesTaken++){
            if (piecesTaken>=pieces){
                if (myTurn){
                    if(minimax(state, myTurn)>0){
                        return piecesTaken;
                    }
                }
                else{
                    if (minimax(state, myTurn)<0){
                        return piecesTaken;
                    }
                }
            }
            else{
                return 0;
            }
        }
        return 1;// if you get ot this point there is no winning strategy (you will lose) and so we're just deciding to trake 3
    }

    public static void display(int pieces, boolean turn){ //shows a line of asterisks for the number of chips on the table 
        for (int i=0; i<pieces; i++){
            System.out.print("*");
        }
        System.out.println(" ");
    }

    public static int minimax(int state, boolean myTurn){ //state=numPieces 
        if (state==0){//base case no more pieces 
            if (myTurn==false){
                return -1;//i lost
            }
            else{
                return 1;//i won
            }
        }
        else{
            for (int piecesToTake = 1; piecesToTake<=3;piecesToTake++){ //determining each of the possible next states of the game (number of chips taken)
                if (piecesToTake<=state){//making sure it is a valid move
                    if (myTurn){//if its my turn i wanbt to return the max 
                        if(minimax(state-piecesToTake, !myTurn)>0){ //return 1 if there is a winning combo when it is my turn
                            return 1;
                            }
                    }
                    else{
                        if(minimax(state-piecesToTake, !myTurn)<0){
                            return -1;
                        }
                    }
                }

            }
            if (myTurn){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
}
