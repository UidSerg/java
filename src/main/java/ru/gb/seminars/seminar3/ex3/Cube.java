package ru.gb.seminars.seminar3.ex3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cube {
    private Integer size;
    private String color;
    private String material;
    public Integer volumeCube(){
        return size*size*size;
    }
}
/* Без библитеки lombok
public class Cube {
    private Integer size;
    private String color;
    private String material;

    public Cube(Integer size, String color, String material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public Cube() {
    }

    public Integer volumeCube() {
        return size * size * size;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cube cube = (Cube) o;

        if (!size.equals(cube.size)) return false;
        if (!color.equals(cube.color)) return false;
        return material.equals(cube.material);
    }

    @Override
    public int hashCode() {
        int result = size.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + material.hashCode();
        return result;
    }
}
 */