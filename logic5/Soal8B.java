/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic5;

import java.util.Scanner;

/**
 *
 * @author arrizaqu
 */
public class Soal8B {
    
    private int baris; //kebawah
    private int kolom; //kesamping
    private String[][] matrix;
    
    public void setMatrix(int n,int n2,int n3){
        System.out.println("n 1 : "+ n);
        System.out.println("n 2 : "+ n2);
        System.out.println("n 3 : "+ n3);
        //change baris / kolom
        this.baris = n*n;
        this.kolom = n*n;
        this.matrix = new String[this.baris][this.kolom];
        //do logic here !!
        
        int start = getStartFrom(n);
        int addBangun = 0;
        for(int bangun = 0; bangun < n; bangun++){
            for (int i = 0; i < n; i++) {
                int increase = 0;
                for (int j = 0; j < n; j++) {
                    if(i+j >= n/2 && i -j <= n/2 && -i +j <= n/2 && i+j <= n+n/2-1){
                         this.matrix[i+addBangun][j+addBangun] = start - increase +"";
                        
                         if(j <= n/2-1){
                            increase++;
                         } else {
                            increase--;
                         }
                    }
                }
            }
            addBangun = addBangun + n;
            start = start + getStartFrom(n);
        }
        
        
    }
    
    public int getStartFrom(int n){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 1){
                result++;
            }
        }
        return result; 
    }
    
    public void showMatrix(){
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                System.out.print(this.matrix[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Soal8B tm = new Soal8B();
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan angka n : >> ");
        int n1 = scan.nextInt();
        System.out.print("Masukkan angka n2 : >> ");
        int n2 = scan.nextInt();
        System.out.print("Masukkan angka n2 : >> ");
        int n3 = scan.nextInt();
        
        tm.setMatrix(n1,n2, n3);
        tm.showMatrix();
    }
}
