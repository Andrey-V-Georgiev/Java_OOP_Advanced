package _01_InterfacesAndAbstractionLAB._02_CarShopExtended;

public interface Rentable extends Car {
    Integer getMinRentDay();
    Double getPricePerDay();
}
