# Minimax

Background and motivation
- Nim is a game a two player zero sum game (where when one player wins, the other loses) where each player takes turns taking however many pieces they want from one of three possible piles. The objective of the game is to not take the last piece and you are only allowed to take from one pile per turn. We started by coding SimpleNim, a simpler version of the nim game that only contains one pile and limits each player's turn to taking between 1 and 3 pieces. We coded a function to tell us what the best move would be given our options (taking 1, 2, or 3 pieces) and in order to do this, we needed to recursively trace through game trees for our possible options given whether it is player 1's turn or player 2's turn and how many chips were left on the board. Minimax is the function we coded to determine what was a "good" move by __________. Nim is a good test case for this algorithm because_____.

Usage
- Someone can run my program by _______. THe only files required to run the program are the NimRunner file where I have coded the logic that creates a functioning nim game and a tester file or another file to run the actual game. (You could also run the game within the main function fo the NimRunner class)

Future directions
Some improvements that can be made to my code is that currently, I accept the first "good move" that I come across in my code when in reality there are probably other good moves that we haven't seen yet and we don't take into account the degree to which a move is "good" so if I had more time on this project I would try to grade good moves by degree of success likely and then choose the true best move. - FIX


things changed for real nim
- for loop hardcoding
- return calues and inputs will be arraylkists 
- you need to egenrate an arraylist of arryalist 
- storing all  of the possible moves in an arraylist (Arraylist of arraylists) a<a<int>>
- can only take from one pile at a time 
1) set up an empty arraylist of arraylists of ints (moves)
2) for loop through state (which represents each pile) state is current number of piles and chips in each pile (ex. 3,5,7 or 1,2,3)
3) for loop or while loop through number f possible pieces you can take from this particular pile (specified index)
outer loop tells pile and inner loop tells chips
4)make a new arraylist of integers to represent 1 move possibility (should have same number of indexes as state)
5)at the index you are at in state (pile index) : add the # of pieces 
6) add the one move to moves (add small arraylist to arraylist of arraylists of ints)
this is getPossibleMoves()
