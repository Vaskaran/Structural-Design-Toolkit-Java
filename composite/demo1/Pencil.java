package composite.demo1;

public class Pencil implements Item {

	private final Color color;

	public Pencil(Color color) {
		this.color = color;
	}

	@Override
	public double price() {
		return color == Color.BW ? 2.5 : 10;
//		if (color == Color.BW) {
//			return 2.5;
//		} else {
//			return 10;
//		}
	}

}
