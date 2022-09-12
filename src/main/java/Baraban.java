public class Baraban implements Instryment{
    int Size;

    @Override
    public void play() {
        System.out.println("Играет барабан с размером " + Size+ ".");
    }
}
