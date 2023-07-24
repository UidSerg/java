package oop.homeWorks.dz5.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// Принцип единой ответсвеннсоти каждый объект описываетсмя отдельно
//приципа барборы  лисков нет тюк нет родительских классов и классов наслединков
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Element<E> {
    private  E obj;

    public void setObj(E obj) {
        this.obj = obj;
    }

    public E getObj() {
        return obj;
    }
}