import java.util.Arrays;

public class secondlargest {

	public static void main(String[] args) {
		int[] number={1,4,10,34,2,7};
		Arrays.sort(number);
		System.out.println(number[number.length-2]);
	}

}
