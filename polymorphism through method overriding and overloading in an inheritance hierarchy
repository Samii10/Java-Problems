public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal= new Animal();
        myAnimal.eat();

        dog myDog= new dog();
        myDog.eat(3);

        cat myCat= new cat();
        myCat.eat();
    }
}

 class Animal{
    public void  eat(){
        System.out.println("munch");
    }
}

class dog extends Animal{
    public void eat(){
        System.out.println("Chomp chomp");
    }

    public void eat(int numberOfTimes){
        for(int i=0; i<numberOfTimes; i++){
            System.out.println("Chomp Chomp");
        }

    }
    private int breed;

    public int getBreed(){
        return breed;
    }
   public void setBreed(int breed){
        this.breed=breed;
   }

}
class cat extends Animal{

}
