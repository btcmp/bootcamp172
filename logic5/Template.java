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
public class Template {
    
    private int baris; //kebawah
    private int kolom; //kesamping
    private String[][] matrix;
    
    public void setMatrix(int n){
        //change baris / kolom
        this.baris = n;
        this.kolom = n;
        this.matrix = new String[this.baris][this.kolom];
        //do logic here !!
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
        Template tm = new Template();
        tm.setMatrix(4);
        tm.showMatrix();
    }
}
