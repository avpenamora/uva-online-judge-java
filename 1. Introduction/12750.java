import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();

    for(int i = 1; i <= T; i++){
      System.out.print("Case " + i + ": ");

      int n = scan.nextInt();
      int game = 0;
      int counter = 0;
      boolean sack = false;
      String status;

      for(int j = 0; j < n; j++){
        status = scan.next();

        if(sack)
          continue;

        if(status.charAt(0) == 'W'){
          counter = 0;
        }else{
          counter++;
          if(counter == 3){
            sack = true;
          }
        }

        game++;
      }

      if(sack)
        System.out.println(game);
      else
        System.out.println("Yay! Mighty Rafa persists!");
    }
  }
}
