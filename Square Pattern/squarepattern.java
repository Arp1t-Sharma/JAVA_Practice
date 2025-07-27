public class squarepattern{
    public static void main(String[]args){
    int rows=6; // Size of the square

    for(int i=1; i<=rows; i++){
        for(int j=1; j<=rows; j++){
            if (i == 1 || i == rows || j == 1 || j == rows){
            System.out.print("*");
            }
            else {
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}