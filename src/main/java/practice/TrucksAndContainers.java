package practice;

import java.util.Scanner;

public class TrucksAndContainers {
    private static final int CONTAINER_CAPACITY = 27;
    private final static int TRUCK_CAPACITY = 12;

    public static void main(String[] args) {
        int trucksCount = 0;
        int containersCount =0 ;
        String sep = System.lineSeparator();

        Scanner scanner = new Scanner(System.in);
        int boxes = scanner.nextInt();

        if (boxes > 0) {
            trucksCount++;
            containersCount++;
            System.out.println("Грузовик: " + trucksCount);
            System.out.println("\tКонтейнер: " + containersCount);

            for (int i = 1; i <= boxes; i++) {
                System.out.println("\t\tЯщик: " + i);

                if (i % (TRUCK_CAPACITY * CONTAINER_CAPACITY) == 0 && i!=boxes) {
                    trucksCount++;
                    System.out.println("Грузовик: " + trucksCount);
                }

                if (i % CONTAINER_CAPACITY == 0 && i!=boxes) {
                    containersCount++;
                    System.out.println("\tКонтейнер: " + containersCount);
                }
            }
        }
        System.out.println("Необходимо:" + sep +
                "грузовиков - " + trucksCount + " шт." + sep +
                "контейнеров - " + containersCount + " шт.");
    }
}
