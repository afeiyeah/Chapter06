package abstractdemo01;

public class Column {
	private int height;
	private Shape s;
	
	public void setHeight(int height){
		this.height=height;
	}
	public void setShape(Shape s){
		this.s=s;
	}
	public double calVolumn(){
		double vol=s.calArea()*height;
		return vol;
	}
	public void showInfo(){
		System.out.println("����ĸ߶���"+height);
		System.out.println("����ĵ�����Ϣ�ǣ�");
		s.showInfo();
		System.out.println("����������"+calVolumn());
	}

}
