package test_exam_2.java_collections;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {


    private static List<String> CPUs = List.of("AMD EPYC 9654", "AMD EPYC 9554P", "AMD EPYC 9474F",
            "AMD Ryzen Threadripper PRO 5995WX", "Intel Core i9-12900", "Intel Core i7-12700KF",
            "Intel Core i7-13700HX", "AMD Ryzen Threadripper PRO 3945WX", "Intel Core i7-13700T", "AMD Ryzen 9 7940HS",
            "Intel Core i5-13600HX", "Intel Core i7-13700H", "Intel Core i5-6600K", "Intel Core i5-8600K",
            "Intel Core i5-9600K");

    private static List<String> GPUs = List.of("GeForce RTX 4090", "GeForce RTX 4080", "GeForce RTX 4070",
            "GeForce RTX 4060", "GeForce RTX 3090", "GeForce RTX 3080", "GeForce RTX 3070", "GeForce RTX 3060", "GeForce RTX 2080",
            "GeForce RTX 2070", "GeForce RTX 2060", "Radeon RX 7600S", "Radeon RX 7600M", "Radeon RX 7600", "Radeon RX 7600M XT",
            "Radeon RX 7700S");

    private static List<Integer> RAMs = List.of(8, 16, 32, 64);
    private static List<Integer> StorageCapacity = List.of(512, 1024, 2048, 4096);
    private static List<StorageType> storageTypes = List.of(StorageType.SSD, StorageType.HDD);

    public static <T> T getRandomElementFromList(List<T> list) {
        Random rnd = new Random();
        int nextInt = rnd.nextInt(0, list.size());
        return list.get(nextInt);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Set<Computer> computerSet = new HashSet<>();

        while(computerSet.size() < 100){
            UUID uuid = UUID.randomUUID();

            computerSet.add(new Computer(
                    UUID.randomUUID().toString().split("-")[4],
                    getRandomElementFromList(CPUs),
                    getRandomElementFromList(GPUs),
                    getRandomElementFromList(RAMs),
                    getRandomElementFromList(StorageCapacity),
                    getRandomElementFromList(storageTypes)
            ));

        }
        new Computer("4e4d822d880e","Intel Core i7-13700T","GeForce RTX 3060",32,4096,StorageType.HDD);

        System.out.println(computerSet);





    }


}
