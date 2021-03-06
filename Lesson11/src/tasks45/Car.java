package tasks45;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Car implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String brand;
    private int maxSpeed;
    private int price;

    @Override
    public String toString() {
        return "Это автомобиль " +
                "марки " + brand + ". " +
                "Максимальная скорость составляет " + maxSpeed + " км/ч. " +
                "Цена " + price + " $.";
    }
}
