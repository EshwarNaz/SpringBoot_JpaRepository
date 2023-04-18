package in.eshwar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tbl_players")
@AllArgsConstructor
@NoArgsConstructor
public class Player {

	@Id
	private Integer pid;
	private String pname;
	private String pteam;
}
