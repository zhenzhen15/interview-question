package singleton;

/**
 * ���߳�ͬ������ģʽ
 * @author ����
 *
 */
public class Singleton_save_two {
	private static Singleton_save_two instance;
	
	private Singleton_save_two(){}
	
	public static synchronized Singleton_save_two getInstance(){
		instance = new Singleton_save_two();
		return instance;
	}
}
