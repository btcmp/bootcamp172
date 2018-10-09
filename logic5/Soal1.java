/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic5;

import java.util.Arrays;

/**
 *
 * @author arrizaqu
 */
public class Soal1 {
    
    private int baris; //kebawah
    private int kolom; //kesamping
    private String[][] matrix;
    
    public void setMatrix(int n){
        //change baris / kolom
        this.baris = this.getMaxColumn(n);
        this.kolom = this.getMaxColumn(n);
        
        this.matrix = new String[this.baris][this.kolom];
        System.out.println(Arrays.toString(this.getArrayTriangular(n)));
        int[] dataTri = this.getArrayTriangular(n);
        //do logic here !!
        
        for(int bangun = 0; bangun < n; bangun++){
             for (int i = 0; i < bangun + 1; i++) {
                for (int j = 0; j < bangun + 1; j++) {
                    this.matrix[i+dataTri[bangun]][j+dataTri[bangun]] = "*";
                }
            }
        }
        
        
//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < 1; j++) {
//                this.matrix[i+0][j+0] = "*";
//            }
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                this.matrix[i+1][j+1] = "*";
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                this.matrix[i+3][j+3] = "*";
//            }
//        }
    }
    
    public void showMatrix(){
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public int getMaxColumn(int n){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
            /*
            0 + 1 = 1;
            1 + 2 = 3;
            3 + 3 = 6;
            6 + 4 = 10;
            */
        }
        
        return result;
    }
    
    public int[] getArrayTriangular(int n){
        int data[] = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result + i;
            data[i] = result;
        }
        
        return data;
    }
    
    public static void main(String[] args) {
        Soal1 tm = new Soal1();
        tm.setMatrix(3);
        tm.showMatrix();
    }
}
