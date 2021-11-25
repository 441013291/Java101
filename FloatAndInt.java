public class FloatAndInt {
    static float add(float x , int y){
        return x + y ;
    }
    static float dif(float x , int y){
        return x/y ;
    }
    static float multi (float x , int y){
        return x * y;
    }
	public static void main(String[] args) {
	System.out.println(add(10.5f,10));
	System.out.println(dif(10.3f,2));
	System.out.println(multi(10,3));
	}
}
