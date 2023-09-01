enum Color{
	RED(0xFF0000),
	GREEN(0x00FF00),
	BLUE(0x0000FF),
	YELLOW(0xFFFF00);


	private final int rbg;

	private Color(int rbg){
		this.rbg = rbg;
	}

	@Override
	public String toString(){
		return " " + this.name + " " + rbg + " ";
	}
}
