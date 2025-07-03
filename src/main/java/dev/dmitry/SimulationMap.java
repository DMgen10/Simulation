package dev.dmitry;

import java.util.HashMap;
import java.util.Map;

public class SimulationMap {

    /*
    1. Хранятся все сущности и их расположения
    2. Проверка на свободную клетку (никем не занята)
    3. Как заполнять лучше пустоты? - никак ёпт, главное чтобы не нал
    4. добавить существо/удалить существо
     */

    private int weight;
    private int height;
    private Map<Position, Entity> objectsOnTheMap;

    public SimulationMap(int weight, int height) {
        this.height = height;
        this.weight = weight;
        objectsOnTheMap = new HashMap<>(weight * height);
    }

    public void add(Position position, Entity entity){

    }

    public void remove(Position position){

    }

    public Map<Position, Entity> getObjectsOnTheMap() {
        return objectsOnTheMap;
    }

    public boolean isPositionEmpty(Position position){

        if (!isWithinBounds(position)){
            return false;
        }
        return !objectsOnTheMap.containsKey(position);
    }

    private boolean isWithinBounds(Position position){
        int positionX = position.getPointX();
        int positionY = position.hashCode();
        return positionX >= 0 && positionX < weight && positionY >= 0 && positionY < height;

    }

}
