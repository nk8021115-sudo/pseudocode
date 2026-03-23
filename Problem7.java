import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        int x, y, z;

        x = 10;
        y = 16;
        z = 3;

        if (x > y) {
            x = y;
        } else {
            y = x;
        }

        if (z > y) {
            z = y;
        } else {
            y = z;
        }

        System.out.println(x + y + z);
    }
}

/*
PSEUDOCODE

Integer x, y, z
Set x = 10, y = 16, z = 3

if (x > y)
    x = y
Else
    y = x
End if

if (z > y)
    z = y
Else
    y = z
End if

Print x + y + z
*/

