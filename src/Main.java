import input.ConsoleInput;
import model.Meeting;
import output.DocumentGenerator;

public class Main {

    public static void main(String[] args) {

        String theme = ConsoleInput.readTheme();
        var participants = ConsoleInput.readParticipants();
        String description = ConsoleInput.readDescription();
        String summary = ConsoleInput.readSummary();
        var metas = ConsoleInput.readMetas();

        var moderator = ConsoleInput.readModerator();
        var relator = ConsoleInput.readRelator();

        Meeting meeting = new Meeting(
                theme,
                description,
                summary,
                participants,
                metas,
                relator,
                moderator
        );

        DocumentGenerator.generate(meeting);
    }
}
