#define _USE_MATH_DEFINES

#include "Circle.h"
#include "Shape.h"
#include <iostream>
#include <string>
#include <vector>
#include <cmath>
Circle::Circle(double radius)
	: _radius{radius} { }
double Circle::area() {return M_PI * _radius * _radius;}
std::string Circle::name() {return "Circle";}

