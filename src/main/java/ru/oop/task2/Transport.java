package ru.oop.task2;

/**
 * Транспорт, который знает свое местоположение
 */
public interface Transport extends Positioned {
    /**
     * Довезти человека до точки назначения, если транспорт не может доехать
     * прямо до точки назначения, то он останавливается. Обновляет позицию человека.
     */
    void drive(Person person, Position destination);
}
