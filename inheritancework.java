// A program to show person's actions by the use of inheritance, classes, and interfaces.
interface Animalactivities {
    void eat();
    void climb(); 
        
    }


class Animal {
    void hunt(){
   System.out.println("Animal hunts");
     }   
    
}

class AnimalExample extends Animal implements Animalactivities {
    void eatprey() {
        System.out.println("animal is feeding");
    }

    public void climb() {
        System.out.println("animal is climbing");
    }

    public void run() {
        System.out.println("animal is running");
    }
    public void eat(){
    System.out.println("animal is eating");
    }    
    public static void main(String args[]) {
        AnimalExample animal = new AnimalExample();
        animal.eatprey();   // Call the eatprey method
        animal.climb();       // Call the climb method from the AnimalExample class
        animal.hunt();       // Call the hunt method from the Animal class
        animal.run();      // Call the run method from the AnimalExample class
        animal.eat();      // call the eat method from the AnimalActivities interface 
    }
}