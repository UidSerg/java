package oop.homeWorks.dz5.data;



public class Complex {
        public double ox;
        public double oy;

        public Complex(double ox, double oy) {
                this.ox = ox;
                this.oy = oy;
        }

        @Override
        public String toString() {
                return "Complex{" +
                        "ox=" + ox +
                        ", oy=" + oy +
                        '}';
        }
}



