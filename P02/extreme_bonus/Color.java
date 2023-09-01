enum Color{
	RED(16711680),
	GREEN(65280),
	BLUE(255),
	YELLOW(16776960);
	
	private final int RGB;
	
	private final String ANSI_NORMAL_COLOR = "\u001B[0m";
	private final String ANSI_RED = "\u001B[31m";
	private final String ANSI_GREEN = "\u001B[32m";
	private final String ANSI_BLUE = "\u001B[34m";
	private final String ANSI_BRIGHT_YELLOW = "\u001B[93m";

	
	private Color(int RGB){
		this.RGB = RGB;
	}
	
	@Override
	public String toString(){
		switch(this){
			case RED:
				return "RED (" + 
				ANSI_RED + "#" + (Integer.toHexString(RGB)).toUpperCase() + 
				ANSI_NORMAL_COLOR + ")";
			case GREEN:
				return"GREEN (" + 
				ANSI_GREEN + "#" + (Integer.toHexString(RGB)).toUpperCase() + 
				ANSI_NORMAL_COLOR + ")";
			case BLUE: 
				return "BLUE (" + 
				ANSI_BLUE + "#" + (Integer.toHexString(RGB)).toUpperCase() + 
				ANSI_NORMAL_COLOR + ")";
			case YELLOW:
				return "YELLOW (" + 
				ANSI_BRIGHT_YELLOW + "#" + (Integer.toHexString(RGB)).toUpperCase() + 
				ANSI_NORMAL_COLOR + ")";
			default:
				return "ERROR: Incorrect color inserted";
		}
	}
}
