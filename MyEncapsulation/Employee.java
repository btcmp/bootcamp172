/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyEncapsulation;

/**
 *
 * @author arrizaqu
 */
public class Employee {
    
    private String id;
    private String name;
    private String address;
    private int gender;
    
    //setter
    public void setName(String name){
        this.name = name;
    }
    
    //getter
    public String getName(){
     return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    
    
}
