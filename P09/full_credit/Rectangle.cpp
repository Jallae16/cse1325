#include "Rectangle.h"
#include <iostream>
#include <string>
#include <vector>

class Rectange : public Shape{
   public:
      Rectangle(double height, double width)
         : _height(height), _width(width){}
      double area() override {return _height * _width;}
      std::string name() override {return "Rectangle";}
}
