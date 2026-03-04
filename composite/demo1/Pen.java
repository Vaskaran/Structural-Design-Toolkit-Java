package composite.demo1;

public class Pen implements Item {

	private final Color color;

	public Pen(Color color) {
		this.color = color;
	}

	@Override
	public double price() {
		return color == Color.BW ? 15 : 30;
//		if (color == Color.BW) {
//			return 15;
//		} else {
//			return 30;
//		}
	}

}
