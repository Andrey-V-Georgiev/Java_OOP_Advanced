package _03_GenericsLAB._03_GenericScale;

public class Scale <T extends Comparable<T>>{
    private T left;
    private T right;

    public Scale(T left, T right){
        this.setLeft(left);
        this.setRight(right);
    }

    public T getHeavier(){
        if(this.left.compareTo(this.right) < 0){
            return this.right;
        } else if(this.left.compareTo(this.right) > 0){
            return this.left;
        }
        return null;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public void setRight(T right) {
        this.right = right;
    }
}
