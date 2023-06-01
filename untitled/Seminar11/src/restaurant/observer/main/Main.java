package restaurant.observer.main;

import restaurant.observer.model.Client;
import restaurant.observer.model.IClient;
import restaurant.observer.model.IRestaurant;
import restaurant.observer.model.Restaurant;

public class Main {
    public static void main(String[] args) {
        IClient client1 = new Client("George");
        IClient client2 = new Client("Radu");
        IClient client3 = new Client("Alin");

        Restaurant restaurant = new Restaurant("Alpacino");

        restaurant.introduceOfertaNoua();

        restaurant.abonareClient(client1);

        restaurant.adaugaDiscount(25);

        restaurant.abonareClient(client2);
        restaurant.abonareClient(client3);
        restaurant.dezabonareClient(client1);

        restaurant.introduceOfertaNoua();
    }
}
