#include "Shapes.h"
#include <iostream>
#include <string>
#include <vector>
#include <cmath>

int main(){
	std::vector<Shape> v = new vector<Shape>{};
	Shape r(30);
	Shape c(10,30);
	
	v.push_back(r);
	v.push_back(c);
	
	for(auto a : v){
	   std::cout << a << std::endl;
	}
	//delete(v);
}
