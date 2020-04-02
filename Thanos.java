import java.util.ArrayList;
import java.util.Collections;

public class Thanos {

    public static void main(String[] args) {

        Hero blackWidow = new Hero("Black Widow",34);
        Hero captainAmerica = new Hero ("Captain America", 100);
        Hero vision = new Hero ("Vision", 3);
        Hero ironMan = new Hero ("Iron Man", 48);
        Hero scarletWitch = new Hero ("Scarlet Witch", 29);
        Hero thor = new Hero("Thor", 1500);
        Hero hulk = new Hero("Hulk", 49);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        ArrayList<Hero> heroes = new ArrayList<>();
        heroes.add(blackWidow);
        heroes.add(captainAmerica);
        heroes.add(vision);
        heroes.add(ironMan);
        heroes.add(scarletWitch);
        heroes.add(thor);
        heroes.add(hulk);
        heroes.add(doctorStrange);

        // Thor's birthday
        thor.setAge(1501);
        System.out.println("It's Thor's birthday! Thor is now " + thor.getAge() + " years old.\n");

        // random array sorting
        Collections.shuffle(heroes);

        // Finger Snap
        int population = heroes.size();
        int halfPopulation = population/2;
        for (int person = population - 1; person >= halfPopulation; person--){
            heroes.remove(person);
        }

        // Survivors display
        System.out.println("Afer the Snap, the Avengers who survived are:");
        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }
    }
}