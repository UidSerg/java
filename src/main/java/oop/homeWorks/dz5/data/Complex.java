package oop.homeWorks.dz5.data;
//приципа барборы  лисков нет тюк нет родительских классов и классов наслединков
// Принцип единой ответсвеннсоти каждый объект описываетсмя отдельно

public class Complex {
        private double ox;
        private double oy;

        public Complex(double ox, double oy) {
                this.ox = ox;
                this.oy = oy;
        }
        // Принцип открытости закрытости
        // класс закрыт для изменения открыт для использования
        public double getOx() {
                return ox;
        }

        public double getOy() {
                return oy;
        }
        @Override
        public String toString() {
                return "Complex{" +
                        "ox=" + ox +
                        ", oy=" + oy +
                        '}';
        }
}



