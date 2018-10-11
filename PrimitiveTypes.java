/* Name : Mayuri Waghmode
 * Date : 8/30/2018 
 * Time : 4:22 PM
 * Purpose : Program to print the size, max_value and min_value for primitive types.
 */
public class PrimitiveTypes {

	public static void main(String[] args) {
		
		System.out.println("Whole Number Types:");
		System.out.println("\n===============================\n");
		System.out.printf("Byte has %d bits. Max value = %d, Min value = %d\n",Byte.SIZE,Byte.MAX_VALUE,Byte.MIN_VALUE);
		System.out.printf("Short has %d bits. Max value = %d, Min value = %d\n",Short.SIZE,Short.MAX_VALUE,Short.MIN_VALUE);
		System.out.printf("Int has %d bits. Max value = %d, Min value = %d\n",Integer.SIZE,Integer.MAX_VALUE,Integer.MIN_VALUE);
		System.out.printf("Long has %d bits. Max value = %d, Min value = %d\n\n\n",Long.SIZE,Long.MAX_VALUE,Long.MIN_VALUE);
		
		System.out.println("Floating-point Number Types:");
		System.out.println("\n===============================\n");
		System.out.printf("Float has %d bits. Max value = %.7E, Min value = %.1E\n",Float.SIZE,Float.MAX_VALUE,Float.MIN_VALUE);
		System.out.printf("Double has %d bits. Max value = %.16E, Min value = %.1E\n\n\n",Double.SIZE,Double.MAX_VALUE,Double.MIN_VALUE);
		
		System.out.println("Charater Type:");
		System.out.println("\n===============================\n");
		System.out.printf("Character has %d bits.\n\n\n",Character.SIZE);
		
		System.out.println("Boolean Type:");
		System.out.println("\n===============================\n");
		System.out.printf("Boolean has two stats: %s and %s",Boolean.FALSE,Boolean.TRUE);
		
	}

}
