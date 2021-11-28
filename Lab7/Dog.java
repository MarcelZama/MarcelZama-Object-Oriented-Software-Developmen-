public class Dog extends Animal {
    public Dog(String name,int age, char sex){
        super(name, age, sex);
    }
    public void makeSound(){
        System.out.println(name + " is barking...");
    }
}