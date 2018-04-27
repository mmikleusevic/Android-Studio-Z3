package com.example.marin.zadatak2;

public class Kalkulator {
    private double a;
    private double b;
    private double oduzimanje;
    private double zbrajanje;
    private double mnozenje;
    private double dijeljenje;

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getOduzimanje() {
            return oduzimanje;
        }

        public void setOduzimanje(double oduzimanje) {
            this.oduzimanje = oduzimanje;
        }

        public double getZbrajanje() {
            return zbrajanje;
        }

        public void setZbrajanje(double zbrajanje) {
            this.zbrajanje = zbrajanje;
        }

        public double getMnozenje() {
            return mnozenje;
        }

        public void setMnozenje(double mnozenje) {
            this.mnozenje = mnozenje;
        }

        public double getDijeljenje() {
            return dijeljenje;
        }

        public void setDijeljenje(double dijeljenje) {
            this.dijeljenje = dijeljenje;
        }

        public Kalkulator(double aa, double bb){
            a=aa;
            b=bb;
            oduzimanje=a-b;
            zbrajanje=a+b;
            mnozenje=a*b;
            dijeljenje=a/b;
        }
    }

