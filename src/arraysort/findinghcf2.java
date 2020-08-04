package arraysort;

public class findinghcf2 {
	
public static void main(String[] args) {

    int a = 98, b = 56, gcd=56;

    for(int i = b; i>0; i--)
    {
        // Checks if i is factor of both integers
        if(a % i==0 && b % i==0) {
            gcd = i;
        break;}
    }

    System.out.printf("G.C.D of %d and %d is %d.", a, b, gcd);
}
}