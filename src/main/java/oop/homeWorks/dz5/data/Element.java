package oop.homeWorks.dz5.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Element<E> {
    E obj;

    public void setObj(E obj) {
        this.obj = obj;
    }
}