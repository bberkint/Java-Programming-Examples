/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop8incihaftadersinheritance;

/**
 *
 * @author balak
 */
public class BritishShortHair extends Cat{
    String faceType;
    
    public BritishShortHair(String color,int age , String f){
        super(color,age);
        this.faceType = f;
        this.getClass();
    }
}
