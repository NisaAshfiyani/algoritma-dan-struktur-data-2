
package pengurangan_matriks_;
public class pengurangan {
    public static void main(String[] args){
        int[][] A = {
            {3, 7},
            {2, 4},
            {1, 7}
                   
            
                
        };
        int [] [] B = {
            {6, 2},
            {3, 5},
            {2, 8}
            
        };
        if ((A.length == B.length) && (A[0].length == B[0].length)) {
            int[][] C = new int [A.length] [A[0].length];
            for (int i=0; i<A.length; i++) {
                for (int j=0; j<A[0].length; j++){
                    for (int k=0; k<A[0].length; k++){
                       C[i][k] = A[i][k] - B[i][k];
                }
            }
            }
            
                for (int[] c: C) {
                    for (int q: c) {
                        System.out.print (q+" ");
                        
                    }
                    System.out.println();
                }
            }
            else {
                    System.out.println("ukuran matrix tidak sama");
                    
        }
    }
    
}