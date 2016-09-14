/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author liborio
 */
public class clase {

    private double Pr;
    private double Pi;

    public clase(double Preal, double Pimag) {
        this.Pr = Preal;
        this.Pi = Pimag;
    }

    public double getPr() {
        return Pr;
    }

    public void setPr(double Pr) {
        this.Pr = Pr;
    }

    public double getPi() {
        return Pi;
    }

    public void setPi(double Pi) {
        this.Pi = Pi;
    }

    public clase Suma(clase c2) {
        clase C;
        double Real, Imag;
        Real = this.Pr + c2.Pr;
        Imag = this.Pi + c2.Pi;
        C = new clase(Real, Imag);
        return C;
    }

    public clase Resta(clase c2) {
        clase C;
        double Real, Imag;
        Real = this.Pr - c2.Pr;
        Imag = this.Pi - c2.Pi;
        C = new clase(Real, Imag);
        return C;
    }

    public clase Multiplicacion(clase c2) {
        clase C;
        double Real, Imag;
        Real = (this.Pr * c2.Pr) - (this.Pi * c2.Pi);
        Imag = (this.Pr * c2.Pi) + (this.Pi * c2.Pr);
        C = new clase(Real, Imag);
        return C;
    }

    public clase Division(clase c2) {
        clase C;
        double NReal, NImag;
        NReal = ((this.Pr * c2.Pr) + (this.Pi * c2.Pi));
        NImag = ((this.Pi * c2.Pr) - (this.Pr * c2.Pi));
        C = new clase(NReal, NImag);
        return C;
    }

}
