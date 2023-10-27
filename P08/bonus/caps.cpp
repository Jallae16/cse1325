#include <iostream>
#include <string>
#include <cctype>
#include <cstring>
#include <vector>

int main(int args, char* argv[]){
	std::vector<std::string> caps; //on stack
	std::vector<std::string>* no_caps = new std::vector<std::string>; //on heap
	
	for(int i = 1; i < args; i++){
	    if(isupper(std::string(argv[i]).at(0)))
			caps.push_back(std::string(argv[i]));
		else
			no_caps->push_back(std::string(argv[i]));
	}
	
	std::cout << "Capitalized:\n";
	for(auto v : caps){
	   std::cout << v << std::endl;
	}
	std::cout << "\nLower Case:\n";
	for(auto v : *no_caps){
	   std::cout << v << std::endl;
	}
}
