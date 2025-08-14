package Day_1;
public class Animal {
    
    void bark(){
        System.out.println("Animal sound");
    }

    public static void main(String[] args){
        Animal animalObj = new Animal();

        animalObj.bark();
    }
}
