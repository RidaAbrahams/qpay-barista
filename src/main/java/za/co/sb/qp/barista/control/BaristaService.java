package za.co.sb.qp.barista.control;

import za.co.sb.qp.barista.entity.Coffee;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class BaristaService {

    private List<Coffee> listOfCoffees = new ArrayList<>();

    @PostConstruct
    public void setUpMockData() {
        Coffee coffee1 = Coffee.builder()
                .id(1L)
                .coffeeName("Ispirazione Napoli")
                .coffeeDescription("Intense, Exceptionally Dark & Creamy")
                .build();
        Coffee coffee2 = Coffee.builder()
                .id(1L)
                .coffeeName("Ispirazione Venezia")
                .coffeeDescription("Harmoniously Balanced & Thick Bodied")
                .build();
        Coffee coffee3 = Coffee.builder()
                .id(1L)
                .coffeeName("Cape Town Envivo Lungo")
                .coffeeDescription("Tread a Path: Potent & Roasted")
                .build();
        listOfCoffees.add(coffee1);
        listOfCoffees.add(coffee2);
        listOfCoffees.add(coffee3);
    }

    public List<Coffee> listCoffees() {
        return listOfCoffees;
    }
}
