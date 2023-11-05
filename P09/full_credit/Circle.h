#define _USE_MATH_DEFINES

#include "Shape.h"
#include <iostream>
#include <string>
#include <vector>
#include <cmath>

class Circle : public Shape {
	public:
	   Circle(double radius);
	   double area() override;
	   std::string name() override;
	private:
	   double _radius;
};
