package ru.oop.task3;

import java.util.List;

/**
 * Транспорт, который знает свое положение
 */
public interface Transport extends Positioned {
    /**
     * Довезти человека до точки назначения, если транспорт не может доехать
     * прямо до точки назначения, то он останавливается. Обновлять позицию человека
     */
    void drive(Person person, Position destination);
}
