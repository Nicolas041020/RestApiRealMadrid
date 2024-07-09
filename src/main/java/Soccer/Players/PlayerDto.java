/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package Soccer.Players;
import jakarta.validation.constraints.NotEmpty;
/**
 *
 * @author nicor
 */
public record PlayerDto(@NotEmpty(message = "Name should not be empty :c")String name, int age, String country, String team, int debutYear, String birthDate, int height, int weight, String position) {
    
}
