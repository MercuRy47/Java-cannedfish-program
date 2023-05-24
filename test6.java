/* จงเขียนโปรแกรมสำหรับคำนวณว่า หากโรงงานแห่งนี้บอกปริมาณวัตถุดิบ (ทั้งปลาซาร์ดีนและมะเขือเทศ) 
 * ที่โรงงานแห่งนี้มีอยู่มาให้แล้วจะสามารถ ผลิตปลากระป๋องได้กี่กระป๋อง และเหลือวัตถุดิบแต่ละชนิดจำนวนเท่าใด
 * 
 * ปลาซาร์ดีนใช้ 2 ตัว และ มะเขือเทศ 3 ผล ในการผลิตปลากระป๋อง 1 กระป๋อง
 */

package Chapter3;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับจำนวนปลาซาร์ดีนและมะเขือเทศจากผู้ใช้
        System.out.print("ปลาซาร์ดีนที่มีอยู่ (จำนวนตัว): ");
        int fishSardines = scanner.nextInt();
        System.out.print("มะเขือเทศที่มีอยู่ (จำนวนผล): ");
        int tomatoes = scanner.nextInt();

        // คำนวณจำนวนกระป๋องปลาซาร์ดีนที่สามารถผลิตได้
        int cansProduced = Math.min(fishSardines / 2, tomatoes / 3);

        // คำนวณจำนวนวัตถุดิบที่เหลือเป็นไปได้
        int remainingFishSardines = fishSardines - (cansProduced * 2);
        int remainingTomatoes = tomatoes - (cansProduced * 3);

        // แสดงผลลัพธ์
        System.out.println("สามารถผลิตปลากระป๋องได้: " + cansProduced + " กระป๋อง");
        System.out.println("วัตถุดิบที่เหลือ:");
        System.out.println("ปลาซาร์ดีนที่เหลือ: " + remainingFishSardines + " ตัว");
        System.out.println("มะเขือเทศที่เหลือ: " + remainingTomatoes + " ผล");
    }
}
