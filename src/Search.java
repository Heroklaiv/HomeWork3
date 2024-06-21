public class Search {

    int[][] reversNumber(int number) {
        int[][] array = new int[2][1];
        int revers = 0;
        int i = 0;
        while (number > 10) {
            revers = revers + number % 10;
            revers = revers * 10;
            number /= 10;
            i++;
            array[0][0] = revers + number;
            array[1][0] = i + 1;
        }
        return array;
    }

    int searchMaxNumber(int number, int[] array, boolean mode) {
        int max = Integer.MIN_VALUE;
        if (mode) {// режим поиска в числе mode true
            while (number > 0) {
                int mod = number % 10;
                if (mod > max) {
                    max = mod;
                }
                number /= 10;
            }
            return max;
        } else {// режим поиска в массиве mode false
            for (int i : array) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }
    }

    int searchMinNumber(int number, int[] array, boolean mode) {
        int min = Integer.MAX_VALUE;
        if (mode) {// режим поиска в числе mode true
            while (number > 0) {
                int mod = number % 10;
                if (mod < min) {
                    min = mod;
                }
                number /= 10;
            }
            return min;
        } else// режим поиска в массиве mode false
            for (int i : array) {
                if (i < min) {
                    min = i;
                }
            }
        return min;
    }

    boolean searchRepeatNumbers(int number) {
        while (number > 0) {
            int copyNumber = number;
            int mod = number % 10;
            while (copyNumber > 0) {
                if (mod == copyNumber % 10) return true;
                copyNumber /= 10;
            }
            number /= 10;
        }
        return false;
    }

    void searchSubsequenceNumber(int number, boolean mode) {
        if (mode) { //режим поиска в числе mode true
            int i = 1;
            while (number > 0) {
                int mod = number % 10;
                number = (number - mod) / 10;
                if ((mod == (number % 10 + 1)) && number >= 1) {
                    if (i > 0) System.out.print(mod);
                    if (number % 10 < 10 && number >= 1) System.out.print(number % 10);
                    i = 0;
                } else {
                    if (i < 1) System.out.println(' ');
                    i++;
                }

            }
        } else {// режим поиска в массиве mode false
                int copyNumber = number;
                boolean flag = false;
                if (number < 0) number = Math.abs(number);
                while (number > 10) {
                    int mod = number % 10;
                    number /= 10;
                    if (mod == number % 10 + 1) flag = true;
                    else {
                        flag = false;
                        return;
                    }
                }
                if (flag) System.out.println(copyNumber);
        }
    }

    void searchEvenAndNotEvenNumber(int[] array) {
        int[][] newArray = new int[array.length][array.length];
        int index0 = 0;
        int index1 = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                newArray[0][index0] = i;
                index0++;
            } else {
                newArray[1][index1] = i;
                index1++;
            }
        }
        System.out.println("Even:");
        for (int i = 0; i < newArray[0].length; i++)
            if (newArray[0][i] != 0) System.out.print(newArray[0][i] + " ");
        System.out.println(" ");
        System.out.println("Not even:");
        for (int i = 0; i < newArray[1].length; i++)
            if (newArray[1][i] != 0) System.out.print(newArray[1][i] + " ");
        System.out.println(" ");
    }

}
