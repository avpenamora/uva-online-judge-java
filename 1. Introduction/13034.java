import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int S = scan.nextInt();

    for(int i = 1; i <= S; i++){
      System.out.print("Set #" + i + ": ");
      boolean yes = true;
      int num;

      for(int j = 0; j < 13; j++){
        num = scan.nextInt();
        if(num == 0)
          yes = false;
      }

      if(yes)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
  }
}
