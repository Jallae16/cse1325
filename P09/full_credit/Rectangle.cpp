
#include "Rectangle.h"
#include "Shape.h"
#include <iostream>
#include <string>
#include <vector>

Rectangle::Rectangle(double height, double width)
   : _height{height}, _width{width}{ }
double Rectangle::area() {return _height * _width;}
std::string Rectangle::name() {
	return "Rectangle of " + std::to_string(_height) + "x" + std::to_string(_width);
}


