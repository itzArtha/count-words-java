/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk203_190030509;

/**
 *
 * @author arthaputra
 */
public class CountCharacter implements Logic {
    
    @Override
    public String Calculate(String content) {
        return Integer.toString(content.length());
    }

}
