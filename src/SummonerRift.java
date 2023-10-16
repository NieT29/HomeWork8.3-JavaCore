import java.time.LocalDateTime;
import java.util.ArrayList;

public class SummonerRift {
    private ArrayList<SKT> sktTeam;
    private ArrayList<G2> g2Team;
    private LocalDateTime timeMatch;

    public SummonerRift(ArrayList<SKT> sktTeam, ArrayList<G2> g2Team, LocalDateTime timeMatch) {
        this.sktTeam = sktTeam;
        this.g2Team = g2Team;
        this.timeMatch = timeMatch;
    }

    @Override
    public String toString() {
        return "SummonerRift{" +
                "sktTeam=" + sktTeam +
                ", g2Team=" + g2Team +
                ", timeMatch=" + timeMatch +
                '}';
    }
}
