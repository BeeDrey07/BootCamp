package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        System.out.println("test a spider with a spider reference: ");
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        System.out.println();
        System.out.println("test a spider with an animal reference: ");
        a = new Spider();
        a.eat();
        a.walk();
        
        Pet p;
        System.out.println();
        System.out.println("test a cat with a cat reference:");
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();
        
        System.out.println();
        System.out.println("test a cat with an animal reference:");
        a = new Cat();
        a.eat();
        a.walk();
        
        System.out.println();
        System.out.println("test a cat with a pet reference:");
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();
        
        System.out.println();
        System.out.println("test a fish with a fish reference:");
        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();
        
        System.out.println();
        System.out.println("test a fish with an animal reference:");
        a = new Fish();
        a.eat();
        a.walk();
        
        System.out.println();
        System.out.println("test playWithAnimal method:");
        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);
    }
    
    public static void playWithAnimal(Animal a) {
        // completed in practice
        if(a instanceof Pet) {
            Pet p = (Pet)a;
            p.play();
        } else {
            System.out.println("DANGER! Wild Animal");
        }
    }
    
}