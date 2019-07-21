package packages;

public enum Color {
    RED("czerwony"),
    YELLOW("żółty"),
    GREEN("zielony");

    public String value;
    Color(String value) {
        this.value = value;
    }

    public static Color getColor(String value) {
        switch(value) {
            case "czerwony":
                return RED;
            case "żółty":
                return YELLOW;
            case "zielony":
                return GREEN;
            default:
                // todo obsługa, jeżeli nie ma takiego enuma
                return RED;
        }
    }
}