package oop.seminar4.zd2;

import lombok.Data;

import java.awt.geom.QuadCurve2D;

@Data
public class BoxWithNumber<N extends Number> {
    N[] number;

    public BoxWithNumber(N... num) {
        number = num;
    }
    public double average(){
        double sum = 0.0;
        for (N n:number ) {
            sum += n.doubleValue();
        }
        return  sum/number.length;
    }

    public boolean compareAverage(BoxWithNumber<?> box2) {
        if(Math.abs(this.average() - box2.average())< 0.00000001){
            return true;
        }
    return false;
    }
}
