public class Truba implements Instryment{
    int dima;

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " +dima+ "(см).");
    }
}
