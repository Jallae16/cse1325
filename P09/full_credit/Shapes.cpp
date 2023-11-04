#include "Shapes.h"
#include "Shape.h"
#include "Rectangle.h"
#include "Circle.h"
#include <iostream>
#include <string>
#include <vector>
#include <cmath>

int main(){
	std::vector<Shape*> v;
	Rectangle r(3.4,5.3);
	Circle c(10.0);
	
	v.push_back(&r);
	v.push_back(&c);
	
	for(Shape* a : v){
	   std::cout << a->to_string() << std::endl;
	}
	return 0;
}
