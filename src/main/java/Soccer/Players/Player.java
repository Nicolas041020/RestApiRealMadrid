/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soccer.Players;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author nicor
 */
@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Player {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   
   private String name;
   
   private int age;
   
   private String country;
   
   private String team;
   
   private int debutYear;
   
   private String birthDate;
   
   @Column(name = "height(cm)")
   private int height;
   @Column(name = "weight(kg)")
   private int weight;
   
   private String position;

//    public Player() {
//    }
//
//   
//   
//    public Player(Integer id, String name, String age, String country, String team, LocalDate debut, int height, int weight, String position) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.country = country;
//        this.team = team;
//        this.debut = debut;
//        this.height = height;
//        this.weight = weight;
//        this.position = position;
//    }
   
   
   
}
