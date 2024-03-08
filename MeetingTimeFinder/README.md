
# Meeting Time Finder

## Descripción

Este desafío consiste en implementar una función que, dadas las agendas de dos personas y la duración mínima de una reunión, encuentre los horarios disponibles para que ambas personas se reúnan durante al menos 30 minutos consecutivos. Se te proporcionará la disponibilidad de ambas personas en forma de listas de rangos horarios ocupados.

## Ejemplo

```java
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
```

## Requisitos

Se debe tomar como entrada:

- La disponibilidad de la primera persona.
- La disponibilidad de la segunda persona.
- La duración mínima de una reunión (en minutos).
- El programa debe devolver como salida:

  - Una lista de horarios disponibles donde ambas personas puedan reunirse durante al menos la duración mínima especificada.
  Los horarios disponibles deben estar dentro del rango de tiempo especificado, desde las 9:00 hasta las 18:00 horas.

  - Los horarios disponibles deben tener al menos 30 minutos consecutivos libres.

## Ejemplo

### - Entrada:

    Disponibilidad de la persona 1: [(9:00, 10:00), (11:00, 12:30), (14:00, 15:30)]
    Disponibilidad de la persona 2: [(9:30, 10:30), (12:00, 14:30), (15:00, 17:00)]
    Duración mínima de una reunión: 30 minutos

### - Salida:

    Horarios disponibles para reunión: [(10:30, 11:00), (15:30, 16:00), (16:00, 16:30), (16:30, 17:00)]

## Notas

Ambas personas están disponibles de 9:30 a 10:00 horas, pero la duración mínima de la reunión es de 30 minutos, por lo que solo se consideran los horarios posteriores a las 9:30.
Los horarios disponibles deben estar dentro del rango de 9:00 a 18:00 horas.
Los horarios deben tener al menos 30 minutos consecutivos libres para ser considerados como disponibles.

## ¡Buena suerte!