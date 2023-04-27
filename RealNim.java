import java.util.*;
public class RealNim{
    public static boolean runGame() {
        System.out.println("This is the start of the Real Nim Game");
        boolean myTurn = true;
        ArrayList<Integer> baseCase = new ArrayList<>();//creating asrraylist for my base case
        ArrayList<Integer> piles = new ArrayList<>(generateRandomPiles()); //tol get starting # of piles and starting # chips in each pile 
        System.out.println(piles);

        for (int i = 0; i < piles.size(); i++) {
        baseCase.add(0); //adding zero to each pile for the base case depending on how many piles are on the table 
        }

        while (!piles.equals(baseCase)) { //as long as we are not at base case 
            if (myTurn) {
             piles = getUserMove(piles);//if its my turn i get to input pile number and pieces i want to take
            } else {
            piles = getYMove(piles); //computer move
            }
            display(piles, myTurn);//showing the current situation
            myTurn = !(myTurn); //changing turns
            System.out.println();
        }

        if (myTurn) {//if its my turn and we've reached base case i lost
            System.out.println("You won, the computer lost");
            return true;
        } else {
            System.out.println("The computer won, you lost");
            return false;
        }
    }
    
    public static ArrayList<Integer> generateRandomPiles() { //generating a random number of piles and chips to play nim
         ArrayList<Integer> table = new ArrayList<>();
            for (int i = 0; i < (int) (Math.random() * 10) + 1; i++) {   //random number of piles min 1 max 10
                table.add((int) (Math.random() * 10)+1); //random number of chips in each pile min 1 max 10
            }
        return table;
    }
    public static void display(ArrayList<Integer> numPieces, boolean myTurn) {
        if (myTurn) {
         System.out.println("User's turn");
        } else {
          System.out.println("Computer's turn");
        }
        System.out.println();
        System.out.print("Here are the current piles: ");
        for (int i = 0; i < numPieces.size(); i++) {
          System.out.print(" " + numPieces.get(i) + " ");
        }
        System.out.println();
     }

    public static ArrayList<Integer> getYMove(ArrayList<Integer> piles) { //arraylist
        return bestMove(piles, false);
    }

    public static ArrayList<Integer> getUserMove(ArrayList<Integer> piles) { //tried making it as robust as possible, pls assume valid input
        int pileNum = 0;
        int piecesTaken = 0;
        ArrayList<Integer> possibleState = new ArrayList<>(piles);
        boolean validMove = false;
        while (!validMove) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Which pile do you want to pick from (starting at pile 0): ");
            pileNum = sc.nextInt();
            System.out.println("How many pieces will you take from that pile: ");
            piecesTaken = sc.nextInt();
            if ((pileNum >= 0) && (pileNum < piles.size())) {
                if ((piles.get(pileNum) - piecesTaken) >= 0) {
                    if (piecesTaken != 0) {
                      validMove = true;
                    }
                }
            }
        }
        possibleState.set(pileNum, piles.get(pileNum) - piecesTaken);
        return possibleState;
  }

    public static ArrayList<Integer> bestMove(ArrayList<Integer> piles,boolean myTurn) {
        for (int i = 0; i < piles.size(); i++) {
            // if (piles.get(i) == 0) { //if there are no chips
            //     continue;//edge case
            // }
            for (int j = 1; j <= piles.get(i); j++) { //num pieces im taking 
                ArrayList<Integer> copyPiles = new ArrayList<Integer>(piles);
                ArrayList<Integer> state = new ArrayList<Integer>(piles);
                state.set(i, piles.get(i) - j);//replacing current pile with value - piecesTaken
                if (myTurn) {
                    if (minimax(state, !myTurn) == 1) {
                        copyPiles.set(i,(Integer)copyPiles.get(i)-state.get(i));
                        return copyPiles;
                    }
                } else {
                    if (minimax(state, !myTurn) == -1) {
                        copyPiles.set(i,(Integer)copyPiles.get(i)-state.get(i));
                        return copyPiles;
                    }
                }
            }
        }
        ArrayList<Integer> state = new ArrayList<Integer>(piles);
        int count = 0;
        for (int i = 0; i < piles.size(); i++) {
            if (piles.get(i) > 0) {
                count = i;
                break;
            }
        }
        state.set(count, piles.get(count) - 1);
        return state;
  }

    public static int minimax(ArrayList<Integer> piles, boolean myTurn) {
        ArrayList<Integer> baseCase = new ArrayList<>();
        for (int i = 0; i < piles.size(); i++) {
            baseCase.add(0); //same thing creating base case 
        }
        if (piles.equals(baseCase)) { //check if all of the piles contain 0 chips 
            if (myTurn) {
                return 1; //i won
            } 
            else {
                return -1;//i lost 
            }
        } 
        else {
            for (int p = 0; p < piles.size(); p++) { //iterating through pile
                for (int n = 1; n <= piles.get(n); n++) { //iterating through number in each pile
                    ArrayList<Integer> state = new ArrayList<Integer>();
                    for (int oldPieces : piles){
                        state.add(oldPieces);//copying over old pieces
                    }
                    System.out.println("hi");
                    state.set(p, piles.get(p)-n);
                    if (myTurn) {
                        if (minimax(state, !myTurn) == 1) {
                            return 1;
                        }
                    }
                    else {
                        if (minimax(state, !myTurn) == -1) {
                            return -1;
                        }
                    }
                }
            }
            if (myTurn) {
                return -1;
            }
            else {
                return 1;
            }
        }
  }

}
