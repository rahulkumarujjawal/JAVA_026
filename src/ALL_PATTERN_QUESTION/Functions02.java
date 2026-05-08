package ALL_PATTERN_QUESTION;
public class Functions02 {


    public static void main(String[] args) {
     pattern_numbrs();

    }
    public static void  pattern_numbrs(){
        int rows = 0;
        while (rows < 10){
            System.out.print("*");
            int i =0;
          while(i < rows){
              System.out.print ("*");
              i++;
          }
          System.out.println();
            rows ++;
        }

    }

}
