package tests.suppliers;

import io.qameta.allure.Description;
import mainPackage.config.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.*;

public class SupplierTests extends BaseTest {
    @Test
    @Description("simple supplier test with math random")
    void simpleSupplierTest() {
        Supplier<Double> doubleSupplier = () -> Math.random();
        System.out.println(doubleSupplier.get());
    }

    @Test
    @Description("doubleSupplier test")
    void doubleSupplierTest() {
        DoubleSupplier doubleSupplier = Math::random;
        System.out.println(doubleSupplier.getAsDouble());
    }

    @Test
    @Description("IntSupplier test")
    void intSupplierTest() {
        IntSupplier intSupplier = () -> ThreadLocalRandom.current().nextInt(0, 6547831);
        System.out.println(intSupplier.getAsInt());
    }

    @Test
    @Description("LongSupplier test")
    void longSupplierTest() {
        LongSupplier longSupplier = () ->  ThreadLocalRandom.current().nextLong();
        System.out.println(longSupplier.getAsLong());
    }

    @Test
    @Description("BooleanSupplier test")
    void booleanSupplierTest() {
        BooleanSupplier booleanSupplier = () -> ThreadLocalRandom.current().nextBoolean();
        System.out.println(booleanSupplier.getAsBoolean());
    }

    @Test
    @Description("Supplier to uppercase test")
    void supplierToUpperCaseTest () {
        String t = "One";
        Supplier<String> supplierString = () -> t.toUpperCase();
        System.out.println(supplierString.get());
    }

}
