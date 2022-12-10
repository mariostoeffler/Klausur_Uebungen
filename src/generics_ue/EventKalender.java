package generics_ue;

import java.util.ArrayList;
import java.util.Collections;

public class EventKalender {

    private ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event e) {
        events.add(e);
    }

    public Event getByTitle(String title) {
        for (Event event : events) {
            if (event.getTitle().equals(title)) {
                return event;
            }
        }
        return null;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> events1 = new ArrayList<>();
        for (Event event : events) {
            if (event.getOrt().equals(ort)) {
                events1.add(event);
            }
        }
        return events1;
    }

    public ArrayList<Event> getByEintrittsPreis(double min, double max) {
        ArrayList<Event> events1 = new ArrayList<>();
        for (Event event : events) {
            if (event.getEintrittsPreis() >= min && event.getEintrittsPreis() <= max) {
                events1.add(event);
            }

        }
        return events1;
    }

    public Event getMostExpensiveByOrt(String ort) {
        Event mostExpensive = null;
        double letztePreis = 0;

        for (Event event : events) {
            {
                if (event.getEintrittsPreis() >= letztePreis && event.getOrt().equals(ort)) {
                    letztePreis = event.getEintrittsPreis();
                    mostExpensive = event;
                }
            }

        }
        return mostExpensive;
    }

    public double getAvgPreisByOrt(String ort) {
        double summeEintritt = 0;
        double avg = 0;
        int count = 0;
        for (Event event : events) {
            if (event.getOrt().equals(ort)) {
                summeEintritt = summeEintritt + event.getEintrittsPreis();
                count++;
            }
        }
        avg = summeEintritt / count;
        return avg;
    }
}