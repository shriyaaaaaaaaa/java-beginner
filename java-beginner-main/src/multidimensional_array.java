public class multidimensional_array {
    public static void main(String[] args) {
        /* String[][] cars= new String[2][2];// 2 rows and  2 columns


         cars[0][0]="A";
         cars[0][1]="B";
         cars[1][0]="C";
         cars[1][1]="D";
         */


        String[][] cars = {
                                {"A","B","C","D"},
                                {"B","C","D","E"},
                                {"C","D","E","  F"},
                            };

         for(int i=0; i< cars.length; i++){
             System.out.println();
             for(int j=0; j< cars[i].length; j++){
                 System.out.print(cars[i][j]+" ");

             }
         }

    }
}
