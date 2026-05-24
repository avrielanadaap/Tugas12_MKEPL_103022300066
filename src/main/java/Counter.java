package src.main.java;

public class Counter {
	
 public void badCode() {
    int a = 1;
    int b = 2;
    int c = a + b;
    System.out.println(c);

    int x = 1;
    int y = 2;
    int z = x + y;
    System.out.println(z);
}
	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void increaseBy(int i) {
		count+=i;
	}
	
	public void decrement() {
		count--;
	}
	
	public void decreaseBy(int i) {
		count-=i;
	}
	
	public void multiplyBy(int i){
		count = count * i;
	}
	
	public void triple(){
		int i = 3;
		multiplyBy(i);
	}

	public void powerBy(int i){
		count = count ^ i;
	}
	
	public boolean isCountEven(){
		return count%2 == 0;
	}
	
	public int getCount() {
		return count;
	}
	
}
