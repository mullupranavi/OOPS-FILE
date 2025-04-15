interface Playable {
    abstract void play();
}
class Football implements Playable {
    public void play() {
        System.out.println("some people play football in the Ground.");
    }
}
class Volleyball implements Playable {
    public void play() {
        System.out.println("some people play volleyball in the Stadium.");
    }
}
class Basketball implements Playable {
    public void play() {
        System.out.println("some people play basket ball in the Rain.");
    }
}
