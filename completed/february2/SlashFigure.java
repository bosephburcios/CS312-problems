package completed.february2;

public class SlashFigure {
    public static void main(String[] args) {
        for (int a = 0; a < 6; a++) {
            for (int b = 0; b < (a * 2); b++) {
                System.out.print("\\");
            }
            for (int c = (4 * a); c < 22; c++) {
                System.out.print("!");
            }
            for (int d = 0; d < (a * 2); d++) {
                System.out.print("/");
            }
            System.out.println();
        }
    }
}