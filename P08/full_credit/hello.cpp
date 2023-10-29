#include <iostream>
#include <string>

int main(int args, char* argv[]){
    
	std::string name;
	std::cout << "what is your name?: ";
	std::getline(std::cin, name);
	std::cout << "Hello " << name << '\n';
}
