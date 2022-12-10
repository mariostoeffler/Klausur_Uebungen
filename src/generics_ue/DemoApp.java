package generics_ue;

public class DemoApp {

    public static void main(String[] args) {
        EventKalender eventKalender = new EventKalender();
        eventKalender.addEvent(new Event("SpongeBob", "Graz", 342));
        eventKalender.addEvent(new Event("KnighRider", "Salzburg", 313));
        eventKalender.addEvent(new Event("Metallica", "Innsbruck", 123));
        eventKalender.addEvent(new Event("Hans Zimmer", "Wien", 76));
        eventKalender.addEvent(new Event("Metallica", "Prag", 132));
        eventKalender.addEvent(new Event("ACDC", "Prag", 180));

        System.out.println(eventKalender.getByTitle("Metallica"));
        System.out.println(eventKalender.getByOrt("Prag"));
        System.out.println("--Eintrittspreis--");
        System.out.println(eventKalender.getByEintrittsPreis(130,313));
        System.out.println("--letzte Preis--");
        System.out.println(eventKalender.getMostExpensiveByOrt("Prag"));
        System.out.println("--avg--");
        System.out.println("Der durchschnittliche Eintrittspreis fuer Salzburg ist " + eventKalender.getAvgPreisByOrt("Salzburg"));
    }


}
