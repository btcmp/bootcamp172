/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClassModifier.a;

/**
 *
 * @author arrizaqu
 */
public class MyObject2 extends MyObject{
     public void getObject(){
        MyObject myobject = new MyObject();
      //  myobject.privateName="private name";
        myobject.defaultName="default name";
        myobject.protectedName="protected name";
        myobject.publicName = "public name";
    }
    
    public void getInhirateObject(){
     //   this.privateName="private name";
        this.defaultName="default name";
        this.protectedName="protected name";
        this.publicName = "public name";
    }
}
