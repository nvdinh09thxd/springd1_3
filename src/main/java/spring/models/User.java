package spring.models;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int id;
	
	@NotEmpty(message = "username không được để trống!")
	private String username;
	
	private String password;
	private String active;

}
