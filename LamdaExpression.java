package SingleExpression;
interface FuncInterface{
	double getValue();
}
public class LamdaExpression {
public static void main(String[] args) {
	FuncInterface fi = ()->123.12;
	System.out.println(fi.getValue());
}
}
