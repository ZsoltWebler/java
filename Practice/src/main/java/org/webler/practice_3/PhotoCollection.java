package org.webler.practice_3;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {

    private final List<Photo> photos = new ArrayList<>();

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public void starPhoto(String photoName, Quality quality) {

        var matchingPhotos = photos.stream().filter(photo -> photo.getName().equals(photoName)).toList();


        if (matchingPhotos.isEmpty()) {
            throw new PhotoNotFoundException();
        }

        matchingPhotos.get(0).setQuality(quality);
    }

    public void listPhotos() {

        for (Photo photo : photos) {


            System.out.print(photo.getName() + " - ");

            if (photo.getQuality() == Quality.ONE_STAR) {
                System.out.print("*");
            } else if (photo.getQuality() == Quality.TWO_STAR) {
                System.out.print("**");
            }

            System.out.println();


        }


    }

    public int numberOfStars() {

        return photos.stream().mapToInt(photo -> {
            if (photo.getQuality() == Quality.ONE_STAR) {
                return 1;
            } else if (photo.getQuality() == Quality.TWO_STAR) {
                return 2;
            }
            return 0;
        }).sum();

    }


}
