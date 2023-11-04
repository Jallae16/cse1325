#define _USE_MATH_DEFINES

#include "Shape.h"
#include <iostream>
#include <string>
#include <vector>
#include <cmath>

std::string name() {return "Shape";}
double area(){return 0.0;}
std::string to_string(){return std::string(name()) + " with area";}


