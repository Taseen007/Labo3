import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



    public class NUmWrdPrinterTest {



        @Test
        public void testEven () {
            NumWordPrinter printer = new NumWordPrinter();
            assertEquals("Even", printer.printWord(4, false));
        }

        @Test
        public void testPrimeEleven () {
            NumWordPrinter printer = new NumWordPrinter();
            assertEquals("PrimeEleven", printer.printWord(11, false));
        }

        @Test
        public void testEvenPrimeEleven () {
            NumWordPrinter printer = new NumWordPrinter();
            assertEquals("EvenPrimeEleven", printer.printWord(22, false));
        }

        @Test
        public void testEvenPrimeLucky () {
            NumWordPrinter printer = new NumWordPrinter();
            assertEquals("EVENPRIMELUCKY", printer.printWord(1430, true)); // 1430 is divisible by 2, 11, and 13
        }

        @Test
        public void testLuckyThirteen () {
            NumWordPrinter printer = new NumWordPrinter();
            assertEquals("LuckyThirteen", printer.printWord(13, false));
        }

        @Test
        public void testOddOneOut () {
            NumWordPrinter printer = new NumWordPrinter();
            assertEquals("OddOneOut", printer.printWord(7, false));
        }
    }


