package structure;

/**
 * 
 * KDL Ä‘á»‘i tÆ°á»£ng
 *	+ LÆ°u trá»¯ táº­p há»£p cÃ¡c pháº§n tá»­ lÃ  háº±ng sá»‘
 *	+ Sá»‘ lÆ°á»£ng pháº§n tá»­ khÃ´ng Ä‘á»•i
 *	+ CÃ¡c pháº§n tá»­ liÃªn quan vá»� ngá»¯ nghÄ©a vá»›i nhau
 *	+ HÃ m khá»Ÿi táº¡o máº·c Ä‘á»‹nh thÃ¬ cÃ³ access modifier lÃ  private
 */

public enum CirclePos {
	// CirclePos INSIDE = new CirclePos("Trong Ä‘Æ°á»�ng trÃ²n");
	// CirclePos INSIDE = new CirclePos("TrÃªn Ä‘Æ°á»�ng trÃ²n");
	// CirclePos INSIDE = new CirclePos("NgoÃ i Ä‘Æ°á»�ng trÃ²n");
	INSIDE("Trong đường trònh"),
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");

	public String string;
	//contructor
	CirclePos(String string) {
		this.string = string;
	}
	
	@Override
	public String toString() {
		return this.string;
	}
	
	
	
}
