package Factory.entity;
/**
 * ���󹤳� ģʽ
 * ���󹤳�--�����幤��
 * ������--����������--��������
 * ���幤�� ��Ӧ��������� 
 */
//���������� 
public abstract class Factory_abstract {
	public abstract BBC creatBMW(String rang);
}
//320����������
class Factory_320 extends Factory_abstract{
	public BBC creatBMW(String rang) {
		switch(rang) {
		case "320_high":
			return new BBC_320_high();
		case "320_low":
			return new BBC_320_low(); 
		default:
			break;
		}
		return null;
	}
}
//532����������
class Factory_532 extends Factory_abstract{
	@Override
	public Factory.entity.BBC creatBMW(String rang) {
		switch (rang) {
		case "532_high":
			return new BBC_532_high();
		case "532_low":	
			return new BBC_532_low(); 
		default:
			break;
		}
		return null;
	}
}
//���۽ӿ�
interface BBC{
	public void createBBC();
}
//320���۳�����
abstract class BBC_320 implements BBC{
	abstract public void createBBC();
	abstract public String rang(); 
}
//320���۸��������
class BBC_320_high extends BBC_320{
	@Override
	public String rang() {
		return "high";
	}

	@Override
	public void createBBC() {
		System.out.println("create 320 high");
	}
}
//320���������
class BBC_320_low extends BBC_320{
	@Override
	public String rang() {
		return "low";
	}

	@Override
	public void createBBC() {
		System.out.println("create 320 low");
	}
}
//532������
abstract class BBC_532 implements BBC{
	abstract public void createBBC();
	abstract public String rang();
}
//532����
class BBC_532_high extends BBC_532{
	@Override
	public String rang() {
		return  "high";
	}

	@Override
	public void createBBC() {
		System.out.println("create 532 high");
	}
}
//532����
class BBC_532_low extends BBC_532{
	@Override
	public String rang() {
		return "low";
		
	}

	@Override
	public void createBBC() {
		System.out.println("create 532 low");
	}
}


