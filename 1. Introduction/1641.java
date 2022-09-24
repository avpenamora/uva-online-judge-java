import java.util.Scanner;
import java.util.ArrayList;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int h, w;

    while(scan.hasNext()){
      h = scan.nextInt();
      w = scan.nextInt();

      String buf = scan.nextLine();
      ArrayList<String> area = new ArrayList<String>();
      int tot_area = 0;

      for(int i = 0; i < h; i++)
        area.add(scan.nextLine());

      for(int i = 0; i < h; i++){
        boolean in = false;
        for(int j = 0; j < w; j++){
          char cur = area.get(i).charAt(j);

          if(in){
            if(cur == '\\' || cur == '/'){
              in = false;
              tot_area += 5;
            }else{
              tot_area += 10;
            }
          }else{
            if(cur == '\\' || cur == '/'){
              in = true;
              tot_area += 5;
            }
          }
        }
      }

      System.out.println(tot_area/10);
    }
  }
}
