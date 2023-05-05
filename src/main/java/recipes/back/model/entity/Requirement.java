package recipes.back.model.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Requirement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Getter(AccessLevel.NONE)
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Getter(AccessLevel.NONE)
	private String name;
	
	@OneToMany
	private List<CookwareCutlery> cookwareCutlery;
	
	@OneToMany
	private List<Ingredient> ingredient; 
	
}
