package user.domain;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class User {

	private String id;
	private String name;
	private String pass;
	
}
