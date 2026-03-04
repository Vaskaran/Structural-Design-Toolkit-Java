package composite.demo1.client;

import composite.demo1.Color;
import composite.demo1.GiftPack;
import composite.demo1.Pen;
import composite.demo1.Pencil;

class CompositeDemo1 {

	public static void main(String[] args) {

		Pen pen = new Pen(Color.BW);
		System.out.println("The bw pen's cost is $" + pen.price());
		pen = new Pen(Color.COLORED);
		System.out.println("The color pen's cost is $" + pen.price());
		System.out.println("----------------");

		Pencil pencil = new Pencil(Color.BW);
		System.out.println("The bw pencil's cost is $" + pencil.price());
		pencil = new Pencil(Color.COLORED);
		System.out.println("The color pencil's cost is $" + pencil.price());
		System.out.println("----------------");

		GiftPack bwGiftPack = new GiftPack();
		bwGiftPack.add(new Pen(Color.BW));
		bwGiftPack.add(new Pencil(Color.BW));		
		System.out.println("A gift pack with a bw pen and a bw pencil costs $" + bwGiftPack.price());		
		System.out.println("----------------");		
		
		GiftPack bigGiftPack = new GiftPack();
		bigGiftPack.add(bwGiftPack);
		bigGiftPack.add(new Pen(Color.COLORED));
		bigGiftPack.add(new Pencil(Color.COLORED));
		System.out.println("A gift pack with a bw gift pack, a colored pen and a colored pencil costs $" + bigGiftPack.price());

	}

}
