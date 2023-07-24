package oop.homeWorks.dz5.servise;

import oop.homeWorks.dz5.data.Complex;
//Принцип открытости закрытостииспользуются интефейсы классы закрыты для изменения
public interface Func {
//один итерефейс должен обладать своии ограниченым фунционалом например действия с комплексными числами
    void sum(Complex complex, Complex complex2);
    void proizv(Complex complex, Complex complex2);
    void dell(Complex complex, Complex complex2);


}
