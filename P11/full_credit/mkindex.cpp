#include <iostream>
#include <fstream>
#include <map>
#include <set>
#include <string>
#include "Index.h"

int main(int argc, char* argv[]){
    if (argc < 2) {
        std::cout << "Usage: " << argv[0] << " <filename1> <filename2>......\n" << std::endl;
        return -1;
    }

    Index index;

    for (int i = 1; i < argc; ++i){
        std::ifstream ist(argv[i]);
        if (!ist.is_open()) {
            std::cout << "Error: Couldn't open file " << argv[i] << std::endl;
            return -1;
        }
        std::string line;
        int lineNumber = 1;
        while (std::getline(ist, line)){
            std::istringstream iss(line);
            std::string word;

            while (iss >> word){
                std::string new_word;
                for (auto w : word) {
					new_word += std::tolower(w);
				}
				if(!std::isalnum(new_word.front()))
					new_word.erase(0,1);
				if(!std::isalnum(new_word.back()))
					new_word.pop_back();
                if (!new_word.empty()) {
                    index.add_word(new_word, argv[i], lineNumber);
                }
            }
            ++lineNumber;
        }
        ist.close();
    }
    std::cout << index << "\n";

    return 0;
}
