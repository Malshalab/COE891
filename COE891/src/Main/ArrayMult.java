package Main;

public class ArrayMult {
	public static int[] mult(int[] array1, int[] array2) {
	    int minlen = Math.min(array1.length, array2.length);
	    
	    int maxlen = Math.max(array1.length, array2.length);
	    int[] outArray = new int[maxlen];

	    for (int i = 0; i < minlen; i++) {
	        outArray[i] = array1[i] * array2[i];
	    }

	    if (array1.length > array2.length) {
	        for (int i = minlen; i < array1.length; i++) {
	            outArray[i] = array1[i];
	        }
	    } else {
	        for (int i = minlen; i < array2.length; i++) {
	            outArray[i] = array2[i];
	        }
	    }

	    return outArray;
	}
}
