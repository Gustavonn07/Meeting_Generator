package output;

import model.Meeting;
import model.Meta;
import model.Participant;

public class DocumentGenerator {

    public static void generate(Meeting meeting) {

        System.out.println("\n===== MEETING MINUTES =====");
        System.out.println("Theme: " + meeting.getTheme());
        System.out.println("Date: " + meeting.getDate());
        System.out.println("Time: " + meeting.getTime());

        System.out.println("\nRelator:");
        System.out.println("- " + meeting.getRelator().getName());

        System.out.println("\nParticipants:");
        for (Participant p : meeting.getParticipants()) {
            System.out.println("- " + p.getName());
        }

        System.out.println("\nDescription:");
        System.out.println(meeting.getDescription());

        System.out.println("\nSummary:");
        System.out.println(meeting.getSummary());

        System.out.println("\nMetas:");
        for (Meta m : meeting.getMetas()) {
            System.out.println("- " + m.getDescription());
        }
    }
}
