/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soccer.Players;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nicor
 */

@RestController
public class PlayerController {
    
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    
    @PostMapping("/save/players")
    private void saveAllPlayers(@RequestBody Iterable<Player> players){
    playerService.saveAllPlayers(players);
    }
    
    @GetMapping("/players")
    private List<PlayerDto> findAllPlayers(){
        return playerService.findAllPlayers();
    }
    @GetMapping("/players/name/{name}")
    private List<PlayerDto> findByName(@PathVariable("name") String name){
    
        return playerService.findByName(name);
    }
    
    @GetMapping("/players/team/{team}")
    private List<PlayerDto> findByTeam(@PathVariable("team") String team){
        return playerService.findByTeam(team);
    }
    
    @GetMapping("/players/country/{country}")
    private List<PlayerDto> findByCountry(@PathVariable("country") String country){
        return playerService.findByCountry(country);
    }
    
    @GetMapping("/players/position/{position}")
    private List<PlayerDto> findByPosition(@PathVariable("position") String position){
        return playerService.findByPosition(position);
    }
    @GetMapping("/players/age/{age}")
    private List<PlayerDto> findByAge(@PathVariable("age") int age){
        return playerService.findByAge(age);
    }
}
