public class numberpyramid{
    public static void main(String[] args){
        int rows = 6;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
                for(int k=i; k>=1;k--){
                    System.out.print(k + " ");
                }
                for(int l= 2; l<=i;l++){
                    System.out.print(l + " ");
                }
                System.out.println();
            }
        }
}
