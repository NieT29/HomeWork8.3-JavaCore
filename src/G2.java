public class G2 {
    private String nameFigure;
    private String position;

    public G2(String nameFigure, String position) {
        this.nameFigure = nameFigure;
        this.position = position;
    }

    @Override
    public String toString() {
        return "G2{" +
                "nameFigure='" + nameFigure + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
