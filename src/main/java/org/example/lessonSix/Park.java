package org.example.lessonSix;

public class Park {

    public  Attraction attraction;

    public Park() {
    }

    public Park(Attraction attraction) {
        this.attraction = attraction;
    }

    @Override
    public String toString() {
        return "Park{" +
                "attraction=" + attraction +
                '}';
    }
}
