package exercises.zad5G;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalHouse <T extends Animal> {
    private T [] animals;




}
