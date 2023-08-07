public class Patterns {
    public static void main(String[] args){
        // for(int i = 1; i<=4; i++){
        //     for(int j = 1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        //     // *****
        //     // *****
        //     // *****
        //     // *****     
        //    }


        // hollow rectangle
        // int n = 4;
        // int m = 5;

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j <= m; j++){
        //         if(i == 1 || j == 1 || i == n || j == m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.println(" ");
        //         }
        //     }
        //  System.out.println();
            // *****
            // *   *
            // *   *
            // *****
      //  }


    //   HALF PIRAMID
        // int n = 4;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j <= i ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        //     *
        //     **
        //     ***
        //     ****
        // }


        // Inverted half piramid

        int n = 5;
        // for(int i = 1; i<= n; i++){
        //     for(int j = 1; j<=n-1; j++){
        //         System.out.print("  ");
        //     }
        //    for(int j = 1; j<=i; j++){
        //         System.out.println("*");
        //    }
        //    System.out.println();
        // }
           

        // half pyramid with numbers
        // for(int i = 1;i <= n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        
        // half inerted pyramid with numbers
         // for(int i = 1;i<=n; i++){
        //     for(int j = 1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //         System.out.println(" ");
        // }
        
        
        // one more pattern
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10 
        // 11 12 13 14 15

        // int number = 1;
        // for(int i = 1; i <= n; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }


        // new pattern 
        int sum;
        for(int i = 1; i <=n;i++){
            for(int j = 1; j<= i; j++){
                sum = i + j ;
            if(sum % 2 == 0 ){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }

            }
            System.out.println();
        }
    }
}
