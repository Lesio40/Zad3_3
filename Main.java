import java.util.Random;
class Main {
  public static void main(String[] args) {
    int[][] tablica=new int[10][10];
    Random losowa =new Random();
    for(int i=0;i<10;i++)
      {
        for(int y=0;y<10;y++)
          {
          tablica[i][y]=losowa.nextInt(101)-50;
          }
      } 
      for(int i=0;i<10;i++)
      {
        for(int y=0;y<10;y++)
          {
          System.out.print(tablica[i][y]+" ");
          }
        System.out.println();
      } 
   
  }
}