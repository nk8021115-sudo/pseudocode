import java.util.*;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }
}
/*
DECLARE num : INTEGER
READ num
IF x MOD 2 == 0 THEN
    PRINT " EVEN "
ELSE
    PRINT " ODD "
END IF
*/