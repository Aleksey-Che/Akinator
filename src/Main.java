import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в игру! Я угадаю любое животное, которое Вы загадаете! Сыграем?");
        Ask.wantPlay();
        Scanner inp = new Scanner(System.in);
        Node root = KnowledgeBase.init();
        Game.gameLogic(root, inp);
    }
}



