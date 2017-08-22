/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

/**
 *
 * @author BetaTeam
 */
public class InterestAlgorithm {
    public static void main(String[] args){
        int[] A = {8,4,2,8,10,12,14};
        int n= A.length;
        //check for condition 2
        System.out.println("The point of interests are listed below");
        if(A[0]>=A[1]){
            System.out.println(A[0]+" passed condition 2 ");
        }
        else{
        }
        for(int m=0;m<=n;m++){
            //check for condition 3
            if(m==(n-1)&&A[m]>=A[m-1]){
                System.out.println(A[m]+" passed condition 3 ");
            }
            else{
            }
            //check for condition 1
            if(m>0&&m<(n-1)&&A[m]>=A[m-1]&&A[m]>=A[m+1]){
                System.out.println(A[m]+" passed condition 1");
            }
            else{
            }
        }

    }
}
