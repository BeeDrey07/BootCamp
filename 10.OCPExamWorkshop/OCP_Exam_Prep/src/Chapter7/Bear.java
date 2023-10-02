package Chapter7;

public class Bear implements Herbivore, Omnivore{
    public void eatPlants() {

    }
}

interface Herbivore { public void eatPlants();}

interface Omnivore {public void eatPlants();}
