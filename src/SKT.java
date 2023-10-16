public class SKT {
    private String nameFigure;
    private String position;

    public SKT(String nameFigure, String position) {
        this.nameFigure = nameFigure;
        this.position = position;
    }

    @Override
    public String toString() {
        return "SKT{" +
                "nameFigure='" + nameFigure + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
