#include "Shape.h"
#include <iostream>
#include <string>
#include <vector>

class Rectangle : public Shape{
   public:
      Rectangle(double height, double width);
      double area() override;
      std::string name() override;
   private:
      double _height;
      double _width;
};
