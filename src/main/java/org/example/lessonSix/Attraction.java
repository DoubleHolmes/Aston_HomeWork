package org.example.lessonSix;

public class Attraction {

    public String name;
    public String timeStartWorking;
    public String timeFinishedWorking;
    public double coast;

    public Attraction(String name, String timeStartWorking, String timeFinishedWorking, double coast) {
        this.name = name;
        this.timeStartWorking = timeStartWorking;
        this.timeFinishedWorking = timeFinishedWorking;
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "\nНазвание аттракциона: " + name +
                "\nНачало работы: " + timeStartWorking +
                "\nКонец работы: " + timeFinishedWorking +
                "\nСтоимость:" + coast;
    }
}
