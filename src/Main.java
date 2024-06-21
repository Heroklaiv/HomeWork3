public class Main {
    public static void main(String[] args) {
        Search task = new Search();
        int number = 12523454;

        int[] array = {1001, 412214, 16, 99, 26, 92, -34, 7887, 35, 23456};
        // task 1.1
        int[][] arrayReverse = new int[2][1];
        arrayReverse = task.reversNumber(number);
        System.out.println(arrayReverse[0][0]);
        // task 1.2
        System.out.println(task.searchMaxNumber(number, array, true));
        System.out.println(task.searchMinNumber(number, array, true));
        // task 1.3
        System.out.println(task.searchRepeatNumbers(number));
        // task 1.4
        task.searchSubsequenceNumber(number, true);
        // task 2.1
        System.out.println(task.searchMaxNumber(number, array, false));
        System.out.println(task.searchMinNumber(number, array, false));
        // task 2.2
        /*for (int i : array)
            if (i % 2 == 0) {
                System.out.println("Чётное число " + i);
            }
            else {
                System.out.println("Не чётное число " + i);
            }*/ //это решение,как я считаю, более логичное
        task.searchEvenAndNotEvenNumber(array);
        // task 2.3
        int maxLength = Integer.MIN_VALUE;
        int minLength = Integer.MAX_VALUE;
        for (int i : array) {
            i = (i < 0) ? i * (-1) : i;
            arrayReverse = task.reversNumber(i);
            if (maxLength < arrayReverse[1][0]) maxLength = arrayReverse[1][0];
            if (minLength > arrayReverse[1][0]) minLength = arrayReverse[1][0];
        }
        System.out.println(maxLength);
        System.out.println(minLength);
        // task 2.4
        for (int i : array)
            task.searchSubsequenceNumber(i, false);
        // task 2.5
        for (int i:array){
            arrayReverse=task.reversNumber(i);
            if (i==arrayReverse[0][0]) System.out.println(i);
        }


    }
}
