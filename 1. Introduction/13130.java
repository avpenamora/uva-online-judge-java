import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();

    for(int i = 0; i < T; i++){
      boolean yes = true;
      int cur = scan.nextInt();
      int prev = cur;

      for(int j = 1; j < 5; j++){
        cur = scan.nextInt();
        if(cur - prev != 1)
          yes = false;
        prev = cur;
      }

      if(yes)
        System.out.println("Y");
      else
        System.out.println("N");
    }
  }
}
