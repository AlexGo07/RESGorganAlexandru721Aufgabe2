
import controller.CharaktereController;
import controller.ProdukteController;
import modele.Charaktere;
import modele.Produkte;
import repository.CharaktereRepository;
import repository.ProdukteRepository;
import ui.UI;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class of program
 */
public class Main {
    public static void main(String[] args) {
        CharaktereRepository charaktereRepository = new CharaktereRepository();
        ProdukteRepository produkteRepository = new ProdukteRepository();
        CharaktereController charaktereController = new CharaktereController(charaktereRepository);
        ProdukteController produkteController = new ProdukteController(produkteRepository);
        UI ui = new UI(produkteController, charaktereController);
        ui.menu();
        // Initialisierung der Produkte
        List<Produkte> produkte = new ArrayList<>();
        produkte.add(new Produkte("Mjolnir", 500.0, "Asgard"));
        produkte.add(new Produkte("Vibranium-Schild", 700.0, "Wakanda"));
        produkte.add(new Produkte("Infinity Gauntlet", 10000.0, "Titan"));
        produkte.add(new Produkte("Web-Shooter", 250.0, "Terra"));
        produkte.add(new Produkte("Arc-Reaktor", 1500.0, "Terra"));
        produkte.add(new Produkte("Norn Stones", 1200.0, "Asgard"));
        produkte.add(new Produkte("Quantum Suit", 3000.0, "Terra"));
        produkte.add(new Produkte("X-Gene Serum", 850.0, "X-Mansion"));
        produkte.add(new Produkte("Cosmic Cube", 9000.0, "Multiverse"));
        produkte.add(new Produkte("Darkhold", 2000.0, "Multiverse"));
        // Initialisierung der Charaktere
        List<Charaktere> charaktere = new ArrayList<>();

        Charaktere c1 = new Charaktere(1, "Thor", "Asgard");
        c1.kaufeProdukt(produkte.get(0)); // Mjolnir
        c1.kaufeProdukt(produkte.get(5)); // Norn Stones
        c1.kaufeProdukt(produkte.get(9)); // Darkhold

        Charaktere c2 = new Charaktere(2, "Black Panther", "Wakanda");
        c2.kaufeProdukt(produkte.get(1)); // Vibranium-Schild
        c2.kaufeProdukt(produkte.get(7)); // X-Gene Serum

        Charaktere c3 = new Charaktere(3, "Iron Man", "Terra");
        c3.kaufeProdukt(produkte.get(4)); // Arc-Reaktor
        c3.kaufeProdukt(produkte.get(6)); // Quantum Suit
        c3.kaufeProdukt(produkte.get(3)); // Web-Shooter

        Charaktere c4 = new Charaktere(4, "Spider-Man", "Terra");
        c4.kaufeProdukt(produkte.get(3)); // Web-Shooter
        c4.kaufeProdukt(produkte.get(8)); // Cosmic Cube

        Charaktere c5 = new Charaktere(5, "Doctor Strange", "Multiverse");
        c5.kaufeProdukt(produkte.get(9)); // Darkhold
        c5.kaufeProdukt(produkte.get(8)); // Cosmic Cube
        c5.kaufeProdukt(produkte.get(2)); // Infinity Gauntlet

        charaktere.add(c1);
        charaktere.add(c2);
        charaktere.add(c3);
        charaktere.add(c4);
        charaktere.add(c5);
    }
}

