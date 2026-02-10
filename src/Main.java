import java.util.Scanner;
import java.security.SecureRandom; //"random"

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] mat = new int[10][10];

    String prompt_str = "\033[32m?\033[0m";
    loop: while(true) {
      System.out.printf("\033[36m(%s\033[36m):\033[0m ", prompt_str);
      prompt_str = "\033[32m?\033[0m";
      String l = in.nextLine();
      switch (l) {
       case "user":
        mat = user_populate(mat, in); break;
       case "rand":
        mat = rand(mat); break;
       case "print":
        print(mat); break;
       case ":q", "q", "exit", "quit", "close":
        break loop;
       default:
        prompt_str = "\033[31m!\033[0m";
        System.err.printf("unknown action: %s%n", l);
      }
    }
  }
  static int[][] user_populate(int[][] mat, Scanner in) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.printf(
          "    please enter number %d of %d (row %d)", j, mat[j].length, i
        );
        mat[i][j] = user_int(in);
      }
    }
    return mat;
  }

  static void print(int[][] mat) {
    System.out.printf("[%n");
    for (int i = 0; i < mat.length; i++) {
      System.out.printf("%n  [%n   ");
      for (int j = 0; j < mat.length; j++) {
        System.out.printf(" \033[33m%d\033[0m,", mat[i][j]);
      }
      System.out.printf("\b %n  ],");
    }
    System.out.printf("\b %n]%n");
  }

  static int[][] rand(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        SecureRandom r = new SecureRandom();
        int n = r.nextInt(100);
        mat[i][j] = n;
      }
    }
    return mat;
  }

  static int user_int(Scanner in) {
    while (true) {
      try {
        int n = in.nextInt();
        in.nextLine();
        return n;
      } catch (java.util.InputMismatchException e) {
        System.err.printf("not a number (or too large)%n");
        in.nextLine();
      }
    }
  }
}
