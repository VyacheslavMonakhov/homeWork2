package Lesson1.Participant;

public class Robot implements Participant {

    private final String name;
    private final int jumpHeight;
    private final int maxRunLength;

    public Robot (String name, int jumpHeight, int maxRunLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxRunLength = maxRunLength;
    }

    @Override
    public int jump() {
        System.out.printf("Робот %s бежит  дистанцию %d%n", name, maxRunLength);
        return maxRunLength;
    }

    @Override
    public int run() {
        System.out.printf("Робот %s делает  прыжок %d%n", name, jumpHeight);
        return jumpHeight;
    }
    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", jumpHeight=" + jumpHeight +
                ", maxRunLength=" + maxRunLength +
                '}';
    }
}
