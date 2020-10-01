import java.util.Scanner;

public class Game {
    public static void gameLogic(Node root, Scanner inp) {

        String animal;
        String differences;
        Node current;
        Node prev = null;
        boolean isYes = true;

        while (true) {             // новый тайм
            current = root;

            while (true) {
                if (Ask.askQuest(current.ask, inp)) {                            // Ответ на тек. вопрос "Y"
                    if (current.yes == null) {
                        System.out.println("Я выиграла!");
                        if (Ask.askQuest("Продолжим? ", inp)) {
                            break;
                        } else {
                            return;
                        }
                    } else {
                        prev = current;
                        isYes = true;
                        current = current.yes;
                    }
                } else {                          // Ответ на тек вопрос "N"
                    if (current.no == null) { // Не удалось...
                        System.out.println("Я проиграла! :( Как называется загаданное Вами животное?");
                        animal = inp.nextLine();
                        System.out.println("Чем " + animal + " отличается от " + current.ask);
                        differences = inp.nextLine();

                        Node newQuest = new Node();
                        newQuest.ask = differences + "?";

                        Node newAnimal = new Node();
                        newAnimal.ask = animal;

                        newQuest.yes = newAnimal;
                        newQuest.no = current;

                        if (isYes) {
                            prev.yes = newQuest;
                        } else {
                            prev.no = newQuest;
                        }
                        if (Ask.askQuest("Продолжим? ", inp)) {
                            break;
                        } else {
                            return;
                        }
                    } else {
                        prev = current;
                        isYes = false;
                        current = current.no;
                    }
                }
            }
        }
    }
}
