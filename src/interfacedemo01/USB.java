package interfacedemo01;

public interface USB {
	//�ӿڵ��еķ�������public��abstract���εķ���
	//����public��abstractĬ�ϱ�ʡ��
	
	void useUSB();
	//JDK8.0�Ժ󣬽ӿ��п�����Ĭ�ϵľ��巽��
	default void changeVolt(){
		System.out.println("Ĭ�ϵ�����ѹ����");
	}
	//�ӿ�������г���
	//ʡ���˹ؼ���public��final��static
	double flow=5;
	//Java���ڵ��̳С�һ������ֻ����һ�����ࡣ�����κ�һ���඼�����ж���ӿ�
	

}
