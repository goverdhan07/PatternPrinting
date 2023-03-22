public class Main {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
    }

    static void pattern1(int rows){
        for(int i = 0 ; i < rows; i++ ){
            for(int j = 0 ; j<rows;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int rows){
        for(int i = 0 ; i <=rows; i++){
            for(int j = 0 ; j < i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int rows){
        for(int i = 0 ; i<=rows; i++){
            for(int j=0; j<rows-i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int rows){
        for(int i = 0 ; i <= rows; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern5(int rows){
        for(int i = 0 ; i < rows;i++){
            //inner loop for space
            for(int cols = 2*(rows-i); cols >=0; cols--){
                System.out.print(" ");
            }
            //inner loop for columns
            for(int cols = 0 ; cols <=i; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

}