package com.haktanozgur.minMaxValueCopyy;

import java.util.Arrays;
import java.util.Scanner;

public class minMaxValueCopy {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kaç sayı gireceksiniz ? ");
		int input = scanner.nextInt();
		int min;
		int max;
		int array[] = new int[input];  // Kullanıcıdan alınan sayılarda, min ve max değerleri için array tercih edildi.

		
		for (int i = 0; i < array.length; i++) {  // for döngüsü kullanarak kullanıcının yazacağı sayılar, oluşturalan array içerisine yazıldı
			System.out.println((i + 1) + ". Sayıyı giriniz : " ); 
            array[i] = scanner.nextInt();       
        }
		/*array içerisindeki sayıların karşılaştırması, min ve max değerlerinin bulunması
        için Arrays sınıfı ve Stream API'si kullanıldı.Stream apisi sayesinde min ve max 
        değerleri ekrana yazdırıldı.*/
        max = Arrays.stream(array).max().getAsInt(); 
        min = Arrays.stream(array).min().getAsInt();
        
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
			
	}
		
}
