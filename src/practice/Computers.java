/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Khaya
 */
public class Computers {
    
        private String brand;
        private String model;
        private String id;
       
        Computers(){}
        
        Computers(String brand, String model, String productID){
            this.brand = brand;
            this.model = model;
            this.id = productID;
        }
        public String getBrand(){
           return this.brand;
        }
        public String getModel(){
            return this.model;
        }
        public String getID(){
            return this.id;
        }
        @Override
        public String toString(){
            return "Name\t:\t"+getBrand() +"\nModel\t:\t"+ getModel()+"\nID\t:\t"+
                    getID();
        }
}
