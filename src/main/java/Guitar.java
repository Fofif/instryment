public class Guitar implements Instryment{
    int kolvo;

    @Override
    public void play() {
        System.out.println("Играет гитара с " + kolvo+ " струн.");
    }
}
