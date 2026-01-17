package input;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput {

    private static final Scanner scanner = new Scanner(System.in);

    public static String readTheme() {
        System.out.print("Enter meeting theme: ");
        return scanner.nextLine();
    }

    public static String readDescription() {
        System.out.print("Enter description: ");
        return scanner.nextLine();
    }

    public static String readSummary() {
        System.out.print("Enter summary: ");
        return scanner.nextLine();
    }

    public static List<Participant> readParticipants() {
        System.out.print("Enter participants (comma separated): ");
        String input = scanner.nextLine();

        List<Participant> participants = new ArrayList<>();
        String[] names = input.split(",");

        for (String name : names) {
            participants.add(new Participant(name.trim()));
        }

        return participants;
    }

    public static List<IMeta> readMetas() {
        System.out.print("Enter extra infos (comma separated): ");
        String input = scanner.nextLine();

        List<IMeta> metas = new ArrayList<>();
        String[] values = input.split(",");

        for (String value : values) {

            System.out.print("Priority for meta \"" + value.trim() + "\" (1-5): ");
            int priority = Integer.parseInt(scanner.nextLine());

            System.out.print("Deadline (YYYY-MM-DD) or empty: ");
            String deadlineInput = scanner.nextLine();

            LocalDate deadline = deadlineInput.isEmpty()
                    ? null
                    : LocalDate.parse(deadlineInput);

            metas.add(new Meta(value.trim(), priority, deadline));
        }

        return metas;
    }

    public static Relator readRelator() {
        System.out.print("Enter relator name: ");
        return new Relator(scanner.nextLine());
    }

    public static Moderator readModerator() {
        System.out.print("Enter moderator name: ");
        return new Moderator(scanner.nextLine());
    }
}
