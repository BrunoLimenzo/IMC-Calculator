/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Bruno
 */
public class Controller {
    
     public Controller(){}
    
    public double imc(double height, double weight){
        double sqrHeight = height * height;
        return weight/sqrHeight;
    }
    
    public String getClassification(double val){
        if(val <= 18.5){
            return "Abaixo do peso";
        }else if(val <= 24.9){
            return "Peso normal";
        }else if(val <= 34.9){
            return "Obesidade I";
        }else if(val <= 39.9){
            return "Obesidade II";
        }
        return "Obesidade III";
        
    }
}
