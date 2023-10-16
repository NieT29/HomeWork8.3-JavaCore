import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thời gian bắt đầu trận đấu (yyyy/MM/dd HH:mm:ss) ");
        String timeStart = scanner.nextLine();
        LocalDateTime timeMatch = LocalDateTime.parse(timeStart, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        ArrayList<SKT> sktTeam = new ArrayList<>();
        System.out.println("Mời bạn nhập thông tin team SKT ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Mời bạn nhập tên tướng thứ "+(i+1));
            String nameFigure = scanner.nextLine();
            System.out.println("Mời bạn nhập tên vị trí thứ "+(i+1));
            String position = scanner.nextLine();

            SKT skt = new SKT(nameFigure,position);
            sktTeam.add(skt);
        }

        ArrayList<G2> g2team = new ArrayList<>();
        System.out.println("Mời bạn nhập thông tin team G2 ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Mời bạn nhập tên tướng thứ "+(i+1));
            String nameFigure = scanner.nextLine();
            System.out.println("Mời bạn nhập tên vị trí thứ "+(i+1));
            String position = scanner.nextLine();

            G2 g2 = new G2(nameFigure,position);
            g2team.add(g2);
        }
        SummonerRift summonerRift = new SummonerRift(sktTeam,g2team,timeMatch);
        System.out.println(summonerRift);
    }
}
