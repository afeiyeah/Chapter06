package interfacedemo01;

public class Computer {
	//�Խӿ�USB���ͱ�����Ϊcomputer�������
	//����ʹ��ʱ��u�ᱻ��ʼ��ΪUSB�ӿڵ�ʵ����Ķ���
	private USB u;
	
//	public Computer(USB u){
//		this.u=u;
//	}
	public void setU(USB u){
		this.u=u;
	}
	public void useDevice(){
		u.useUSB();
		//���ýӿڵ�Ĭ�Ϸ���
		u.changeVolt();
		//��ӡ�ӿ���ĳ���
		//System.out.println("USB�豸�ĵ�����"+u.flow);
	}
	

}
