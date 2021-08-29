package io.zipcoder.polymorphism;

public class pets {

    public void speak(){
        System.out.print("Your ");
    }
}
class Dog extends pets {
    public void speak(){
        System.out.print("dog says 'woof!'");
    }
}
class Cat extends pets{
    public void speak(){
        System.out.print("cat says 'meow!'");
    }
}  
class Parrot extends pets{
    public void speak(){
        System.out.print("parrot says 'whatever!'");
    }
}

