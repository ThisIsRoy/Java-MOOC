import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> database;

    public Database() {
        this.database = new ArrayList<Bird>();
    }

    public void addBird(Bird bird) {
        this.database.add(bird);
    }

    public int observeBird(String birdName) {
        for (Bird bird: this.database) {
            if (birdName.equals(bird.name())) {
                bird.observe();
                return 1;
            }
        }

        return 0;
    }

    public void showBird(String birdName) {
        for (Bird bird: this.database) {
            if (birdName.equals(bird.name())) {
                System.out.println(bird);
                return;
            }
        }

        System.out.println("Is not a bird!");
    }

    public void printBirds() {
        for (Bird bird: this.database) {
            System.out.println(bird);
        }
    }
}
