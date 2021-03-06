public class Circle {

    // Площадь круга S вычисляется по формуле S = PI * r^2,
    // где PI - число "Пи", r^2 - радиус, возведенный в квадрат
    //
    // Задание:
    // Известна площадь некоторого круга S = 1661 (округлена до целых)
    // Используя метод sqrt() и константу PI класса Math, найдите, чему равен радиус r
    // Округлите ответ до целых с помощью метода round()

    double S = 1661;
    double r = 0;

    public void getRadius() {
        // Решение
        double radius = Math.round(Math.sqrt(this.S / Math.PI));
        this.r = radius;
    }
}
