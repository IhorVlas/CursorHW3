package com.company;

import java.util.Arrays;
import java.util.Random;

public class Array {

    int[] myArr;
    Random random = new Random();

    Array(int[] myArr) {
        this.myArr = myArr;
    }

    //1. Заповнити масив тільки парними числами
    public void firstTask() {
        System.out.print("1. Парные числа: ");
        int num = 0;
        for (int i = 0; i < this.myArr.length; i++) {
            if ( num % 2 == 0 ) {
                this.myArr[i] = num;
                System.out.print(num + " ");
                num++;
            } else {
                num++;
                System.out.print(num + " ");
            }
            num++;
        }
    }

    //2. Заповнити масив рандомними числами
    public void secondTask() {
        System.out.print("\n2. Случайные числа: ");

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt((10 - 1) + 1);
            System.out.print(myArr[i] + " ");
        }
    }

    //3. Вивести середнє значення масиву
    public void thirdTask() {
        System.out.print("\n3. Среднее значение: ");
        float numSumm = 0;
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt((10 - 1) + 1);
            numSumm += myArr[i];
        }
        System.out.print(numSumm / myArr.length);
    }

    //4. Вивести суму всіх значень кратних 3
    public void forthTask() {
        System.out.print("\n4. Сумма значений кратных 3: ");
        int summNumMultipleThree = 0;
        for (int i = 0; i < myArr.length; i++) {
            int randomNum = random.nextInt((10 - 1) + 1);
            myArr[i] = randomNum;
            if ( randomNum % 3 == 0 ) {
                summNumMultipleThree += myArr[i];
            }
        }
        System.out.print(summNumMultipleThree);
    }

    //5. Вивести значення всіх парних індексів масиву
    public void fifthTask() {
        System.out.print("\n5. Значения чисел парных индексов: ");
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i;
            if ( i % 2 == 0 ) {
                System.out.print(myArr[i] + " ");
            }
        }
    }

    //6. Просортувати масив в порядку зростання
    public void sixthTask() {
        System.out.print("\n6. масив по возрастанию: ");
        for (int i = 0; i < myArr.length; i++) {
            int randomNum = random.nextInt((10 - 1) + 1);
            myArr[i] = randomNum;
        }
        Arrays.sort(myArr);
        System.out.print(Arrays.toString(myArr));
    }

    //7. Вивести найменше значення в масиві
    public void seventhTask() {
        System.out.print("\n7. Наименшее значение: ");
        for (int i = 0; i < myArr.length; i++) {
            int randomNum = random.nextInt((10 - 1) + 1);
            myArr[i] = randomNum;
        }
        Arrays.sort(myArr);
        System.out.print(myArr[0]);
    }


    //8. Вивести найбільше значення масиву
    public void eighthTask() {
        System.out.print("\n8. Наибольшее значение: ");
        for (int i = 0; i < myArr.length; i++) {
            int randomNum = random.nextInt((10 - 1) + 1);
            myArr[i] = randomNum;
        }
        Arrays.sort(myArr);
        System.out.print(myArr[myArr.length - 1]);
    }

    //9. Вивести суму значень всіх парних індексів
    public void ninthTask() {
        System.out.print("\n9. Сумма значений парных индексов: ");
        int summNumMultipleTwoo = 0;
        for (int i = 0; i < myArr.length; i++) {
            int randomNum = random.nextInt((10 - 1) + 1);
            myArr[i] = randomNum;
            if ( i % 2 == 0 ) {
                summNumMultipleTwoo += myArr[i];
            }
        }
        System.out.print(summNumMultipleTwoo);
    }

    //10. Вивести перших 20 символів з таблиці ASCI
    public void tenthTask() {
        System.out.print("\n10. 65-84 из ASCII: ");
        int charAscii = 65;
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = charAscii;
            char result = (char) charAscii;
            System.out.print(result);
            charAscii++;
        }
    }

// ---------------------------------------------------------------------------------------------------------------------

    public void midlLine() {
        System.out.println();
        System.out.println("\nВторой вариант:");
    }

    // Второй вариант решения заданий 2 - 9
    public void secondVariant2_9Task() {

        float numSumm2 = 0;
        int summNumMultipleTwoo2 = 0;
        int summNumMultipleThree2 = 0;
        String pair = "";

        // int[] arr = new int[5];
        System.out.print("\n2. Случайные числа: ");
        for (int i = 0; i < myArr.length; i++) {
            int randomNum = random.nextInt((10 - 1) + 1);
            myArr[i] = randomNum;
            System.out.print(myArr[i] + " ");
            numSumm2 += myArr[i];
            if ( i % 2 == 0 ) {
                summNumMultipleTwoo2 += myArr[i];
            }
            if ( randomNum % 3 == 0 ) {
                summNumMultipleThree2 += myArr[i];
            }
            if ( i % 2 == 0 ) {
                pair += (myArr[i] + " ");
            }
        }
        Arrays.sort(myArr);

        System.out.print("\n3. Среднее значение: " + (numSumm2 / myArr.length));
        System.out.print("\n4. Сумма значений кратных 3: " + summNumMultipleThree2);
        System.out.print("\n5. Значения чисел парных индексов: " + pair);
        System.out.print("\n6. масив по возрастанию: " + Arrays.toString(myArr));
        System.out.print("\n7. Наименшее значение: " + myArr[0]);
        System.out.print("\n8. Наибольшее значение: " + myArr[myArr.length - 1]);
        System.out.print("\n9. Сумма значений парных индексов: " + summNumMultipleTwoo2);
    }
}