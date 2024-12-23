package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

// autowiring by type
//	@Autowired
//	@Qualifier("rectangle")  // shape = new Rectangle();
	private IShape shape;

	@Autowired // shape = new Triangle()
	public void setShape(@Qualifier("triangle") IShape shape) {
		this.shape = shape;
	}

	// autowiring by name
	// instnace variable name and bean name are same
	@Autowired
	private IShape square; // square = new Square();

	// autowiring by constr
	private IShape nshape; // nshape = new Rectangle();

	public ShapeFactory(@Qualifier("rectangle") IShape nshape) {
		super();
		this.nshape = nshape;
	}

	public void printArea(String choice, double x, double y) {
		System.out.println("calculating");
		if (choice.equals("t"))
			shape.area(x, y);
		if (choice.equals("s"))
			square.area(x, y);
		if (choice.equals("r"))
			nshape.area(x, y);

	}
}
