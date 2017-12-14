package _11_LiskovAndOCP_LAB.P03_GraphicEditor;


public class GraphicEditor {
    public void drawShape(Drawable drawable) {
        drawable.toString();
    }

    public static void main(String[] args) {
        Drawable rect = new Rectangle();
        Drawable shape = new Shape();
        Drawable circ = new Circle();

        System.out.println(rect.toString());
        System.out.println(shape.toString());
        System.out.println(circ.toString());
    }
}
