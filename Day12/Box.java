package Day12;

public class Box {
//   Example of constructor overloading
	double width, height, depth;
	
	Box(){
		width=height=depth=0;
	}
	
	Box(double w, double h, double d){
		width = w;
		height=h;
		depth=d;
	}
	
	Box(double len){
		width=height=depth=len;
	}
	
	double volume() {
		return (width*height*depth);
	}
}
