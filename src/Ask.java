import java.util.Scanner;

public class Ask {

    public static void wantPlay() {

        String answer;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            answer = scanner.nextLine();

            if (answer.toLowerCase().equals("нет")) {
                System.out.println("Жаль, что н удалось сыграть :( До встречи!");
                System.exit(0);

            } else if (answer.toLowerCase().equals("да")) {
                System.out.println("Начинаем игру!");
                System.out.println("Загадайте любое животное. Помните, отвечать нужно только ДА или НЕТ");
                break;

            } else {
                System.out.println("Нужно ответить ДА или НЕТ");
                wantPlay();

            }
        }
    }

    public static boolean askQuest(String txt, Scanner inp) {

        System.out.println(txt + " (ДА / НЕТ) ");
        String resp = inp.nextLine();
        return resp.toLowerCase().equals("да");

    }
}
