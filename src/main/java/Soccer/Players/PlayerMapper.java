/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soccer.Players;

import org.springframework.stereotype.Service;

/**
 *
 * @author nicor
 */
@Service
public class PlayerMapper {
    
    
    public PlayerDto toPlayerDto(Player player){
    return new PlayerDto(player.getName(),player.getAge(),player.getCountry(),player.getTeam(),player.getDebutYear(),player.getBirthDate(),player.getHeight(),player.getWeight(),player.getPosition());
    }
}
