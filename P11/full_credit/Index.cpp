#include "Index.h"
#include <map>
#include <set>
#include <string>
#include <vector>
#include <iostream>

void Index::add_word(const Word& word, const std::string& filename, int line){
	Location loc(filename, line);
	
	_index[word].insert(loc);
}

std::ostream& operator<<(std::ostream& ost, const Index& index) {
    std::cout << "Index\n=====\n\n" << std::endl;
    
    for(auto &i : Index._index){
    	const Word &word = i.first;
    	const Locations &locations = i.second;
    	
    	ost << " " << word << ":";
    	for(auto l = locations.begin(); l != locations.end(); ++l){
    		ost << *l;
    		if(l != locations.end())
    			ost << ", ";
    	}
    }
    return ost;
}
