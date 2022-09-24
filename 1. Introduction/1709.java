import java.util.Scanner;
import java.lang.Math;

class Main{
  static double priceK(int p, int a, int b, int c, int d, int k){
    double price = p*(Math.sin(a * k + b) + Math.cos(c * k + d) + 2);
    return price;
  }

  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);

      int p, a, b, c, d, n;

      while(scan.hasNext()){
        p = scan.nextInt();
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        n = scan.nextInt();

        double cur = 0;
        double cur_max = 0;
        double cur_dec = 0;
        double max_dec = 0;

        for (int i = 1; i <= n; i++){
          cur = priceK(p, a, b, c, d, i);
          cur_max = Math.max(cur, cur_max);
          cur_dec = cur_max - cur;
          max_dec = Math.max(cur_dec, max_dec);
        }

        System.out.println(String.format("%.6f", max_dec));
      }
  }
}
