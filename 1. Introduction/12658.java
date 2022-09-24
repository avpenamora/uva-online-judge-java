import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String buf = scan.nextLine();

    int width = n*3 + n - 1;
    String input[] = new String[5];
    String output = "";

    for(int i = 0;i < 5; i++)
      input[i] = scan.nextLine();

    for(int j = 0; j < width; j+=4){
      if(input[0].charAt(j) == '.'){
        output += "1";
      }else if(input[3].charAt(j) == '*'){
        output += "2";
      }else{
        output += "3";
      }
    }

    System.out.println(output);
  }
}
