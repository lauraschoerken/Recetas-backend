package recipes.back.model.entity;



import java.io.Serializable;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Recipe implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String title; 
	
	@Column
	private String subtitle; 
	
	@Column
	private String info;
	
	private String image;
	
	private Time time;
	
	@NotNull
	@OneToOne
	private Requirement requirement; 
	
	@OneToMany
	private List<Steps> steps;
	
	private String note; 
	
}
