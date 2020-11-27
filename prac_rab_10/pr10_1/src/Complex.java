public class Complex {
    int real;
    int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }

    public int getReal() {
        return real;
    }

    public int getImage() {
        return image;
    }
}
