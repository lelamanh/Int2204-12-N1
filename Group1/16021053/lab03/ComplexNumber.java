
public class ComplexNumber {
    float real, imag;
    ComplexNumber(float r, float i) {
        real = r; imag = i;
    }

    ComplexNumber add(ComplexNumber a) {
        return new ComplexNumber(real + a.real, imag + a.imag);
    }
}