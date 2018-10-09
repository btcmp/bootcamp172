/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic5;

/**
 *
 * @author arrizaqu
 */
public class Logic8A {
    
    private int baris; //kebawah
    private int kolom; //kesamping
    private String[][] matrix;
    
    public void setMatrix(int n){
        //change baris / kolom
        this.baris = n;
        this.kolom = n;
        this.matrix = new String[this.baris][this.kolom];
        //do logic here !!
        for (int i = 0; i < this.baris; i++) {
            for (int j = 0; j < this.kolom; j++) {
                if(+i +j >= this.baris / 2 && i-j <= this.baris / 2 && -i +j <= this.kolom / 2 &&  i+j <= this.baris + this.kolom / 2 - 1){
                    this.matrix[i][j] = "*";
                }
                
            }
        }
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
        Logic8A tm = new Logic8A();
        tm.setMatrix(5);
        tm.showMatrix();
    }
}
