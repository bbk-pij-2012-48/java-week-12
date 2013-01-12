public class Comparator {
	public static <T extends Comparable<T>> T getMax(T a,T b) {
		if (a.compareTo(b) > 0) {
			return a;
		} else return b;
	}
	
	public static void main(String[] args) {
		System.out.println(getMax(12,15));
		System.out.println(getMax(12.34,123.45));
		System.out.println(getMax("23","65"));
	}
}

