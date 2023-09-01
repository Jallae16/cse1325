enum Color{
	RED(16711680),
	GREEN(65280),
	BLUE(255),
	YELLOW(16776960);
	
	private final int rgb;
	
	private Color(int rgb){
		this.rgb = rgb;
	}
	
	@Override
	public String toString(){
		switch(this){
			case RED:
				return "RED (#" + (Integer.toHexString(rgb)).toUpperCase() + ")";
			case GREEN:
				return "GREEN (#" + (Integer.toHexString(rgb)).toUpperCase() + ")";
			case BLUE: 
				return "BLUE (#" + (Integer.toHexString(rgb)).toUpperCase() + ")";
			case YELLOW:
				return "YELLOW (#" + (Integer.toHexString(rgb)).toUpperCase() + ")";
			default:
				return "ERROR: Incorrect color inserted";
		}
	}
}
