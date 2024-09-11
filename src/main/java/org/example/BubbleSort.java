package org.example;
import java.util.Scanner;

public class BubbleSort {

    // Hàm để in mảng
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Hàm thực hiện Bubble Sort và hiển thị thông tin
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            System.out.println("Vòng lặp thứ " + (i + 1) + ":");

            for (int j = 0; j < n - i - 1; j++) {
                // Hiển thị thông tin so sánh
                System.out.println("So sánh: arr[" + j + "] = " + arr[j] + " và arr[" + (j + 1) + "] = " + arr[j + 1]);

                if (arr[j] > arr[j + 1]) {
                    // Đổi chỗ phần tử nếu cần thiết
                    System.out.println("Đổi chỗ " + arr[j] + " và " + arr[j + 1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Hiển thị mảng sau mỗi lần lặp
            System.out.println("Mảng sau vòng lặp " + (i + 1) + ":");
            printArray(arr);

            // Nếu không có sự hoán đổi nào, dừng sớm
            if (!swapped) {
                System.out.println("Không có sự hoán đổi, kết thúc sớm.");
                break;
            }
        }

        System.out.println("Mảng đã sắp xếp:");
        printArray(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập kích thước mảng:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Gọi hàm sắp xếp
        bubbleSort(arr);

        scanner.close();
    }
}
