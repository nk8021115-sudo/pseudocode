import java.util.*;
public class Program17 {
    public static void main(String[] args) {
        int x, y;

        x = 4;
        y = 8;

        do {
            System.out.println(x);
            x = x + y + 1;
        } while (x < 15);
    }
}

/*
PSEUDOCODE

INTEGER x, y
SET x := 4, y := 8

DO
    PRINT x
    x := x + y + 1
WHILE x < 15 LOOP

END DOWHILE
*/