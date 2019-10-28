import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;


class ConsoleTest {

    @Test
    void readFile() {
        FileNotFoundException exception = assertThrows(FileNotFoundException.class, () -> {
            throw new FileNotFoundException("Файл не существует");
        });
        assertEquals("Файл не существует", exception.getMessage());
    }
}