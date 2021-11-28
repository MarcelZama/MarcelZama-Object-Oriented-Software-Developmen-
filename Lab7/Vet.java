public class Vet{
    private String name;

    Vet(String name){
        this.name = name;
    }

    public void vaccinate(Animal animal){
        System.out.println(name + " is vaccinating...");

        if(animal instanceof Dog)
            {
                System.out.println("Dog is been vaccinated: " + animal);
            }
        else if (animal instanceof Cat)
            {
                System.out.println("Cat is been vaccinated: " + animal);
            }
        else
            {
                System.out.println("Can't vaccinate anything other than dogs or cats!");
            }
    }

    
}