package input;

import model.Meta;
import model.Participant;
import model.Relator;

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

    public static List<Meta> readMetas() {
        System.out.print("Enter metas (comma separated): ");
        String input = scanner.nextLine();

        List<Meta> metas = new ArrayList<>();
        String[] values = input.split(",");

        for (String value : values) {
            metas.add(new Meta(value.trim()));
        }

        return metas;
    }

    public static Relator readRelator() {
        System.out.print("Enter relator name: ");
        return new Relator(scanner.nextLine());
    }
}
