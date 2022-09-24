import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();

    String buffer = scan.nextLine();
    for (int i = 0; i < T; i++){
      String input = scan.nextLine();

      int score = 0;
      int cur = 0;

      for (int j = 0; j < input.length(); j++){
        if(input.charAt(j) == 'X'){
          cur = 0;
        }else if (input.charAt(j) == 'O'){
          cur = cur + 1;
          score = score + cur;
        }
      }

      System.out.println(score);
    }
  }
}
