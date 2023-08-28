package com.juaracoding;

public class LoopingPyramid {
    public static void main(String[] args) {
        for(int i =1; i<=9; i++){
            System.out.print(i+ "_");
            i+=1;
            if(i %2==0){
            }
        }System.out.println();

        for(int j=2; j<8; j++){
            j+=1;
            if(j %2==0){
            }
            System.out.print("_" + j);

        }System.out.print("_");

        System.out.println();
        for(int k=2; k<8; k++){
            k+=1;
            if(k %2==0){
            }
            System.out.print(k + "_");
        }System.out.println();
        for(int l=4; l<6; l++) {
            l += 1;
            if (l % 2 == 0) {
            }

            System.out.print( "_" + l + "_");

        }System.out.println();
        for(int m=4; m<6; m++) {
            m += 1;
            if (m % 2 == 0) {
            }
            System.out.print(m);
        }
    }
}