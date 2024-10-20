package ru.oop.task3;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
interface Person extends Positioned {

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);

    /**
     * Посадить человека в транспорт, если положение человека дальше положения транспорта,
     * он идет пешком до него
     */
    void put(Transport transport);
}
