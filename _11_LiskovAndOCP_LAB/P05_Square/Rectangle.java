package _11_LiskovAndOCP_LAB.P05_Square;

class Rectangle {
    private int m_width;
    private int m_height;

    public Rectangle(int width, int height) {
        this.m_width = width;
        this.m_height = height;
    }

    public int getWidth() {
        return this.m_width;
    }

    public int getHeight() {
        return this.m_height;
    }

    public int getArea() {
        return this.m_width * this.m_height;
    }
}
