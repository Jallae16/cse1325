
#include <iostream>
#include <string>
#include <vector>

class Rectangle : public Shape{
   public:
      Rectangle(double height, double width);
      double area();
      std::string name();
   private:
      double _height;
      double _width;
};
