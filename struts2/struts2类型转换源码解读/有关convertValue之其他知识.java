import org.apache.struts2.util.StrutsTypeConverter;


public class findClassName {

	public static void main(String[] args) {
		
		Class a=Integer.class;
		Class b=Integer.TYPE;
		Class c=Boolean.TYPE;
		Class toType[]={a,b,c};
		findClassName fcn[]={new findClassName()};
		int it[]={1,2};
		
		System.out.println(toType.getClass());//输出“class [Ljava.lang.Class;”
		System.out.println(findClassName.class);//输出“class findClassName”
		System.out.println(a);//输出“class java.lang.Integer”
		System.out.println(b);//输出“int”
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		System.out.println(a.isArray());//输出false
		System.out.println(toType.getClass().isArray());//输出true
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		System.out.println(toType.getClass().getComponentType());//输出class java.lang.Class
		System.out.println(fcn.getClass().getComponentType());//输出 class findClassName
		System.out.println(it.getClass().getComponentType());//输出 int
		System.out.println(a.getComponentType());//输出null
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		//1、class对象.isAssignableFrom(Class cls) 判定此"Class对象"所表示的类或接口
		//与指定的Class对象“cls”所表示的类或接口是否相同，或是否是其超类或(超)接口，
		//如果是则返回 true，否则返回 false。

		//2、instanceof   是用来判断一个对象实例是否是一个类或接口或其子类子接口的实例。   
		//格式是：oo instanceof TypeName 
		Integer j=0;
		System.out.println(j instanceof Integer);//true
		System.out.println(Object.class.isAssignableFrom(Integer.TYPE));//false
		System.out.println(Object.class.isAssignableFrom(Integer.class));//true
	}
}
