package structure;

/** Kiá»ƒu dá»¯ liá»‡u Ä‘á»‘i tÆ°Æ¡ng
 * LÆ°u trÅ© táº­p há»£p cÃ¡c pháº§n tá»­ lÃ  háº±ng sá»‘
 * Sá»‘ lÆ°á»£ng pháº§n tá»­ lÃ  khÃ´ng Ä‘á»•i
 * CÃ¡c pháº§n tá»­ liÃªn quan vá»� ngá»¯ nghÄ©a vá»›i nhau
 * HÃ m khá»Ÿi táº¡o máº·c Ä‘á»‹nh(constructor) thÃ¬ cÃ³ access modifier lÃ  private
 * @author ADMIN
 *
 */
public enum CirclePos {
	//CirclePos ISIDE = new CirlePOS("Trong Ä‘Æ°á»�ng trong");
	INSIDE("Trong đường tròn"),
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	public String value;
	
	CirclePos(String value) {
		this.value=value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
