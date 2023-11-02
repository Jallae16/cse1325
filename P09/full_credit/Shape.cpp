#include <iostream>
#include <string>
#include <vector>
#include <math>

class Shape{
   public:
      std::string name() {return "Shape";}
      double area(){return 0.0;}
      std::string to_string(){return std::string(name()) + " with area";}
}
