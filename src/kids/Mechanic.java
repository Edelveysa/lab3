package kids;

import enums.Location;
import interfaces.AbleToFind;
import story.Story;

import java.util.Arrays;
import java.util.Objects;

public class Mechanic extends Kid implements AbleToFind {

    public Mechanic(String name, Location location) {
        super(name, location);
    }

    @Override
    public void find() {
        System.out.println(getName() + " в поисках отвертки");
        findResult();
    }
    void findResult(){
        String temp = Story.random() <=50 ? "О, инструмент нашелся" : "...нет инструмента...";
        System.out.println(temp);
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return getName().equals(mechanic.getName()) &&
                getLocation() == mechanic.getLocation();    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + getName() + '\'' +
                ", location=" + getLocation() +
                ", memory=" + Arrays.toString(getAllMemory()) +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocation());
    }
}
