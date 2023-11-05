#define _USE_MATH_DEFINES

#include "Shape.h"
#include <iostream>
#include <string>
#include <vector>
#include <cmath>

std::string Shape::name() {return "Shape";}
double Shape::area(){return 0.0;}
std::string Shape::to_string(){
	return std::string(name()) + " with area " + std::to_string(area());
}


