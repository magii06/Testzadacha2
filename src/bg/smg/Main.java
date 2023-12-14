package bg.smg;

public class Main {
    public static void main(String[] args){
        Penguin penguin = new Penguin();
        Bird bird = new Bird();

        AnimalHouse<Animal> animalHouse = new AnimalHouse<>();
        animalHouse.animal = penguin;
        animalHouse.animal = bird;
        AnimalHouse<Penguin> penguinHouse= new AnimalHouse<>();
        penguinHouse.animal=penguin;
        AnimalHouse<Bird> birdHouse= new AnimalHouse<>();
        birdHouse.animal=bird;
    }
}
