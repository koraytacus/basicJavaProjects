
public abstract class Shape {
	
	public String nameOfShape;
	
	public Shape(String nameOfShape) {
		this.nameOfShape = nameOfShape;
	}
	public abstract double area(); 
	public abstract double perimeter();
	
	public String toString() {
		 return "Area of " + this.nameOfShape + " is " + this.area()+" square meters. \n"+
			"Perimeter of " + this.nameOfShape + " is " + this.perimeter()+" meters.";
	}

}
