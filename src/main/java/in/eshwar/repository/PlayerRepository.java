package in.eshwar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import in.eshwar.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

	/*
	 * update Query
	 * 
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query(value = "update tbl_players set pname=:name where pid=:id",
	 * nativeQuery = true) void updatePlayerName(@Param("name") String
	 * name, @Param("id") int id);
	 */

	/*
	 * @Modifying
	 * 
	 * @Transactional
	 * 
	 * @Query(value = "delete from tbl_players where pid=:id", nativeQuery = true)
	 * void DeletePlayer(@Param("id") int id);
	 */

	@Modifying
	@Transactional
	@Query(value = "insert into tbl_players(pid,pname,pteam) values(:id,:name,:team)", nativeQuery = true)
	void insertPlayer(@Param("id") int id, @Param("name") String name, @Param("team") String team);

}
