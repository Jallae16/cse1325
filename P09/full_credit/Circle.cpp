#define _USE_MATH_DEFINES

#include "Circle.h"
#include <iostream>
#include <string>
#include <vector>
#include <cmath>

class Circle : public Shape{
	public:
	   Circle(double radius)
	      : _radius(radius) {}
	   double area() override {return M_PI * _radius * _radius;}
	   double name() override {return "Circle";}
}
