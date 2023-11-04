#define _USE_MATH_DEFINES


#include <iostream>
#include <string>
#include <vector>
#include <cmath>

class Circle : public Shape{
	public:
	   Circle(double radius);
	   double area();
	   std::string name();
	private:
	   double _radius;
};
