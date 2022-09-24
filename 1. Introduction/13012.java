import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    String T_in, input;
    int T;

    while(scan.hasNextLine()){
      T_in = scan.nextLine();
      T = T_in.charAt(0);
      input = scan.nextLine();

      int out = 0;

      for(int i = 0; i < input.length(); i++){
        if(input.charAt(i) == T)
          out++;
      }

      System.out.println(out);
    }
  }
}
