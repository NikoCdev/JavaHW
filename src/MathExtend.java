import java.util.Arrays;

interface IMath {
    int Max();
    int Min();
    float Avg();
}

interface ISort {
    void SortAsc();
    void SortDesc();
}

class Array implements IMath, ISort {
    private int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    @Override
    public int Max() {
        int max = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

    @Override
    public int Min() {
        int min = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min) {
                min = elements[i];
            }
        }
        return min;
    }

    @Override
    public float Avg() {
        float sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        return sum / elements.length;
    }

    // Реализация методов ISort
    @Override
    public void SortAsc() {
        Arrays.sort(elements);
    }

    @Override
    public void SortDesc() {
        Arrays.sort(elements);
        for (int i = 0; i < elements.length / 2; i++) {
            int temp = elements[i];
            elements[i] = elements[elements.length - i - 1];
            elements[elements.length - i - 1] = temp;
        }
    }

    // Геттер для элементов массива
    public int[] getElements() {
        return elements;
    }
}

public class MathExtend {
    public static void main(String[] args) {
        int[] numbers = {4, 14, 8, 23, 67};
        Array array = new Array(numbers);

        System.out.println("Максимум: " + array.Max());
        System.out.println("Минимум: " + array.Min());
        System.out.println("Среднее: " + array.Avg());

        array.SortAsc();
        System.out.println("Сортировка по возрастанию: " + Arrays.toString(array.getElements()));

        array.SortDesc();
        System.out.println("Сортировка по убыванию: " + Arrays.toString(array.getElements()));
    }
}