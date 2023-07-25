package org.webler.practice_3;

public class Photo implements Qualified {

    private String name;
    private Quality quality;

    public Photo(String name, Quality quality) {
        this.name = name;
        this.quality = quality;
    }

    public Photo(String name) {
        this(name, Quality.NO_STAR);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Quality getQuality() {
        return quality;
    }

    @Override
    public void setQuality(Quality quality) {
        this.quality = quality;
    }
}
