package structure;
/**
 *  KDL doi tuong
 *  + luu tru tap hop cac phan tu la hang so
 *  + cac phan tu lien quan ve ngu nghia voi nhau
 *  + ham khoi tao mac dinh thi co access modifier la private
 */
public enum CirclePos {
	//CirclePos INSIDE = new CirclePos("trong duong tron");
	INSIDE("trong duong tron"),
	//CirclePos INSIDE = new CirclePos("tren duong tron");
	ONSIDE("tren duong tron"),
	//CirclePos INSIDE = new CirclePos("ngoai duong tron");
	OUTSIDE("ngoai duong tron");
	
	public String value;
	
	CirclePos(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
