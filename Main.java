import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tekst: ");
        String text = scanner.nextLine();

        System.out.print("Zamiana na duże tak na małe nie (tak/nie): ");
        boolean toUpperCase = scanner.nextLine().equalsIgnoreCase("tak");

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (toUpperCase) {
                c = Character.toUpperCase(c);
            } else {
                c = Character.toLowerCase(c);
            }
            result += c;
        }

        System.out.println("zamiana: " + result);
    }
}