#include "Index.h"
#include <map>
#include <set>
#include <string>
#include <vector>
#include <iostream>

void Index::add_word(const Word& word, const std::string& filename, int line){
	Location loc(filename, line);
	if(_index.find(word) == _index.end())
		_index[word].insert(loc);
	_index[word].insert(loc);
}

std::ostream& operator<<(std::ostream& ost, const Index& index){
    std::cout << "Index\n=====" << std::endl;
    
    for(auto &i : index._index){
    	const Word &word = i.first;
    	const Locations &locations = i.second;
    	
    	ost << "\n" << word << ":";
    	for(auto l = locations.begin(); l != locations.end(); ++l){
    		ost << *l;
    		if(l != locations.end())
    			ost << ", ";
    	}
    }
    return ost;
}
inline bool Location::operator==(const Location& location)const{ 
	return this->_filename == location._filename && this->_line == location._line;
}
inline bool Location::operator<(const Location& location)const{ 
	if(_filename < location._filename) return true;
	if(_filename == location._filename && _line < location._line) return true;
	return false;
}
inline bool Location::operator!=(const Location& location)const{ 
	return !(*this == location);
}
inline bool Location::operator<=(const Location& location)const{ 
	return *this < location || *this == location;
}
inline bool Location::operator> (const Location& location)const{ 
	return !(*this <= location);
}
inline bool Location::operator>=(const Location& location)const{ 
	return !(*this < location);
}

