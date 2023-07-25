package org.webler.practice_3;

import java.io.FileNotFoundException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //EmailGenerator.createMails();

        /*
        PhotoCollection photoCollection = new PhotoCollection();

        photoCollection.addPhoto(new Photo("Teszt foto 1", Quality.ONE_STAR));
        photoCollection.addPhoto(new Photo("Teszt foto 2", Quality.TWO_STAR));
        photoCollection.addPhoto(new Photo("Teszt foto 3"));

        photoCollection.listPhotos();

        photoCollection.starPhoto("Teszt foto 1",Quality.TWO_STAR);
        //photoCollection.starPhoto("Teszt foto 4",Quality.TWO_STAR);

        System.out.println(photoCollection.numberOfStars());
         */

        //int asd = Integer.parseInt("2023");

        LottoStatistic lottoStatistic = new LottoStatistic();

        System.out.println(lottoStatistic.mostFrequentNumber());
        System.out.println(lottoStatistic.leastFrequentNumber());
        lottoStatistic.highestPrize();
        System.out.println(lottoStatistic.myNumbers(Set.of(2,43,72,74,82)));
        lottoStatistic.longestPeriodWithoutWinning();

    }
}
