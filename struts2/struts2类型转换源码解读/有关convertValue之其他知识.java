import org.apache.struts2.util.StrutsTypeConverter;


public class findClassName {

	public static void main(String[] args) {
		
		Class a=Integer.class;
		Class b=Integer.TYPE;
		Class c=Boolean.TYPE;
		Class toType[]={a,b,c};
		findClassName fcn[]={new findClassName()};
		int it[]={1,2};
		
		System.out.println(toType.getClass());//�����class [Ljava.lang.Class;��
		System.out.println(findClassName.class);//�����class findClassName��
		System.out.println(a);//�����class java.lang.Integer��
		System.out.println(b);//�����int��
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		System.out.println(a.isArray());//���false
		System.out.println(toType.getClass().isArray());//���true
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		System.out.println(toType.getClass().getComponentType());//���class java.lang.Class
		System.out.println(fcn.getClass().getComponentType());//��� class findClassName
		System.out.println(it.getClass().getComponentType());//��� int
		System.out.println(a.getComponentType());//���null
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		//1��class����.isAssignableFrom(Class cls) �ж���"Class����"����ʾ�����ӿ�
		//��ָ����Class����cls������ʾ�����ӿ��Ƿ���ͬ�����Ƿ����䳬���(��)�ӿڣ�
		//������򷵻� true�����򷵻� false��

		//2��instanceof   �������ж�һ������ʵ���Ƿ���һ�����ӿڻ��������ӽӿڵ�ʵ����   
		//��ʽ�ǣ�oo instanceof TypeName 
		Integer j=0;
		System.out.println(j instanceof Integer);//true
		System.out.println(Object.class.isAssignableFrom(Integer.TYPE));//false
		System.out.println(Object.class.isAssignableFrom(Integer.class));//true
	}
}
