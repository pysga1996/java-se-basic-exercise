package common;

public interface Exercise {

    void start();

    default void finalize() {
        System.out.println("Exercise done!");
    }

}
