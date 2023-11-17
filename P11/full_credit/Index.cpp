#include "Index.h"

#include <iostream>
#include <string>
#include <map>
#include <set>


void Index::add_word(Word word, std::string filename, int line){
	if(_index.find(word) == _index.end()) return;
	
	Location loc{filename, line};
	Locations.insert(loc);
	//_index.insert({word, Locations.begin()});
}

std::ostream& operator<<(std::ostream& ost, const Index& index){
	for(auto& [Word, Locations] : _index)
		ost << " " << Word << ":";
	for(std::set<Locations>::iterator i = Locations.begin();
	    i != Locations.end(); ++i){
	    	ost << *i << ", ";
	    }
	return ost;  
}
