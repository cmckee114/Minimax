# Minimax

##Background and motivation

##Usage

##Future directions


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
