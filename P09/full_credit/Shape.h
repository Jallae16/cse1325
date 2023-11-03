#define _USE_MATH_DEFINES

#include <iostream>
#include <string>
#include <vector>
#include <cmath>

class Shape{
   public:
      virtual std::string name();
      virtual double area();
      std::string to_string();
}

