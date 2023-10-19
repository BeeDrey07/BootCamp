/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author Bianca
 */
public class Cat extends Animal implements Pet {
    private String name;
    
    public Cat(String name) {
        super(4);
        this.name = name;
    }
    
    public Cat() {
        this("Fuffy");
    }
    
    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    }
    
    @Override
    public void eat() {
        System.out.println("Cats like to eat spiders and fish.");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
