package be.vives.oop.complex;

import javax.swing.event.PopupMenuEvent;

/**
 * Complex
 */
public class Complex {
    public void setReal(double real){
        this.real = real;
    }
    public double getReal(){
        return real;
    }
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }
    public double getImaginary(){
        return imaginary;
    }
    public Complex (double real, double imaginary){
        setReal(real);
        setImaginary(imaginary);
    }
    public Complex add(Complex second){
        Complex result = new Complex();
        result.setReal(this.getReal() + second.getReal());
        result.setImaginary(this.getImaginary() + second.getImaginary());
        return result;

    }
    public Complex subtract(Complex second){
        Complex result = new Complex();
        result.setReal(this.getReal() - second.getReal());
        result.setImaginary(this.getImaginary() - second.getImaginary());
        return result;

    }
    public Complex(){
        this(0,0);
    }
    private String numberValue(){
        if(getImaginary() > 0){
            return " + ";
        }
        else{
            return " - ";  
        }
    }
    @Override
    public String toString(){
        return "(" + getReal() + numberValue() + Math.abs(getImaginary()) + "j" + ")";
    }
    public Complex(Complex original){
        this(original.getReal(), original.getImaginary());
    }
    public Complex multiply(Complex second){
        Complex result = new Complex();       
        result.setReal((this.getReal() * second.getReal()) - (this.getImaginary() * second.getImaginary()));
        result.setImaginary((this.getReal() * second.getImaginary()) + (this.getImaginary() * second.getReal()));
        return result;
    }
    public Complex multiply(double factor){
        Complex result = new Complex();       
        result.setReal(this.getReal() * factor);
        result.setImaginary(this.getImaginary() * factor);
        return result;
    }
    public Complex divide(Complex second){
        Complex result = new Complex();       
        result.setReal((()/));
        result.setImaginary();
        return result;
    }
    public Complex divide(double factor){
        Complex result = new Complex();       
        result.setReal(this.getReal() / factor);
        result.setImaginary(this.getImaginary() / factor);
        return result;  
    }
    public double real = 0;
    public double imaginary = 0;
}