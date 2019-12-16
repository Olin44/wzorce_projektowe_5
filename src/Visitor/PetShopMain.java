package Visitor;

import java.util.ArrayList;

public class PetShopMain {
    public static void main(String[] args){

        Fish shark = new Fish("Shark", 100.0, false );
        Mammal monkey = new Mammal("Monkey", 232.32, true );
        Bird eagle = new Bird("Eagle", 21.37,true, 2137.0);
        Bird sparrow = new Bird("Sparrow ", 14.0,false, 88.0);
        Reptile tortoise = new Reptile("Tortoise", 986.0,true);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(shark);
        animals.add(monkey);
        animals.add(eagle);
        animals.add(sparrow);
        animals.add(tortoise);


        OfficialPriceVisitor officialPriceVisitor = new OfficialPriceVisitor();
        DarkMarketPriceVisitor darkMarketPriceVisitor = new DarkMarketPriceVisitor();
        VetVisitor vetVisitor = new VetVisitor();

        for(Animal animal : animals){
            System.out.println(animal.toString());
            animal.accept(officialPriceVisitor);
            animal.accept(darkMarketPriceVisitor);
            animal.accept(vetVisitor);
        }

        System.out.println(officialPriceVisitor.getTotalOfficialPrice());
        System.out.println(darkMarketPriceVisitor.getTotalOfficialPrice());

    }
}

