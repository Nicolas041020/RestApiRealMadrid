/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Soccer.Players;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author nicor
 */
public interface PlayerRepository extends JpaRepository<Player,Integer>{
    
    List<Player> findByName(String name);
    
    List<Player> findByTeam(String team);
    
    List<Player> findByCountry(String country);
    
    List<Player> findByPosition(String pos);
    
    List<Player> findByAge(int age);
    
//    @Modifying
//    @Transactional
//    @Query("update Author a set a.age = :age where a.id = :id")
//    int updateAuthor (int age,int id);
    
//    @Modifying
//    @Transactional
//    @Query("update Author a set a.team = :team where a.id = :id")
//    void updateAuthorTeam (String team, int id);
}
