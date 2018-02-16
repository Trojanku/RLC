
package RLC;

public class Obliczenia {

    double R, R0, R1;
    double L;
    double C;
    double a;
    double okres;
    double amplituda;


    double Pobudzenie(int numer, double wartosc, double krok){
        if (numer == 1){
            if(Math.sin(2*Math.PI*wartosc/okres)>0) return amplituda;
            else return -amplituda;
        }
        else if (numer == 2){
            if((Math.sin(2*Math.PI*wartosc/okres)>0) && (Math.cos(2*Math.PI*wartosc/okres)>0)){
                while (wartosc > okres) wartosc -= okres;
                return 4*amplituda*wartosc/okres;
            }
            else if((Math.sin(2*Math.PI*wartosc/okres)>0) && (Math.cos(2*Math.PI*wartosc/okres)<0)){
                while (wartosc > okres) wartosc -= okres;
                return -4*amplituda*wartosc/okres + 2*amplituda;
            }
            else if((Math.sin(2*Math.PI*wartosc/okres)<0) && (Math.cos(2*Math.PI*wartosc/okres)<0)){
                while (wartosc > okres) wartosc -= okres;
                return -4*amplituda*wartosc/okres + 2*amplituda;
            }
            else if((Math.sin(2*Math.PI*wartosc/okres)<0) && (Math.cos(2*Math.PI*wartosc/okres)>0)){
                while (wartosc > okres) wartosc -= okres;
                return 4*amplituda*wartosc/okres - 4*amplituda;
            }
        }
        else if (numer == 3){
            return (amplituda*Math.sin(2*Math.PI*wartosc/okres));
        }

        return 0;
    }

    void rezystancja(double krok){
        R = R0 + (R1*Math.exp(-a*krok));
    }

    double funkcja_R(double yRezystor, double yKondensator, double pobudzenie){
        double wart_funkcji = -(R/L)*yRezystor-R/L*yKondensator+R/L*pobudzenie;
        return wart_funkcji;
    }

    double funkcja_K(double yRezystor){
        double wart_funkcji = 1/(R*C)*yRezystor;
        return wart_funkcji;
    }

    double Euler_y(double wart_aktu, double wart_aktu_poch, double krok){
        return wart_aktu + wart_aktu_poch*krok;
    }

}
