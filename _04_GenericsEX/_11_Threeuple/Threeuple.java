package _04_GenericsEX._11_Threeuple;

public class Threeuple <A,B,C> {
    private A first;
    private B second;
    private C third;

    public Threeuple(A first, B second, C third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.first, this.second, this.third);
    }
}
