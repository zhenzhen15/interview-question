package singleton;

/**
 *���̰߳�ȫ ����ģʽ
 * @author ����
 *
 */
public class Singletong_save_one {
	private static Singletong_save_one instance;
	
	private Singletong_save_one(){}
	
	public static Singletong_save_one getInstance(){
		return instance;
	}
}
