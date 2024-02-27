package QA_HomeWork_Sem7_OOP;

public interface ComplexNumber {
    ComplexNumber add(int real, int imaginary);
    ComplexNumber multiply(int real, int imaginary);
    ComplexNumber subtract(int real, int imaginary);
    ComplexNumber divide(int real, int imaginary);
    int getRealPart();
    int getImaginaryPart();
}