import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
    int total = 0;

    double length, width, depth, weight;

    for(int i = 0; i < t; i++){
      length = scan.nextDouble();
      width = scan.nextDouble();
      depth = scan.nextDouble();
      weight = scan.nextDouble();

      if(((length <= 56.0 && width <= 45.0 && depth <= 25.0) || (length + width + depth) <= 125.0) && weight <= 7.0){
        System.out.println("1");
        total++;
      }else{
        System.out.println("0");
      }
    }

    System.out.println(total);
  }
}
