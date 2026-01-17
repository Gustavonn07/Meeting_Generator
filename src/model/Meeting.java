package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Meeting {

    private final String theme;
    private final String description;
    private final String summary;

    private final LocalDate date;
    private final LocalTime time;

    private final List<Participant> participants;
    private final List<IMeta> metas;
    private final Relator relator;
    private final Moderator moderator;

    public Meeting(
            String theme,
            String description,
            String summary,
            List<Participant> participants,
            List<IMeta> metas,
            Relator relator,
            Moderator moderator
    ) {
        this.theme = theme;
        this.description = description;
        this.summary = summary;
        this.participants = participants;
        this.metas = metas;
        this.relator = relator;
        this.moderator = moderator;
        this.date = LocalDate.now();
        this.time = LocalTime.now();
    }

    public Moderator getModerator() {
        return moderator;
    }

    public String getTheme() {
        return theme;
    }

    public String getDescription() {
        return description;
    }

    public String getSummary() {
        return summary;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public List<IMeta> getMetas() {    // ← interface
        return metas;
    }

    public Relator getRelator() {
        return relator;
    }
}
