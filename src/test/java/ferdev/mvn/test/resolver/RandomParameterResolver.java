package ferdev.mvn.test.resolver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

// kenapa ada parameter resolver dalam unit test (dependency injection)
// karena method unit test itu akan otomatis dijalankan, berbeda dengan method biasa yang jika ingin
// dijalankan perlu dipanggil oleh main method, atau method lain dan jika memiliki parameter berbentuk objek
// akan langsung disi oleh pemanggil method (method call), berbeda dengan method unit test karena
// langsung jalan dan gaada yg mengisi parameter, maka dibutuhkan parameter resolver atau dependency injection
// secara otomatis akan dibuatkan objek oleh parameter resolver dan dapat langsung digunakan oleh method test
@DisplayName("A random resolver")
public class RandomParameterResolver {

}
