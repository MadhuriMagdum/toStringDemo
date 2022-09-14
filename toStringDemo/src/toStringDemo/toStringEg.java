package toStringDemo;


public class toStringEg {
	String nm;
	int rn;

	toStringEg(String nm, int rn) {
		this.nm = nm;
		this.rn = rn;
	}
	@Override
	public String toString() {
		return (nm + rn) ;
	}
	public static void main(String[] args) {
		toStringEg s1=new toStringEg("ram",10);
		toStringEg s2=new toStringEg("shyam",20);
		
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}
}
