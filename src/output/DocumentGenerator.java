package output;

import model.IMeta;
import model.Meeting;
import model.Participant;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DocumentGenerator {

    public static void generate(Meeting meeting) {

        String fileName = "meeting_minutes.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {

            writer.println("===== MEETING MINUTES =====");
            writer.println("Theme: " + meeting.getTheme());
            writer.println("Date: " + meeting.getDate());
            writer.println("Time: " + meeting.getTime());

            writer.println("\nModerator:");
            writer.println("- " + meeting.getModerator().getName());

            writer.println("\nRelator:");
            writer.println("- " + meeting.getRelator().getName());

            writer.println("\nParticipants:");
            for (Participant participant : meeting.getParticipants()) {
                writer.println("- " + participant.getName());
            }

            writer.println("\nDescription:");
            writer.println(meeting.getDescription());

            writer.println("\nSummary:");
            writer.println(meeting.getSummary());

            writer.println("\nMetas:");
            for (IMeta meta : meeting.getMetas()) {
                writer.println("- " + meta.getDescription());
                writer.println("  Priority: " + meta.getPriority());
                writer.println("  Deadline: " + meta.getDeadline());
                writer.println("  Completed: " + meta.isCompleted());
            }

            System.out.println("File generated successfully: " + fileName);

        } catch (IOException e) {
            System.out.println("Error generating file: " + e.getMessage());
        }
    }
}
