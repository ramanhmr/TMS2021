package car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String brand;
    private double speed;
    private double price;

    public void start() throws FailedToStartException {
        Random random = new Random();
        if (random.nextInt(21) % 2 == 0) {
            throw new FailedToStartException("Не удалось завести " + brand);
        } else {
            System.out.println("Автомобиль " + brand + " завёлся");
        }
    }
}
