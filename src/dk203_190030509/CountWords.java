/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk203_190030509;

import java.util.ArrayList;

/**
 *
 * @author arthaputra
 */
public class CountWords extends CountCharacter {
    // membuat objek array list
    ArrayList newArr = new ArrayList();
    // Overriding dari CountCharacter methhod sama namun parameter berbeda  
    @Override
    public String Calculate(String content) {
        //Simpan jumlah kata dalam array dengan memecahnya menggunakan split
        String[] arr = content.split(" ");
        // Perulangan dan decision untuk seleksi setiap kata dan menganggap 3 karakter atau lebih adalah sebuah kata
        for(int i=0; i < arr.length; i++) {
            if(arr[i].length() >= 3) {
                newArr.add(arr[i]);
            }
        }
        return Integer.toString(newArr.size());
    }
}
