import jdk.jshell.Snippet;

import java.util.Scanner;

public class Function {
    public static void announceTeaTime() {
        System.out.println("waiting for tea time...");
        System.out.println("type in random word and press Enter");
        Scanner input = new Scanner( System.in );
        input.next();
        System.out.println("it's tea time");
    }
    public static void main(String[] args) {
        announceTeaTime();
    }
}
