package _04_GenericsEX._03_GenericSwapMethodString;

public class Box<T>{
    private T storage;

    public Box(T t){
        this.setStorage(t);
    }

    private void setStorage(T storage) {
        this.storage = storage;
    }

    @Override
    public String toString(){
        return String.format("java.lang.String: %s", this.storage );
    }
}
