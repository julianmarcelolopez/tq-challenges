import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MeetingTimeFinder {

    public static void main(String[] args) {
        List<Interval> person1Availability = new ArrayList<>();
        person1Availability.add(new Interval(LocalTime.of(9, 0), LocalTime.of(10, 0)));
        person1Availability.add(new Interval(LocalTime.of(11, 0), LocalTime.of(12, 30)));
        person1Availability.add(new Interval(LocalTime.of(14, 0), LocalTime.of(15, 30)));

        List<Interval> person2Availability = new ArrayList<>();
        person2Availability.add(new Interval(LocalTime.of(9, 30), LocalTime.of(10, 30)));
        person2Availability.add(new Interval(LocalTime.of(12, 0), LocalTime.of(14, 30)));
        person2Availability.add(new Interval(LocalTime.of(15, 0), LocalTime.of(17, 0)));

        List<Interval> availableSlots = findAvailableSlots(person1Availability, person2Availability, 30);

        System.out.println("Horarios disponibles para reunión:");
        for (Interval slot : availableSlots) {
            System.out.println(slot.getStart() + " - " + slot.getEnd());
        }
    }

    public static List<Interval> findAvailableSlots(List<Interval> person1Availability, List<Interval> person2Availability, int minDuration) {
        List<Interval> availableSlots = new ArrayList<>();

        // Implementa la lógica para encontrar los slots de tiempo disponibles.
        // Devuelve una lista con los slots de tiempos disponibles.
        return availableSlots;
    }

    static class Interval {
        private LocalTime start;
        private LocalTime end;

        public Interval(LocalTime start, LocalTime end) {
            this.start = start;
            this.end = end;
        }

        public LocalTime getStart() {
            return start;
        }

        public LocalTime getEnd() {
            return end;
        }
    }
}