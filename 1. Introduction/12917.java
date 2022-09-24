import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int P, H, O;

    while(scan.hasNext()){
      P = scan.nextInt();
      H = scan.nextInt();
      O = scan.nextInt();

      if((O - P) < H){
        System.out.println("Hunters win!");
      }else{
        System.out.println("Props win!");
      }
    }
  }
}
