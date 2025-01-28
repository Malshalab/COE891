package Test;


import Main.ArrayMult;
import static org.junit.Assert.*;
import org.junit.Test;


public class ArrayMultTest {

	@Test
	public void testMul() {
		assertArrayEquals(new int[] {5,12,3,4}, ArrayMult.mult(new int[] {1,2,3,4}, new int[] {5,6})) ;
		assertArrayEquals(new int[] {21}, ArrayMult.mult(new int[] {7}, new int[] {3})) ;
		assertArrayEquals(new int[] {4}, ArrayMult.mult(new int[] {4}, new int[] {})) ;
		assertArrayEquals(new int[] {7,16,3,4}, ArrayMult.mult(new int[] {7,8}, new int[] {1,2,3,4})) ;
		assertArrayEquals(new int[] {}, ArrayMult.mult(new int[] {}, new int[] {})) ;
		assertArrayEquals(new int[] {0,0,0}, ArrayMult.mult(new int[] {0,0,0}, new int[] {0,0,0})) ;


	}

}
