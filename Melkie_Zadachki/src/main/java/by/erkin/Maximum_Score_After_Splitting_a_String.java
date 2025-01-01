package by.erkin;

/*
Возможные разбиения строки и подсчет "счета":
left = "0", right = "0111"

Количество '0' в left: 1
Количество '1' в right: 3
Счет: 1 + 3 = 4
left = "00", right = "111"

Количество '0' в left: 2
Количество '1' в right: 3
Счет: 2 + 3 = 5
left = "001", right = "11"

Количество '0' в left: 2
Количество '1' в right: 2
Счет: 2 + 2 = 4
left = "0011", right = "1"

Количество '0' в left: 2
Количество '1' в right: 1
Счет: 2 + 1 = 3
Максимальный счет достигается, когда:

left = "00",
right = "111".
Счет = 2 (количество '0') + 3 (количество '1') = 5.


Шаги решения
Инициализация:

Создаем две переменные: leftZeros (для подсчета '0' в левой части) и rightOnes (для подсчета '1' в правой части).
Считаем общее количество '1' в строке и записываем его в rightOnes.
Итерация по строке:

Проходим по каждому символу строки (кроме последнего, так как разбиение должно быть на две непустые части).
Если текущий символ — '0', увеличиваем leftZeros.
Если текущий символ — '1', уменьшаем rightOnes (так как этот символ уже "переходит" из правой части в левую).
На каждом шаге вычисляем текущий "счет": leftZeros + rightOnes.
Сохранение максимума:

Держим переменную maxScore, которая обновляется, если текущий "счет" больше.
Результат:

В конце итерации возвращаем maxScore.
 */

public class Maximum_Score_After_Splitting_a_String {

    public static int solution(String s) {
        int leftZeros = 0;
        int rightOnes = 0;
        int maxScore = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                rightOnes++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }
            maxScore = Math.max(maxScore, leftZeros + rightOnes);
        }
        System.out.println(maxScore);

        return maxScore;

    }

    public static void main(String[] args) {
        solution("00111");

    }
}

