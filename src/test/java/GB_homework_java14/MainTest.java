package GB_homework_java14;

import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
// Набор тестов для первой задачи
    @Test
    public void getMasTest1(){
        int[] m1 = {0, 1, 2, 4, 0, 5, 6};

        int[] actual1 = Main.getMas(m1);

        int[] expected1 = {0, 5, 6};

        Assertions.assertArrayEquals(expected1, actual1);

    }

    @Test
    public void getMasTest2(){

        int[] m2 = {0, 1, 2, 4, 0, 5, 6, 5, 22, 12};

        int[] actual2 = Main.getMas(m2);

        int[] expected2 = {0, 5, 6, 5, 22, 12};

        Assertions.assertArrayEquals(expected2, actual2);
    }

    @Test
    public void getMasTest3(){

        Assertions.assertThrows(RuntimeException.class, () -> {
            int[] m3 = {0, 1, 2, 5, 0, 5, 6};

            int[] actual3 = Main.getMas(m3);

            int[] expected3 = {0, 5, 6};

            Assertions.assertArrayEquals(expected3, actual3);
        });
    }

    @Test
    public void getMasTest4NotNull(){

        int[] m2 = {0, 1, 2, 4, 0, 5, 6, 5, 22, 12};

        Assertions.assertNotNull(Main.getMas(m2));
    }

    //Набор тестов для второй задачи
    @Test
    public void getMas2Test1() {
        int[] m11 = {1, 1, 1, 1, 1, 1, 1};

        boolean actual = Main.getMas2(m11);
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void getMas2Test2() {
        int[] m22 = {4, 4, 4, 4, 4, 4, 4};

        boolean actual = Main.getMas2(m22);
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void getMas2Test3() {
        int[] m33 = {1, 4, 1, 4, 4, 1, 4};

        boolean actual = Main.getMas2(m33);
        Assertions.assertEquals(true, actual);
    }

    @Test
    public void getMas2Test4() {
        int[] m44 = {1, 1, 4, 4, 3, 4, 4};

        boolean actual = Main.getMas2(m44);
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void getMas2Test5NotNull(){

        int[] m2 = {0, 1, 2, 4, 0, 5, 6, 5, 22, 12};

        Assertions.assertNotNull(Main.getMas(m2));
    }
}
