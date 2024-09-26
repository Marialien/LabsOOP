//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class NumberList {

    public static void main(String[] args) {
        // 1. Створення чисел різних типів
        int integerNumber = 10;
        double doubleNumber = 15.75;
        long longNumber = 5000000000L;
        float floatNumber = 3.14f;
        BigInteger bigIntegerNumber = new BigInteger("123456789012345678901234567890");
        BigDecimal bigDecimalNumber = new BigDecimal("9876543210.12345678901234567890");

        // 2. Додавання чисел до списку
        List<Number> numberList = new ArrayList<>();
        numberList.add(integerNumber);
        numberList.add(doubleNumber);
        numberList.add(longNumber);
        numberList.add(floatNumber);
        numberList.add(bigIntegerNumber);
        numberList.add(bigDecimalNumber);

        // 3. Виведення чисел у форматі цілих чисел
        System.out.println("Цілі числа:");
        for (Number num : numberList) {
            if (num instanceof Integer || num instanceof Long || num instanceof BigInteger) {
                System.out.println(num);
            }
        }

        // 4. Виведення чисел у форматі дробових чисел
        System.out.println("Дробові числа:");
        for (Number num : numberList) {
            if (num instanceof Double || num instanceof Float || num instanceof BigDecimal) {
                System.out.println(num);
            }
        }

        // 5. Знаходження добутку перших п'яти чисел у списку
        BigDecimal product = BigDecimal.ONE;
        for (int i = 0; i < 5; i++) {
            if (numberList.get(i) instanceof BigDecimal) {
                product = product.multiply((BigDecimal) numberList.get(i));
            } else if (numberList.get(i) instanceof BigInteger) {
                product = product.multiply(new BigDecimal((BigInteger) numberList.get(i)));
            } else {
                product = product.multiply(new BigDecimal(numberList.get(i).toString()));
            }
        }
        System.out.println("Добуток перших п'яти чисел: " + product);
    }
}
