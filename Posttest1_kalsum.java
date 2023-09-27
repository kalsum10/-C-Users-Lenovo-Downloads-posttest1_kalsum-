/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1_kalsum;
import java.util.ArrayList;
/**
 *
 * @author SELLA
 */
public class Posttest1_kalsum {

     public static void main(String[] args) {
        ArrayList<Film> film = new ArrayList<>();

        film.add(new Film("Moving", "Park In Jae"));
        film.add(new Film("Twenty Five Twenty One", "Jung JU Hyun"));
        film.add(new Film("Start UP", "Oh Choong Hwan"));
        film.add(new Film("Hidden Love", "Lee Ching Jung"));
        film.add(new Film("My Lovely Liar", "Nam Sung Woo"));

        for (Film film1 : film) {
            System.out.println("Film berjudul " + film1.judul + " Di Buat oleh " + film1.pembuat + ".");
        }
    }
}