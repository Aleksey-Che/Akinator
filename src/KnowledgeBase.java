public class KnowledgeBase {
    public static Node init() {
        Node root = new Node();
        root.ask = "Большое?";

        Node swim = new Node();
        swim.ask = "Плавает?";
        root.yes = swim;

        Node eleph = new Node();
        eleph.ask = "Слон?";
        swim.no = eleph;

        Node kit = new Node();
        kit.ask = "Кит?";
        swim.yes = kit;

        Node voice = new Node();
        voice.ask = "Мяукает?";
        root.no = voice;

        Node cat = new Node();
        cat.ask = "Кошка?";
        voice.yes = cat;

        Node dog = new Node();
        dog.ask = "Собака?";
        voice.no = dog;

        return root;

    }
}
