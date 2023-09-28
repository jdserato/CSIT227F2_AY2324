package Sept05;

public interface Diver {
    final int max_meters = 1000;
    default void dive(int meters) {
        System.out.println("Im diving YEYEYYEYE in " + meters + " m");
    }
}
