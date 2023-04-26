public class RealNim{
    public static int pieces;
    public static void main (String[] args){
       // display(7, true);
    }
    public static void runGame(int pile1Size, int pile2Size, int pile3Size){ //accepting pile sizes and will make this into a state 
    //     set up an empty arraylist of arraylists of ints (moves)
    ArrayList<ArrayList<Integer>> moves = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> state = new ArrayList<Integer>();
    state.add(pile1Size);
    state.add(pile2Size);
    state.add(pile3Size);//how do i adjjust for less than three piles?

    //     for loop through state (which represents each pile) state is current number of piles and chips in each pile (ex. 3,5,7 or 1,2,3)
    for (pile:state){
        for (int piecesToTake = 1; piecesToTake<=3;piecesToTake++){
            if (piecesToTake<pile){
                ArrayList<Integer> oneMove = new ArrayList<Integer>();
            }
            
        }
    }
    //     for loop or while loop through number f possible pieces you can take from this particular pile (specified index) outer loop tells pile and inner loop tells chips 4)make a new arraylist of integers to represent 1 move possibility (should have same number of indexes as state) 5)at the index you are at in state (pile index) : add the # of pieces
    //     add the one move to moves (add small arraylist to arraylist of arraylists of ints) this is getPossibleMoves()
    }
    public static int getXMove(int pieces){
       return bestMove(pieces, true);
    }
    public static int getYMove(int pieces){
       return bestMove(pieces, false);
    }
    //public static int getUserMove(){
        //use scanner 
    //}

    public static int bestMove(int pieces, boolean myTurn){//returning the number of pieces we wanna take (for complicagted nim probs returns an arraylist )
        for (int piecesTaken=1; piecesTaken<3; piecesTaken++){ //specific for simple nim because we need more thna just integer being passed in we also need pile number (array index) and not limited to taking three
            //for move: moves 
            if (piecesTaken>pieces){
                continue;
            }
            else{
                if (myTurn){
                    if(minimax(pieces, myTurn)>0){
                        return piecesTaken;
                    }
                }
                else{
                    if (minimax(pieces, myTurn)<0){
                        return piecesTaken;
                    }
                }
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
       //checking if each pile is zero for nim
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


// ArrayList<Integer> states = new ArrayList<>();
//         states.add(1);
//         states.add(1);

//         int totalObjects = 0;
//         for(int i=0; i<states.size(); i++){
//             totalObjects = totalObjects +states.get(i);
//         }

//         int state=2;
//         while(state>=1){
//             if(isXTurn){
//                 state= getXMove(state);
//                 System.out.println("New state:" + state);
//             }
//             else{
//                 state = getYMove(state);
//                 System.out.println("During y move, state after y moves:" + state);
//             }
//             isXTurn = !isXTurn;
//         }
//         if (state==0 && isXTurn){
//             return true;
//         }
//         return false;
