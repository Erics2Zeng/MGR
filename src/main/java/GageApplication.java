import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tongjie.accessgate.mapper")
public class GageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GageApplication.class, args);
	}
}
