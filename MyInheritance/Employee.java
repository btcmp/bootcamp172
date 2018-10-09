/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyInheritance;

/**
 *
 * @author arrizaqu
 */
public class Employee { //super class dari manager
    String name;
    String address;
    private Double salary;
    
    public Double getSalary(){
        this.salary = 2000.0;
        return this.salary;
    }
}

class Manager extends Employee{ //subclass dari employee

    @Override
    public Double getSalary() {
        return 20000.0; //To change body of generated methods, choose Tools | Templates.
    }
}

class Director extends Manager{

}