package composite.demo2.client;

import java.awt.*;
import java.awt.event.*;

class CustomWindowAdapter extends WindowAdapter {

	private final Frame frame;

	CustomWindowAdapter(Frame frame) {
		this.frame = frame;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// Release resources
		frame.dispose();
		// Trigger shutdown
		System.exit(0);
	}
}

class CompositeDemo2Alternative {

	public static void main(String[] args) {

		// Leaf objects
		Component button = new Button("Button (Sample)");
		Component label = new Label("Testing built-in composites");

		// Composite object- consists of two leaf objects
		Panel panel = new Panel(); // default FlowLayout

		// Beautification(optional):2 rows, 1 column
		panel.setLayout(new GridLayout(2, 1));
		panel.add(label); // Placing the label in the first row
		panel.add(button); // Placing the button in the second row

//        panel.setLayout(new BorderLayout());
//        panel.add(label, BorderLayout.NORTH);
//        panel.add(button, BorderLayout.SOUTH);

		// Top-level container (also a composite)
		Frame frame = new Frame("Composite Pattern Demo");
		frame.add(panel); // add panel to frame
		frame.setSize(300, 200);
		// Making the frame visible
		frame.setVisible(true);

//       // Using WindowListener to close the window
//        frame.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//            	// Release resources
//                frame.dispose();
//                // Trigger shutdown
//                System.exit(0); 
//            }
//        });
		// Explicitly using a subclass of WindowAdapter
		frame.addWindowListener(new CustomWindowAdapter(frame));
	}
}