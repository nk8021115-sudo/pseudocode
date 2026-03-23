import java.util.*;
public class Nested_If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uid = sc.nextLine();
        String pass = sc.nextLine();
        if(uid == "TIT"){
            if(pass == "Excellence"){
                System.out.println("WELCOME");
            }
            else{
                System.out.println("WRONG PASS");
            }
        }
        else{
            System.out.println("INVALID UID ");
        }
    }
}
/*
DECLARE uid : STRING
DECLARE pass : STRING
READ uid
READ pass
IF uid == "TIT" THEN
    IF pass == "Excellence" THEN
        PRINT "WELCOME"
    ELSE
        PRINT "WRONG PASS"
ELSE
    PRINT "INVALID UID"
END IF
*/