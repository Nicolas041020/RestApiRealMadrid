/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soccer.Players;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author nicor
 */
@Service
public class PlayerService {
    
    public PlayerRepository repository;
    public PlayerMapper mapper;

    public PlayerService(PlayerRepository repository, PlayerMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }
    public void saveAllPlayers(Iterable<Player> players){
        repository.saveAll(players);
    }
    public List<PlayerDto> findAllPlayers(){
        List<Player> find = repository.findAll();
    return find.stream().map(mapper::toPlayerDto).collect(Collectors.toList());
    }
    public List<PlayerDto> findByName(@PathVariable("name") String name){
        List<Player> find = repository.findByName(name);
        return find.stream().map(mapper::toPlayerDto).collect(Collectors.toList());
    }
    
    public List<PlayerDto> findByTeam(@PathVariable("team") String team){
        List<Player> find = repository.findByTeam(team);
        return find.stream().map(mapper::toPlayerDto).collect(Collectors.toList());
    }
    
    public List<PlayerDto> findByCountry(@PathVariable("country") String country){
        List<Player> find = repository.findByCountry(country);
        return find.stream().map(mapper::toPlayerDto).collect(Collectors.toList());
    }
    public List<PlayerDto> findByPosition(@PathVariable("position") String position){
        List<Player> find = repository.findByPosition(position);
        return find.stream().map(mapper::toPlayerDto).collect(Collectors.toList());
    }
    
    public List<PlayerDto> findByAge(@PathVariable("age") int age){
        List<Player> find = repository.findByAge(age);
        return find.stream().map(mapper::toPlayerDto).collect(Collectors.toList());
    }
    
    
}
