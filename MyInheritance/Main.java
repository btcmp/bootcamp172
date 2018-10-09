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

public class Main extends Object{
    
    
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Object dir = new Director();
        Object str = new String("ertyuiop[");
        Object data = new Integer("12");
        
        //manager salary 
        System.out.println("employee salary : "+ employee.getSalary());
        System.out.println("manager salary : "+ manager.getSalary());
        
    }
}
