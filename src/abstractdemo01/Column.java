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
		System.out.println("柱体的高度是"+height);
		System.out.println("柱体的底面信息是：");
		s.showInfo();
		System.out.println("柱体的体积是"+calVolumn());
	}

}
