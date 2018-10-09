/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootcamp172;

/**
 *
 * @author arrizaqu
 */
class Employee{
    String name;
    String address;
    int age;
    
    //constructor
    public  Employee(){
        System.out.println("executed..!!");
    }
    
    //overload constructor 
    public void Employee(String name, String address){ //parameter
        this.name = name;
        this.address = address;
    }
    
    public Employee(String name, int age ){
        this.name = name;
        this.age = age;

    }
    
    public int getMaxColumn(){
        return 5;
    }
    
    public String getUsername(){
        return "adi nugraha";
    }
    
    public Employee getEmployee(){
        return new Employee();
    }
    
    public void setName(String username){
        this.name = username;

    }
    
}

public class MyContructor {
    
    public static void main(String[] args) {
        Employee emp = new Employee(); //argument
        emp.Employee(emp.name, "jakut");
        System.out.println("name "+ emp.name + ", address : "+ emp.address + ", age : "+ emp.age);
    }
}
