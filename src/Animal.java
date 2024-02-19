public class Animal {
    private String birdNoise;

    public Animal(String birdNoise) {
        this.birdNoise = birdNoise;
    }

    public void makeNoise() {
        System.out.println(this.birdNoise);
    }
}
