package week6.BirdWatcherDatabase;

import java.util.ArrayList;
import java.util.List;

class BirdDatabase {
    private List<Bird> birds;

    public BirdDatabase() {
        birds = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public void observeBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.observe();
                return;
            }
        }
        System.out.println("It is not a bird!");
    }

    public void printStatistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void showBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Bird not found!");
    }
}
