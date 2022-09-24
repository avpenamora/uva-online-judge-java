import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int A, B, C;

    while(scan.hasNext()){
      A = scan.nextInt();
      B = scan.nextInt();
      C = scan.nextInt();

      int sum = A + B + C;
      if(sum == 1){
        if(A == 1){
          System.out.println('A');
        }else if (B == 1){
          System.out.println('B');
        }else if (C == 1){
          System.out.println('C');
        }
      }else if (sum == 2){
        if(A == 0){
          System.out.println('A');
        }else if (B == 0){
          System.out.println('B');
        }else if (C == 0){
          System.out.println('C');
        }
      }else{
        System.out.println('*');
      }
    }
  }
}
