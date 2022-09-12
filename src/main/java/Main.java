
public class Main {
    public static void main(String[] args) {
        Guitar gui1 = new Guitar();
        gui1.kolvo = 6;

        Baraban bar1 = new Baraban();
        bar1.Size = 26;

        Truba tru1 = new Truba();
        tru1.dima = 25;

        Instryment[] mas1 = { gui1, bar1, tru1};

        for (int i = 0; i < mas1.length; i++){
            mas1[i].play();

        }
    }

}
