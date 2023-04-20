public class Tests{

    public static void main(String[] args){
        System.out.println("Testing my NimRunner class.");
        System.out.println(NimRunner.miniMax(1,true)==-1); //this should print out true if i'm getting -1
        System.out.println(NimRunner.miniMax(1,false)==-1); //this should print out true if it's working (im getting 1)
        System.out.println(NimRunner.miniMax(0,true)==1);//edge case I won should return 1
        System.out.println(NimRunner.miniMax(0,false)==-1);//edge case I lost should return -1

    }

}