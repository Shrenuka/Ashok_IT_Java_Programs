package StringBuffer;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis(); // 8.58.30
		System.out.println(time);
		System.out.println(System.currentTimeMillis());

		StringBuffer sbuff = new StringBuffer("Test");

		for (long i = 0; i < 10000000; i++) {
			sbuff.append("Test123");
		}		
		System.out.println("Time taken to complete iterations by stringbuffer:" + (System.currentTimeMillis() - time) + "ms");

		time = System.currentTimeMillis(); // 8.58.58
		System.out.println(time);
		System.out.println(System.currentTimeMillis());
		
		StringBuilder sbuilder = new StringBuilder("Test");

		for (long i = 0; i < 10000000; i++) {
			sbuilder.append("Test123");

		}		
		System.out.println("Time taken to complete iterations by stringbuilder :" + (System.currentTimeMillis() - time) + "ms");

	}

}
