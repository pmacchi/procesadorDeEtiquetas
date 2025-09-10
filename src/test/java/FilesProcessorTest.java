import org.example.SPLProcessor;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SPLProcessorTest {

    @Test
    public void testGetFilesSHD() {

        SPLProcessor processor = new SPLProcessor();
       List<File> archivos = processor.getFilesSPL();

        for (File archivo : archivos) {
            assertTrue(archivo.getName().toLowerCase().endsWith(".spl"),
                    "El archivo no tiene extensión .spl: " + archivo.getName());
            System.out.println(archivo);
        }
    }
}